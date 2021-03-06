package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

	//"getLoginUserInfo"というメソッドを作成
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		LoginDTO loginDTO=new LoginDTO();

//login_user_transaction(テーブル名）から login_id(カラム名）？とlogin_pass(カラム名)？を取得
		String sql="SELECT*FROM login_user_transaction where login_id=? AND login_pass=?";
		try{
			//sql文を実行するための準備
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			//sql文の？に挿入できる
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			//sql文を実行するために必要な文
			ResultSet resultSet =preparedStatement.executeQuery();

            //DTOに格納するための文
			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));
              //DTO名.setDTOで設定したインスタンス変数(resultSet.getString("SQLのカラム名"));

				//ログインしているかチェックするための文
				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);

				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return loginDTO;

	}

}
