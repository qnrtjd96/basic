package work2;

import java.util.Scanner;

public class MainClass2 {
		public static void main(String[] args) {
				/*
				 * 편의점 프로그램
				 * 지불금액 : 3260원
				 * 자신의 돈 : 10000원
				 * 
				 * 거스름돈 : 출력
				 * 5000-> ?장
				 * 1000 -> ?장
				 * 500 -> ?
				 * 100 -> ?개
				 * 50 -> ?개
				 * 10 -> ?개
				 */
				
				Scanner sc = new Scanner(System.in);
				int a, c, result;
				
				System.out.print("지불금액을 입력해주세요 : ");
				
				//첫번째 숫자 입력받기
				a = sc.nextInt();
				
				//두번째숫자 입력받기
				System.out.print("자신의 낼 금액을 입력해주세요: ");
				c = sc.nextInt();
				
				//결과출력
				//+ - * / %
				
				result = c - a;
				System.out.println("================================");
				System.out.println("거스름돈은 " + result + "원 입니다.");
				
				int re1 = result / 5000;
				int re2 = (result % 5000) / 1000;
				int re3 = ((result % 5000) % 1000) / 500;
				int re4 = (((result % 5000) % 1000) % 500) / 100;
				int re5 = ((((result % 5000) % 1000) % 500) % 100) / 50;
				int re6 = (((((result % 5000) % 1000) % 500) % 100) % 50) /10;
						
				System.out.println("잔돈은 5000원짜리"+ re1 +"장");
				System.out.println("잔돈은 1000원짜리"+ re2 +"장");
				System.out.println("잔돈은 500원짜리"+ re3 +"개");
				System.out.println("잔돈은 100원짜리"+ re4 +"개");
				System.out.println("잔돈은 50원짜리"+ re5 +"개 입니다.");
				System.out.println("잔돈은 10원짜리"+ re6 +"개 입니다.");
				
				
				
		}
}
