package main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		//입력
		Scanner sc = new Scanner(System.in);
		
		//console에서 입력
		//저장공간 : 입력 -> 변수
		
		//boolean
		/*
		 * boolean b;
		 * 
		 * System.out.print("b = "); b = sc.nextBoolean(); //true/false
		 * 
		 * System.out.println("b = " + b);
		 */
		
		//int
		/*
		 * int num; System.out.print("num = "); num = sc.nextInt();
		 * 
		 * System.out.println("num = " + num);
		 */
		
		//double
		/*
		 * System.out.println("d = "); double d= sc.nextDouble(); System.out.println(d);
		 */

		//String
		
		  String str;
		  
		  System.out.print("str = "); str = sc.next();
		  
		  System.out.println("str = " + str );
		 
	}

}
