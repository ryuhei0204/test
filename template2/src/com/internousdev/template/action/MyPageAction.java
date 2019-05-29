package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	public String deleteFlg;
	private String result;
	public String execute() throws SQLException{
		MyPageDAO myPageDAO=new MyPageDAO();
		MyPageDTO myPageDTO=new MyPageDTO();

		//商品履歴を削除しない場合
		if(deleteFlg==null){
			//確認するための文
			//"item_transaction_id"(購入した商品番号)＝"id"(商品番号)LoginActionにてsession.put
			//"user_master_id"(購入者ID)="login_user_id”(ユーザーのログインID)LoginActionにてsession.put
			String item_transaction_id=session.get("id").toString();
			String user_master_id=session.get("login_user_id").toString();

			//myPageDAOから MyPageUserInfoを呼び出し
			//keyはmyPage.jspと同じでなければいけない
			myPageDTO=myPageDAO.getMyPageUserInfo(item_transaction_id,user_master_id);
			session.put("buyItem_name",myPageDTO.getItemName());
			session.put("total_price",myPageDTO.getTotalPrice());
			session.put("total_count",myPageDTO.getTotalCount());
			session.put("total_payment",myPageDTO.getPayment());
			session.put("message","");

		//商品履歴を削除する場合
		}else if(deleteFlg.equals("1")){
			delete();
		}
		result=SUCCESS;
		return result;
		}
	public void delete()throws SQLException{
		MyPageDAO myPageDAO=new MyPageDAO();

        //確認するための文
		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();

		//myPageDAOから buyItemHistoryDeleteを呼び出し
		int res=myPageDAO.buyItemHistoryDelete(item_transaction_id,user_master_id);
		//呼び出した item_trasaction_id,user_master_idが0以上なら(空でなければ)
		if(res>0){
			session.put("message", "商品情報を正しく削除しました。");
		//=0であれば
		}else if(res==0){
			session.put("message","商品情報の削除に失敗しました。");
		}
	}
	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
	@Override
	public void setSession(Map<String,Object>loginSessionMap){
		this.session=loginSessionMap;
	}


}
