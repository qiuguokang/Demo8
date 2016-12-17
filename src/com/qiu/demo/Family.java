package com.qiu.demo;

/**
 * ��ͥ��
 * 
 * ���ԣ���Ա
 * 
 * ������һ��Ŀ�ʼ������
 *
 */
public class Family {

	//����
	private Grandpa grandpa = null;
	private Grandma grandma = null;
	private Father father = null;
	private Mother mother = null;
	private Baby baby = null;
	
	//���췽��
	public Family(Grandpa grandpa, Grandma grandma, Father father,
			Mother mother, Baby baby) {
		super();
		this.grandpa = grandpa;
		this.grandma = grandma;
		this.father = father;
		this.mother = mother;
		this.baby = baby;
	}
	
	//��ͨ����
	
	public void intro(){
		grandpa.intro();
		grandma.intro();
		father.intro();
		mother.intro();
		baby.intro();
	}
	
	private void dayStart(){
		grandpa.getup();
		grandma.getup();
		father.getup();
		mother.getup();
		baby.getup();
	}
	
	private void work(){
		grandpa.work();
		grandma.work();
		father.work();
		mother.work();
		baby.work();
	}
	
	private void play(){
		grandpa.play();
		grandma.play();
		father.play();
		mother.play();
		baby.play();
	}
	
	private void dayEnd(){
		grandpa.sleep();
		grandma.sleep();
		father.sleep();
		mother.sleep();
		baby.sleep();
	}
	
	public void day(){
		dayStart();
		work();
		play();
		dayEnd();
	}
}
