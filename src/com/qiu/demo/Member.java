package com.qiu.demo;

/**
 * �о��̳й�ϵ
 * 
 * дһ������
 * 
 * �����������Ĺ������Ժͷ���
 *  1�����е�����
 *    1������name,
 *    2�� ����age;
 *  2�����еķ���
 *    1��intro���ҽ���
 *    2����getup,����work,����play,˯��sleep,
 *
 */
public class Member {
	
	//����
	//��̬����
	public static final String ROLE_GRANDPA = "grandpa";
	public static final String ROLE_GRANDMA = "grandma";
	public static final String ROLE_FATHER = "father";
	public static final String ROLE_MOTHER = "mother";
	public static final String ROLE_BABY = "baby";
	//��̬����
	private String name = "";
	private int age = 0;
	private String role = "";
	
	//���췽��
	
	/**
	 * �޲ι���
	 */
	public Member(){
		super();
	}
	
	/**
	 * �вι���
	 */
	public Member(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	
	//��ͨ����
	
	public void intro(){
		
		System.out.print(getName()+","+age);
		 switch(role){
			
			case ROLE_GRANDPA:
				System.out.println(",��ϲ�����񡢶���");
				break;
			case ROLE_GRANDMA:
				System.out.println(",��ϲ�����齫");
				break;
			case ROLE_FATHER:
				System.out.println(",��ֻ��ƴ����׬Ǯ����");
				break;
			case ROLE_MOTHER:
				System.out.println(",��ϲ�����");
				break;
			case ROLE_BABY:
				System.out.println(",��ϲ�����׶�԰��С������");
				break;
			}		
		
	}
	
	public void getup(){
		
		System.out.println(getName()+"������");
	}
	
	public void work(){
		
		switch(role){
		
		case ROLE_GRANDPA:
			System.out.println(getName()+"������");
			break;
		case ROLE_GRANDMA:
			System.out.println(getName()+"�ڴ��齫");
			break;
		case ROLE_FATHER:
			System.out.println(getName()+"���ϰ�׬Ǯ");
			break;
		case ROLE_MOTHER:
			System.out.println(getName()+"�ڽ��ͺ�����ѧ�����");
			break;
		case ROLE_BABY:
			System.out.println(getName()+"���׶�԰��");
			break;
		}
	}
	
	public void play(){
		
        switch(role){
		
		case ROLE_GRANDPA:
			System.out.println(getName()+"�ڶ���");
			break;
		case ROLE_GRANDMA:
			System.out.println(getName()+"�ڴ��齫");
			break;
		case ROLE_FATHER:
			System.out.println(getName()+"�ڼӰ�׬Ǯ");
			break;
		case ROLE_MOTHER:
			System.out.println(getName()+"�����Ϲ�û��Ϣ");
			break;
		case ROLE_BABY:
			System.out.println(getName()+"�ڼ�����");
			break;
		}
	}
	
	public void sleep(){
		
		System.out.println(getName()+"˯����");
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
