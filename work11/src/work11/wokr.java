package work11;

import java.util.Arrays;
import java.util.Scanner;

public class wokr {

	public static void main(String[] args) {
		/*
		 	����ڰ� ���ϴ� ������ŭ ���ڸ� �Է¹��� �� �հ踦 ���϶�.
		 	
		 	������� ���ڵ� ���
		 	
		 	1. ���ϴ� ������ �Է¹޴´�.
		 	2. ù���� ���ڸ� �Է¹޴´�.
		 			:
		 	3. ������ ���ڸ� �Է¹޴´�.
		 	4. ����ڰ� ���ϴ� ���ڸ� �����ְ� ���� �����ش�.
		*/

		//������ ���
/*		int want = 0;  //����
		int number[] = null; //�����Ҵ� �ʱ�ȭ ��
		int want1 = 0;
		int sum = 0; 	//�հ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ���� ���ϰ� ��������? : ");
		want = sc.nextInt();	//���ϴ� ������ �Է¹���
				
		for(int number=1; number <= want; number++) {
			if(number <= want) {
			System.out.print(number +" ��° ���ڸ� �Է����ּ��� : ");
			want1 = sc.nextInt();
				sum = sum + want1;
			}
			else 
			{
				break;
			}
		}
		System.out.println("����Ͻ� ���ڴ�"+ want + "�� �̸� �� ���� " + sum + "�Դϴ�.");
*/
		int want = 0;  //����
		int number[] = null; //�����Ҵ� �ʱ�ȭ ��
		int sum = 0; 	//�հ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ���� ���ϰ� ��������? : ");
		want = sc.nextInt();	//���ϴ� ������ �Է¹���
		
		number = new int[want];
		for(int i=1; i <= number.length; i++) {
			 System.out.print((i)+ "��° �� = ");
			 	number[i] = sc.nextInt();
			}
		//�����
		System.out.println(Arrays.toString(number));
		
		//�հ�
/*		for(int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
*/
		//foreach
		for(int num : number) {
			sum = sum + num;
		}
		System.out.println("�հ� = " + sum);
	}
}

