package work3;

public class Main {

	public static void main(String[] args) {
/*		1. ������ ��� ���� ���� �����ϰ� ����� Ȯ���϶�
		int number;
		number = 5;
		number = number << 4;
		number = number >> 5;
		number = number >> 1;
*/
/*		2. ������ ��� ���� ���� �����ϰ� ����� Ȯ���϶�
		int num1, num2;
		num1 = 128;
		num2 = 56;
		
		16������ �ٲ۴�.
		
		num1 = (num1 & num2)|(num1 & num2);
		num2 = (num1 ^ num2);
*/
/*		3. �������� ����ض�
		����: 0~99 ���� 1��
		����: 11, 12, 13, 14, 15 ����:1��
		����: 3, 7, 9, 13, 15 �� 1��
*/		


		//1�� ����
		int number;
		number = 5;
		number = number << 4;
		System.out.println("number = "+ number);
		
		number = number >> 5;
		System.out.println("number = "+ number);

		number = number >> 1;
		System.out.println("number = "+ number);

		
		//2������
		int num1, num2;
		num1 = 128;
		num2 = 56;
		num1 = (num1 & num2)|(num1 & num2);
		num2 = (num1 ^ num2);
		
		System.out.printf("%x \n", num1);
		System.out.printf("%x \n", num2);
		
		
		//3������
		double d = Math.random();
		
		int hundred = (int)(Math.random()* 100);
		System.out.println(hundred);
		
		//11, 12, 13, 14, 15
		int ten = ((int)(Math.random()* 5) + 11);
		System.out.println(ten);

		//3, 7, 9, 13, 15            
//		int we = (int)(((d * 7)+1)*2)+1; 
//		System.out.println(we);
		/*
		 * int array[] = {3, 7, 9, 13, 15} r = (int)(Math.random() * 5);
		 * System.out.println(array[r]);
		 */
		
	}

}
