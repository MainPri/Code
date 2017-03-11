package com.hp.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	public String allEmp() throws Exception {
		System.out.println("查询所有的员工");
		return "allemp";
	}
	
	public String addEmp() throws Exception {
		System.out.println("新增员工");
		
		return "allemp";
	}
}
