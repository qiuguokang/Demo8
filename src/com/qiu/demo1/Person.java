package com.qiu.demo1;
/**
 * 创建一个父类
 * 
 * 属性：name，age
 * 
 * 方法：getup,play,sleep;
 *
 */
public class Person {
	
	//属性
	
	private String name = "";
	private int age = 0;
	
	// 构造方法
	
	/**
	 * 无参构造
	 */
	public Person(){
		super();
	}
	
	/**
	 * 有参构造
	 */
	public Person(String name, int age){
		super();
		this.name = name;
		this.age = age;	
	}
	
	//普通方法
	
	public void getup(){
		
		System.out.println(getName()+",起床了");
	}
	
	public void play(){
		
		System.out.println(getName()+",在打游戏");
	}
	
	public void sleep(){
		
		System.out.println(getName()+",睡觉了");
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
