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
		System.out.println("�������źƵĳɼ���");
		int zhangScore = sc.nextInt();
		if(zhangScore > 90){
			System.out.println("���һ��mp4��Ϊ����");
		}else{
			System.out.println("û�л�ý���");
		}
		if(zhangScore > 90){
			System.out.println("�ɼ�Ϊ��");
		}else if(zhangScore > 80){
			System.out.println("�ɼ�Ϊ��");
		}else if(zhangScore > 60){
			System.out.println("�ɼ�Ϊ����");
		}else{
			System.out.println("�ɼ�Ϊ������");
		}
		
		
		System.out.println("�������ܲ��ɼ�");
		int score = sc.nextInt();
		if(score < 10){
			System.out.println("�������Ա�");
			String sex = sc.next();
			if(sex.equals("��")){
				System.out.println("�������������");
			}else{
				System.out.println("����Ů�������");
			}
		}else{
			System.out.println("û�н������");
		}
		
		System.out.println("������java�ɼ���");
		int javaScore = sc.nextInt();
		System.out.println("���������ֳɼ���");
		int musicScore = sc.nextInt();
		if((javaScore > 98 && musicScore > 80) || (javaScore == 100 && musicScore > 70)){
			System.out.println("��ý���");
		}
		
		
		System.out.println("\t\t��ӭʹ���������ع���ϵͳ");
		System.out.println("\t\t\t1.��½ϵͳ");
		System.out.println("\t\t\t2.�˳�");
		System.out.println("*****************");
		System.out.println("��ѡ���������֣�");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("��ӭ��½");
			break;
		case 2:
			System.out.println("лл��ʹ��");
			break;
		default:
			System.out.println("����������");
			break;
		}
		
		
		System.out.println("�����뿼�Գɼ�");
		int score = sc.nextInt();
		while(score < 80){
			System.out.println("���縴ϰ");
			System.out.println("���翼��");
			System.out.println("�����벹���ɼ�");
			score = sc.nextInt();
		}
		
		int score;
		do{
			System.out.println("���縴ϰ");
			System.out.println("���翼��");
			System.out.println("�����뿼�Գɼ�");
			score = sc.nextInt();
		}while(score < 80);
		
		
		for(int i = 0; i < 10; i++){
			System.out.println("���縴ϰ");
			System.out.println("���翼��" + i);
		}
		*/
		/*
		 * 1 * 1 = 1
		 * 1 * 2 = 2 2 * 2 = 4
		 * 1 * 3 = 3 2 * 3 = 6 3 * 3 =9
		 */
		//i�Ǳ�����
		for(int i = 1; i <= 9; i++){
			//j�ǳ���
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}

}
