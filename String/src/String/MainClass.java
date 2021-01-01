package String;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// String : ���ڿ�
		
		char array[]	=	{ 'H', 'e', 'l', 'l', 'o' };
		System.out.println("");
		
		//class ==object(��ü) ���� + �Լ�(�޼ҵ�)
		//str ==object(class ����)
		String str = "Hello";
		System.out.println(str);
		
		str="world";
		System.out.println(str);
		
		String str2 = " nice to meet you";
		String str3 = str + str2;
		System.out.println(str3);
		
		String str4 = "�ǰ��ϼ���";
		String str5 = str3.concat(str4);
		
		System.out.println(str5);
		
		//equals : ���ڿ� ��
		String str6 = "Hello";
		String str7 = "Hello";
		
//		if(str6 == str7) {
		if(str6.equals(str7) == true) {
			System.out.println("���� ���ڿ� �Դϴ�.");
		}else {
			System.out.println("�ٸ� ���ڿ� �Դϴ�.");
		}
		
		boolean b = str.equals(str7); //���ڿ��� ���ϴ� �Լ� b
		if(b == true) {
			System.out.println("���� ���ڿ� �Դϴ�.");
		}else {
			System.out.println("�ٸ� ���ڿ� �Դϴ�.");
		}
		
		/*
		 	�Ѿ���� �� = equals(������ ��)
		 */
		
		//indexOf : ���ڸ� �˻��ϱ� ���� �Լ�. ���ڸ� ã���� ��ȣ�� �����ش�.
		String str8 = "abcdeabcdeabcde";
		
		int indexNum = str8.indexOf("cde");
		System.out.println(indexNum);
		
		//lastIndexOf
		indexNum = str.lastIndexOf("c");
		System.out.println(indexNum);
		
		//length array.lenth == �迭
		int len = str8.length();
		System.out.println(len);
		
		//replace ����
		String str9 ="A*B*C*D";
		
		str9 = str.replace("*", "-");
		System.out.println(str9);
		
		//split -> token�� �̿��ؼ� ���ڿ��� �ڸ��� �Լ�
		/*
		 	�̸� ���� ������� �ּ�
		 	ȫ�浿24 2000/12/02 �����
		 	
		 */
		
		String str10 = "aa-bb-cc-dd";
		str10 ="ȫ�浿-24-2001/10/12-�����";
		String splits[] = str10.split("-");
		
		System.out.println(splits.length);
		System.out.println(Arrays.toString(splits));
		
		//substring ���ڿ��� �������� �߶� ���
		String str11 = str10.substring(4,6);
		System.out.println(str11);
		
		//�빮��, �ҹ���
		//toUpperCase toLowerCase
		String str12 = "abcDeF";
		
		str12 = str12.toUpperCase();
		System.out.println(str12);
		
		str12 = str12.toLowerCase();
		System.out.println(str12);
		
		//trim : �յ� ������ �����ִ� �Լ�
		String str13 = "               java      java  java      ";
		str13 =str13.trim();
		System.out.println(str13);
		
		//valueOf ���ڸ� ���ڿ���
		int num =123;
		long lo = 1234L;
		double d = 123.4567;
		
		String snum = String.valueOf(num);
		String slo = String.valueOf(lo);
		String sd = String.valueOf(d);
		
		System.out.println(snum + " "+ slo + " "+ sd);
		
		//�������ĸ�
		
		String snum1 = num+ ""; //�̷����ϸ� �������ϱ� ���ڿ��� �ٿ��ִ��� valueOf �Լ��� ��
		
		//Ž��: contains
		// �˰���(����(sort), Ʈ��, ����, Ž��)
		String str14 = "����� ������ ������";
		boolean b1 =str14.contains("����");
		System.out.println(b1);
		
		//charAt : index��ȣ�� ������
		
		String str15 = "�����ٶ󸶹ٻ�";
		
		char ch = str15.charAt(2);
		System.out.println(ch);
		
		//ASCII(�ƽ�Ű) Code
		//A = 65 B 0 1
		char c = 'A';
		System.out.println(c);
		System.out.println((int) c);
		
		int asc = (int)c;
		asc =asc + 32;
		
		c = (char)asc;
		System.out.println(c);
		
	}
}
