package com.qiu.demo;

/**
 * 研究继承关系
 * 
 * 写一个父类
 * 
 * 提出所有子类的共性属性和方法
 *  1）公有的属性
 *    1）名字name,
 *    2） 年龄age;
 *  2）公有的方法
 *    1）intro自我介绍
 *    2）起床getup,工作work,娱乐play,睡觉sleep,
 *
 */
public class Member {
	
	//属性
	//静态常量
	public static final String ROLE_GRANDPA = "grandpa";
	public static final String ROLE_GRANDMA = "grandma";
	public static final String ROLE_FATHER = "father";
	public static final String ROLE_MOTHER = "mother";
	public static final String ROLE_BABY = "baby";
	//动态变量
	private String name = "";
	private int age = 0;
	private String role = "";
	
	//构造方法
	
	/**
	 * 无参构造
	 */
	public Member(){
		super();
	}
	
	/**
	 * 有参构造
	 */
	public Member(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	
	//普通方法
	
	public void intro(){
		
		System.out.print(getName()+","+age);
		 switch(role){
			
			case ROLE_GRANDPA:
				System.out.println(",我喜欢遛鸟、逗狗");
				break;
			case ROLE_GRANDMA:
				System.out.println(",我喜欢打麻将");
				break;
			case ROLE_FATHER:
				System.out.println(",我只能拼命的赚钱养家");
				break;
			case ROLE_MOTHER:
				System.out.println(",我喜欢逛街");
				break;
			case ROLE_BABY:
				System.out.println(",我喜欢在幼儿园和小朋友玩");
				break;
			}		
		
	}
	
	public void getup(){
		
		System.out.println(getName()+"，起床了");
	}
	
	public void work(){
		
		switch(role){
		
		case ROLE_GRANDPA:
			System.out.println(getName()+"在遛鸟");
			break;
		case ROLE_GRANDMA:
			System.out.println(getName()+"在打麻将");
			break;
		case ROLE_FATHER:
			System.out.println(getName()+"在上班赚钱");
			break;
		case ROLE_MOTHER:
			System.out.println(getName()+"在接送孩子上学，逛街");
			break;
		case ROLE_BABY:
			System.out.println(getName()+"在幼儿园玩");
			break;
		}
	}
	
	public void play(){
		
        switch(role){
		
		case ROLE_GRANDPA:
			System.out.println(getName()+"在逗狗");
			break;
		case ROLE_GRANDMA:
			System.out.println(getName()+"在打麻将");
			break;
		case ROLE_FATHER:
			System.out.println(getName()+"在加班赚钱");
			break;
		case ROLE_MOTHER:
			System.out.println(getName()+"在骂老公没出息");
			break;
		case ROLE_BABY:
			System.out.println(getName()+"在家里玩");
			break;
		}
	}
	
	public void sleep(){
		
		System.out.println(getName()+"睡觉了");
	}
    
	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
