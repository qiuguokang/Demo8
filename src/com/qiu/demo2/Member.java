package com.qiu.demo2;

/*
 * ����һ�����࣬������������Ĺ������Ժͷ���
 * 
 * ���ԣ�name offer
 * 
 * ������startWork,doWork,endWork
 */
public class Member {
	
	//��̬����
	public static final String OFFER_BOSS = "�ϰ�";
	public static final String OFFER_MANAGER = "����";
	public static final String OFFER_WORKER = "Ա��";
	
	//����
	private String name = "";
	private String offer = "";
	
	//���췽��
	
	public Member(String name, String offer){
		this.name = name;
		this.offer = offer;	
	}

}
