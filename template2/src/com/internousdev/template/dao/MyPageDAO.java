package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {
	//購入時の処理
	//item_transaction_id=商品番号(今回は１つだけしかないので１、user_master_id=購入者のID loginUserId
	public MyPageDTO getMyPageUserInfo(String item_transaction_id,String user_master_id)
	throws SQLException{
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		MyPageDTO myPageDTO=new MyPageDTO();
		//誰が何を買ったのかを分かるようにするための文 テーブル結合
		//SELECT 照合させたいカラム FROM テーブルA テーブルA変数 LEFT JOIN テーブルB テーブルB変数 ON 結合条件 WHERE 検索条件 ORDER BY 時間カラム DESC(降順)
		//*結合条件 商品番号＝購入者の商品番号      検索条件 購入者の商品番号は？ 購入者のIDは？
		String sql="SELECT iit.item_name,ubit.total_price,ubit.total_count,ubit.pay FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id=iit.id WHERE ubit.item_transaction_id=? AND ubit.user_master_id=? ORDER BY ubit.insert_date DESC";

		try{
			//?の中に入る
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,item_transaction_id);
			preparedStatement.setString(2, user_master_id);
			ResultSet resultSet=preparedStatement.executeQuery();

			//DTOに格納する文
			if(resultSet.next()){
				myPageDTO.setItemName(resultSet.getString("item_name"));
				myPageDTO.setTotalPrice(resultSet.getString("total_price"));
				myPageDTO.setTotalCount(resultSet.getString("total_count"));
				myPageDTO.setPayment(resultSet.getString("pay"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return myPageDTO;
	}

	//キャンセル時の処理
	//buyItemHistoryDeleteの作成
	public int buyItemHistoryDelete(String item_transaction_id,String user_master_id)
	throws SQLException{
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();

		//購入した商品番号と購入者のIDは？
		String sql="DELETE FROM user_buy_item_transaction WHERE item_transaction_id=? AND user_master_id=?";
		PreparedStatement preparedStatement;
		int result=0;

		try{
			//?の中に入る
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);

			result=preparedStatement.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}


}
