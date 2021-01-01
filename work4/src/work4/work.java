package work4;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		// 숫자 입력 3개
		// 0보다 큰 숫자여야만 한다.
		// 만약 0보다 작은 숫자인 경우 -> 다시입력
		
//		Scanner sc = new Scanner(System.in);
//		
//		double a;
//		System.out.print("숫자를 입력해 주세요 : ");	
//			a = sc.nextDouble();
//				if(0< a) {
//					while(0 < a) {
//						System.out.println("입력하신 값은 "+ a + " 입니다.");
//						a++;
//						break;
//					}
//				}else {
//					
//				}
				
//				if(0 < a) {
//					System.out.println("입력하신 값은 "+ a + " 입니다.");
//				}
//				else {
//					System.out.print("0 이하의 숫자는 입력이안됩니다."); 
//				}
		
		
		//정답:
		
		Scanner sc = new Scanner(System.in);
		
		int w = 0;
		int numer = 0;
		while(w <3) {
			System.out.print((w+1) + " 2숫자 입력 = ");
			numer = sc.nextInt();
			
			if(numer < 0) {
				System.out.println("잘못 입력하셧습니다. 다시 입력해주십시오.");
				continue;
			}
			w++;
		}
	}

}
