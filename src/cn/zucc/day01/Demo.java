package cn.zucc.day01;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int money = 1000;
		double newMoney = money + money*0.05;
		System.out.println("һ��֮��Ǯ����ˣ�" + newMoney);
		double javaScore = 98.5;
		System.out.println("java��߷�Ϊ��" + javaScore);
		
		
		int wangScore = 80;
		int zhangScore;
		zhangScore = wangScore;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������������SQL�ɼ���");
		double sqlScore = sc.nextDouble();
		System.out.println("������������java�ɼ���");
		double javaScore = sc.nextDouble();
		System.out.println("������������android�ɼ���");
		double androidScore = sc.nextDouble();
		
		double differ = javaScore - sqlScore;
		System.out.println("Java�κ�SQL�εķ���֮��:" + differ);
		double avgScore = (sqlScore + javaScore + androidScore)/3;
		System.out.println("ƽ����Ϊ��" + avgScore);
		
		
		
		double avgScore = 81.29;
		int rise = 2;
		
		double newScore = avgScore + rise;
		System.out.println("�µ�ƽ����Ϊ��" + newScore );
		
		double num1 = 10.2;
		int num2 = (int)num1;
		System.out.println(num2);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ĳɼ���");
		int zhangScore = sc.nextInt();
		System.out.println("���������ĵĳɼ���");
		int liScore = sc.nextInt();
		boolean isTrue = zhangScore > liScore;
		System.out.println("�����ĳɼ������ĵĳɼ�����?" + isTrue);
	}

}
