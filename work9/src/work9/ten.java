package work9;

import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int a;
		
		a= sc.nextInt();               				
		int count = a*10;
		
		if(10<=count && 20>=count) {
			System.out.println("�Է��� ���� 10���� ũ�� 20���� �۽��ϴ�.");
		}
		else if(20<=count && 30>=count) {
			System.out.println("�Է��� ���� 20���� ũ�� 30���� �۽��ϴ�.");
		}
		else if(30<=count && 40>=count) {
			System.out.println("�Է��� ���� 30���� ũ�� 40���� �۽��ϴ�.");
		}
		else if(40<=count && 50>=count) {
			System.out.println("�Է��� ���� 40���� ũ�� 50���� �۽��ϴ�.");
		}
		else if(50<=count && 60>=count) {
			System.out.println("�Է��� ���� 50���� ũ�� 60���� �۽��ϴ�.");
		}
		else if(60<=count && 70>=count) {
			System.out.println("�Է��� ���� 60���� ũ�� 70���� �۽��ϴ�.");
		}
		else if(70<=count && 80>=count) {
			System.out.println("�Է��� ���� 70���� ũ�� 80���� �۽��ϴ�.");
		}
		else if(90<=count && 100>=count) {
			System.out.println("�Է��� ���� 90���� ũ�� 100���� �۽��ϴ�.");
		}
		else {
			System.out.println("�����Ҽ� �����ϴ�.");
		}
		
		
		//�����Թ��
//		int num = 0;
//		for(int i = 0;i < 20; i++) {			
//			num = i * 10;			
//			if(number > num && number <= num + 10) {
//				System.out.println("number�� " + num + "���� ũ�� " + (num + 10) + "�� �����ȿ� �ֽ��ϴ�");
//			}			
//		}
		

	}

}
