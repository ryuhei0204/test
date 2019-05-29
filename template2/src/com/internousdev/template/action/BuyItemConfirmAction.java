package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;
	public String execute() throws SQLException{
		BuyItemCompleteDAO buyItemCompleteDAO=new BuyItemCompleteDAO();

		//"id","login_user_id"はLoginAction "buyItem_price","stock","pay"はBuyItemActionでsession.putしている
		//buyItem_priceはBuyItemActionにて上書きされたため"intStock*intPrice"になる
		buyItemCompleteDAO.buyItemInfo(
				session.get("id").toString(),
				session.get("login_user_id").toString(),
				session.get("buyItem_price").toString(),
				session.get("stock").toString(),
				session.get("pay").toString());

		String result=SUCCESS;
		return result;
	}

	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}


}
