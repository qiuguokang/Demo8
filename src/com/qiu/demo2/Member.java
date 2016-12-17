package com.qiu.demo2;

/*
 * 创建一个父类，包含所有子类的共有属性和方法
 * 
 * 属性：name offer
 * 
 * 方法：startWork,doWork,endWork
 */
public class Member {
	
	//静态常量
	public static final String OFFER_BOSS = "老板";
	public static final String OFFER_MANAGER = "经理";
	public static final String OFFER_WORKER = "员工";
	
	//属性
	private String name = "";
	private String offer = "";
	
	//构造方法
	
	public Member(String name, String offer){
		this.name = name;
		this.offer = offer;	
	}

}
