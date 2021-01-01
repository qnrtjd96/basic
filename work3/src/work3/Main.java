package work3;

public class Main {

	public static void main(String[] args) {
/*		1. 다음의 결과 값을 먼저 기입하고 결과를 확인하라
		int number;
		number = 5;
		number = number << 4;
		number = number >> 5;
		number = number >> 1;
*/
/*		2. 다음의 결과 값을 먼저 기입하고 결과를 확인하라
		int num1, num2;
		num1 = 128;
		num2 = 56;
		
		16진수로 바꾼다.
		
		num1 = (num1 & num2)|(num1 & num2);
		num2 = (num1 ^ num2);
*/
/*		3. 랜덤수를 취득해라
		범위: 0~99 개수 1개
		범위: 11, 12, 13, 14, 15 개수:1개
		숫자: 3, 7, 9, 13, 15 중 1개
*/		


		//1번 문제
		int number;
		number = 5;
		number = number << 4;
		System.out.println("number = "+ number);
		
		number = number >> 5;
		System.out.println("number = "+ number);

		number = number >> 1;
		System.out.println("number = "+ number);

		
		//2번문제
		int num1, num2;
		num1 = 128;
		num2 = 56;
		num1 = (num1 & num2)|(num1 & num2);
		num2 = (num1 ^ num2);
		
		System.out.printf("%x \n", num1);
		System.out.printf("%x \n", num2);
		
		
		//3번문제
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
