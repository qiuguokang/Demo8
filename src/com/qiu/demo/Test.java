package com.qiu.demo;

public class Test {
	
	public static void main(String[] args) {
		
		Grandpa gp = new Grandpa("үү", 62, Member.ROLE_GRANDPA );
		Grandma gm = new Grandma("����", 57, Member.ROLE_GRANDMA );
		Father f = new Father("�ְ�", 31, Member.ROLE_FATHER);
		Mother m = new Mother("����", 28, Member.ROLE_MOTHER);
        Baby b = new Baby("����", 4, Member.ROLE_BABY);
		
        Family f1 = new Family(gp, gm, f, m, b);
		
		f1.intro();
		f1.day();
	}

}
