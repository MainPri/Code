package com.zuozhekun.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zuozhekun.dao.ProDao;
import com.zuozhekun.entity.ProInfo;
import com.zuozhekun.util.DBHelper;

public class ProDaoImpl implements ProDao{
	
	@Override
	public List<ProInfo> getAllPro() {
		List<ProInfo> infos=new ArrayList<ProInfo>();
		ResultSet rs=DBHelper.executeQuery("select * from product");
		try {
			while (rs.next()) {
				infos.add(new ProInfo(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infos;
	}

	@Override
	public void delPro(int producId) {
		DBHelper.executeUpdate("delete from product where producId=?", producId);
	}

	@Override
	public void addPro(int producId, String productName, int qty) {
		DBHelper.executeUpdate("insert into product values(?,?,?)", producId,productName,qty);
	}

	@Override
	public ProInfo allPro(int ProductId) {
		ProInfo info=new ProInfo();
		ResultSet rs=DBHelper.executeQuery("select producId,productName,qty from product where producId=?", ProductId);
		try {
			while (rs.next()) {
				info.setProductId(rs.getInt(1));
				info.setProductName(rs.getString(2));
				info.setQty(rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return info;
	}

	public void updateUser(ProInfo info) {
		DBHelper.executeQuery("update product set productName=?,qty=? where producId=?",info.getProductName(),info.getQty(),info.getProductId());
	}	
}
