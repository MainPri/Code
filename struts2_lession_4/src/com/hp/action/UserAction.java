package com.hp.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	public String allEmp() throws Exception {
		System.out.println("��ѯ���е�Ա��");
		return "allemp";
	}
	
	public String addEmp() throws Exception {
		System.out.println("����Ա��");
		
		return "allemp";
	}
}
