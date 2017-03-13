package com.zuozhekun.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zuozhekun.entity.ProInfo;
import com.zuozhekun.service.ProService;
import com.zuozhekun.service.impl.ProServiceImpl;

public class ProAction extends ActionSupport{
	private ProService pro=new ProServiceImpl();
	private ProInfo info;
	private List<ProInfo> infos;
	private int ProductId;
	private int producId;
	private String productName;
	private int qty;
	/*
	 * 查询
	 * */
	public String all() throws Exception {
		infos=pro.getAllPro();
		for (ProInfo info : infos) {
			System.out.println(info.getProductId()+info.getProductName()+info.getQty());
		}		
		return "allPro";
	}
	/*
	 * 删除
	 * */
	public String del() throws Exception {
		pro.delPro(ProductId);
		return all();
	}
	/*
	 * 添加
	 * */
	public String add() throws Exception {
		pro.addPro(producId, productName, qty);
		return all();
	}
	/*
	 * 修改
	 * */
	public String select() throws Exception {
		info=pro.allPro(ProductId);
		return "updatePro";
	}	
	
	public String update() throws Exception {
		pro.updateUser(info);
		return all();
	}	
	
	/*
	 * 封装类
	 * */
	
	public int getProducId() {
		return producId;
	}
	public ProInfo getInfo() {
		return info;
	}
	public void setInfo(ProInfo info) {
		this.info = info;
	}
	public void setProducId(int producId) {
		this.producId = producId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int ProductId) {
		this.ProductId = ProductId;
	}
	public List<ProInfo> getInfos() {
		return infos;
	}
	public void setInfos(List<ProInfo> infos) {
		this.infos = infos;
	}
	
}
