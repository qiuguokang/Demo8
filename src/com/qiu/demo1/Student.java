package com.qiu.demo1;

public class Student extends Person{
	
	//属性
	
	private String id = "";
	
	//构造方法
	/**
	 * 继承自Person的构造
	 */
	public Student(String name, int age){
		
		super(name,age);
	}
	
	/**
	 * 在Person的继承上，添加了自己的参数的构造方法
	 */
	
	public Student(String name, int age, String id){
		super(name,age);
		this.id = id;
	}
	
	//普通方法
	public void intro(){
		System.out.println("name:"+getName()+",age:"+getAge()
				           +",学号:"+getId());
	}
	
	public void study(){
		
		System.out.println(getName()+",学习中");
	}
	
	//getter,setter
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}

}
