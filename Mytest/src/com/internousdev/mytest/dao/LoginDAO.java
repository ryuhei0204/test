package com.internousdev.mytest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.mytest.util.DBConnector;

public class LoginDAO {

	private boolean userExist;

	// ログイン
	public boolean loginInfo(String loginUser, String loginPassword) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "select login_id, user_name, login_pass from login_user_db where (login_id = ? or user_name = ?) and login_pass = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginUser);
			ps.setString(2, loginUser);
			ps.setString(3, loginPassword);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				userExist = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userExist;
	}

	// ユーザー登録
	public int CreateInfo(String sei, String mei, String seikana, String meikana, String mail, int seibetu,
			String userName, String userId, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "insert into login_user_db(login_id, login_pass, user_name, email, family_name, first_name, family_name_kana, first_name_kana,sex, insert_date, updated_date)values(?,?,?,?,?,?,?,?,?,now(),now())";
		int count = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ps.setString(3, userName);
			ps.setString(4, mail);
			ps.setString(5, sei);
			ps.setString(6, mei);
			ps.setString(7, seikana);
			ps.setString(8, meikana);
			ps.setInt(9, seibetu);

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	public int ContactInfo(String conname, String conmail, String contel, String title, String contents) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "insert into contact_form(contact_name,contact_mail,contact_tel,title,contents,insert_date,updated_date)value(?,?,?,?,?,now(),now())";
		int count = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, conname);
			ps.setString(2, conmail);
			ps.setString(3, contel);
			ps.setString(4, title);
			ps.setString(5, contents);

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

}
