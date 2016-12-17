package com.qiu.demo1;

public class Student extends Person{
	
	//����
	
	private String id = "";
	
	//���췽��
	/**
	 * �̳���Person�Ĺ���
	 */
	public Student(String name, int age){
		
		super(name,age);
	}
	
	/**
	 * ��Person�ļ̳��ϣ�������Լ��Ĳ����Ĺ��췽��
	 */
	
	public Student(String name, int age, String id){
		super(name,age);
		this.id = id;
	}
	
	//��ͨ����
	public void intro(){
		System.out.println("name:"+getName()+",age:"+getAge()
				           +",ѧ��:"+getId());
	}
	
	public void study(){
		
		System.out.println(getName()+",ѧϰ��");
	}
	
	//getter,setter
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}

}
