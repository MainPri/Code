package com.zuozhekun.service.impl;

import java.util.List;

import com.zuozhekun.dao.ProDao;
import com.zuozhekun.dao.impl.ProDaoImpl;
import com.zuozhekun.entity.ProInfo;
import com.zuozhekun.service.ProService;

public class ProServiceImpl implements ProService{
	private ProDao dao=new ProDaoImpl();
	@Override
	public List<ProInfo> getAllPro() {	
		return dao.getAllPro();
	}
	@Override
	public void delPro(int producId) {
		dao.delPro(producId);
	}
	@Override
	public void addPro(int producId, String productName, int qty) {
		dao.addPro(producId, productName, qty);
	}
	@Override
	public ProInfo allPro(int ProductId) {
		return dao.allPro(ProductId);
	}
	@Override
	public void updateUser(ProInfo info) {
		dao.updateUser(info);
	}
}
