package com.internousdev.teamtest.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.teamtest.util.DBConnector;
import com.internousdev.teamtest.util.DateUtil;

public class UserInfoDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil du = new DateUtil();
	private String  sql = "INSERT INTO user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES(?,?,?,?,?,?,?,?,?)";

	public void userInfo(String sei, String mei, String seikana, String meikana, String seibetu, String mail, String userId, String password){
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ps.setString(3, sei);
			ps.setString(4, mei);
			ps.setString(5, seikana);
			ps.setString(6, meikana);
			ps.setString(7, seibetu);
			ps.setString(8, mail);
			ps.setString(9, du.getDate());

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}


}
