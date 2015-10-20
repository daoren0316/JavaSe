package cn.zucc.day02;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("请输入张浩的成绩：");
		int zhangScore = sc.nextInt();
		if(zhangScore > 90){
			System.out.println("获得一个mp4作为奖励");
		}else{
			System.out.println("没有获得奖励");
		}
		if(zhangScore > 90){
			System.out.println("成绩为优");
		}else if(zhangScore > 80){
			System.out.println("成绩为良");
		}else if(zhangScore > 60){
			System.out.println("成绩为及格");
		}else{
			System.out.println("成绩为不及格");
		}
		
		
		System.out.println("请输入跑步成绩");
		int score = sc.nextInt();
		if(score < 10){
			System.out.println("请输入性别");
			String sex = sc.next();
			if(sex.equals("男")){
				System.out.println("进入男子组决赛");
			}else{
				System.out.println("进入女子组决赛");
			}
		}else{
			System.out.println("没有进入决赛");
		}
		
		System.out.println("请输入java成绩：");
		int javaScore = sc.nextInt();
		System.out.println("请输入音乐成绩：");
		int musicScore = sc.nextInt();
		if((javaScore > 98 && musicScore > 80) || (javaScore == 100 && musicScore > 70)){
			System.out.println("获得奖励");
		}
		
		
		System.out.println("\t\t欢迎使用我行我素管理系统");
		System.out.println("\t\t\t1.登陆系统");
		System.out.println("\t\t\t2.退出");
		System.out.println("*****************");
		System.out.println("请选择，输入数字：");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("欢迎登陆");
			break;
		case 2:
			System.out.println("谢谢您使用");
			break;
		default:
			System.out.println("您输入有误");
			break;
		}
		
		
		System.out.println("请输入考试成绩");
		int score = sc.nextInt();
		while(score < 80){
			System.out.println("上午复习");
			System.out.println("下午考试");
			System.out.println("请输入补考成绩");
			score = sc.nextInt();
		}
		
		int score;
		do{
			System.out.println("上午复习");
			System.out.println("下午考试");
			System.out.println("请输入考试成绩");
			score = sc.nextInt();
		}while(score < 80);
		
		
		for(int i = 0; i < 10; i++){
			System.out.println("上午复习");
			System.out.println("下午考试" + i);
		}
		*/
		/*
		 * 1 * 1 = 1
		 * 1 * 2 = 2 2 * 2 = 4
		 * 1 * 3 = 3 2 * 3 = 6 3 * 3 =9
		 */
		//i是被乘数
		for(int i = 1; i <= 9; i++){
			//j是乘数
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}

}
