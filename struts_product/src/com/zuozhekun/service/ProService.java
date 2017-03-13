package com.zuozhekun.service;

import java.util.List;

import com.zuozhekun.entity.ProInfo;

public interface ProService {
	public List<ProInfo> getAllPro();
	
	public void delPro(int producId);
	
	public void addPro(int producId,String productName,int qty);
	
	public ProInfo allPro(int ProductId);
	
	public void updateUser(ProInfo info);
}
