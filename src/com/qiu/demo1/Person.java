package com.qiu.demo1;
/**
 * ����һ������
 * 
 * ���ԣ�name��age
 * 
 * ������getup,play,sleep;
 *
 */
public class Person {
	
	//����
	
	private String name = "";
	private int age = 0;
	
	// ���췽��
	
	/**
	 * �޲ι���
	 */
	public Person(){
		super();
	}
	
	/**
	 * �вι���
	 */
	public Person(String name, int age){
		super();
		this.name = name;
		this.age = age;	
	}
	
	//��ͨ����
	
	public void getup(){
		
		System.out.println(getName()+",����");
	}
	
	public void play(){
		
		System.out.println(getName()+",�ڴ���Ϸ");
	}
	
	public void sleep(){
		
		System.out.println(getName()+",˯����");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}


}
