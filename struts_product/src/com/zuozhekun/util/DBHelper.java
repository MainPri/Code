package com.zuozhekun.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zuozhekun.entity.ProInfo;

public class DBHelper {
	private static final String drive="oracle.jdbc.OracleDriver";
	private static final String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String name="scott";
	private static final String pwd="admin";
	public static Connection getConnection(){
		try {
			Class.forName(drive);
			return DriverManager.getConnection(url, name, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static ResultSet executeQuery(String sql,Object...args){
		Connection conn=getConnection();
		PreparedStatement pre=null;
		try {
			pre=conn.prepareStatement(sql);
			if(args.length>0){
				for (int i = 0; i < args.length; i++) {
					pre.setObject(i+1, args[i]);
				}
			}
			return pre.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void executeUpdate(String sql,Object...args){
		Connection conn=getConnection();
		PreparedStatement pre=null;		
		try {
			pre=conn.prepareStatement(sql);
			if(args.length>0){
				for (int i = 0; i < args.length; i++) {
					pre.setObject(i+1, args[i]);
				}
			}
			pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		ResultSet rs=DBHelper.executeQuery("select * from product where producId=?",1);
		try {
			while (rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
