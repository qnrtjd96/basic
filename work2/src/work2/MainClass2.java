package work2;

import java.util.Scanner;

public class MainClass2 {
		public static void main(String[] args) {
				/*
				 * ������ ���α׷�
				 * ���ұݾ� : 3260��
				 * �ڽ��� �� : 10000��
				 * 
				 * �Ž����� : ���
				 * 5000-> ?��
				 * 1000 -> ?��
				 * 500 -> ?
				 * 100 -> ?��
				 * 50 -> ?��
				 * 10 -> ?��
				 */
				
				Scanner sc = new Scanner(System.in);
				int a, c, result;
				
				System.out.print("���ұݾ��� �Է����ּ��� : ");
				
				//ù��° ���� �Է¹ޱ�
				a = sc.nextInt();
				
				//�ι�°���� �Է¹ޱ�
				System.out.print("�ڽ��� �� �ݾ��� �Է����ּ���: ");
				c = sc.nextInt();
				
				//������
				//+ - * / %
				
				result = c - a;
				System.out.println("================================");
				System.out.println("�Ž������� " + result + "�� �Դϴ�.");
				
				int re1 = result / 5000;
				int re2 = (result % 5000) / 1000;
				int re3 = ((result % 5000) % 1000) / 500;
				int re4 = (((result % 5000) % 1000) % 500) / 100;
				int re5 = ((((result % 5000) % 1000) % 500) % 100) / 50;
				int re6 = (((((result % 5000) % 1000) % 500) % 100) % 50) /10;
						
				System.out.println("�ܵ��� 5000��¥��"+ re1 +"��");
				System.out.println("�ܵ��� 1000��¥��"+ re2 +"��");
				System.out.println("�ܵ��� 500��¥��"+ re3 +"��");
				System.out.println("�ܵ��� 100��¥��"+ re4 +"��");
				System.out.println("�ܵ��� 50��¥��"+ re5 +"�� �Դϴ�.");
				System.out.println("�ܵ��� 10��¥��"+ re6 +"�� �Դϴ�.");
				
				
				
		}
}
