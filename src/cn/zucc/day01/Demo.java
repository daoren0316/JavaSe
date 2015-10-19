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
		System.out.println("一年之后钱变成了：" + newMoney);
		double javaScore = 98.5;
		System.out.println("java最高分为：" + javaScore);
		
		
		int wangScore = 80;
		int zhangScore;
		zhangScore = wangScore;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入张三的SQL成绩：");
		double sqlScore = sc.nextDouble();
		System.out.println("请输入张三的java成绩：");
		double javaScore = sc.nextDouble();
		System.out.println("请输入张三的android成绩：");
		double androidScore = sc.nextDouble();
		
		double differ = javaScore - sqlScore;
		System.out.println("Java课和SQL课的分数之差:" + differ);
		double avgScore = (sqlScore + javaScore + androidScore)/3;
		System.out.println("平均分为：" + avgScore);
		
		
		
		double avgScore = 81.29;
		int rise = 2;
		
		double newScore = avgScore + rise;
		System.out.println("新的平均分为：" + newScore );
		
		double num1 = 10.2;
		int num2 = (int)num1;
		System.out.println(num2);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入张三的成绩：");
		int zhangScore = sc.nextInt();
		System.out.println("请输入李四的成绩：");
		int liScore = sc.nextInt();
		boolean isTrue = zhangScore > liScore;
		System.out.println("张三的成绩比李四的成绩高吗?" + isTrue);
	}

}
