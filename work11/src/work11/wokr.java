package work11;

import java.util.Arrays;
import java.util.Scanner;

public class wokr {

	public static void main(String[] args) {
		/*
		 	사용자가 원하는 갯수만큼 숫자를 입력받은 후 합계를 구하라.
		 	
		 	사용자의 숫자들 출력
		 	
		 	1. 원하는 개수를 입력받는다.
		 	2. 첫번쨰 숫자를 입력받는다.
		 			:
		 	3. 마지막 숫자를 입력받는다.
		 	4. 사용자가 원하는 숫자를 보여주고 합을 보여준다.
		*/

		//내가한 방식
/*		int want = 0;  //개수
		int number[] = null; //동적할당 초기화 값
		int want1 = 0;
		int sum = 0; 	//합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개의 합을 구하고 싶으세요? : ");
		want = sc.nextInt();	//원하는 개수를 입력받음
				
		for(int number=1; number <= want; number++) {
			if(number <= want) {
			System.out.print(number +" 번째 숫자를 입력해주세요 : ");
			want1 = sc.nextInt();
				sum = sum + want1;
			}
			else 
			{
				break;
			}
		}
		System.out.println("사용하신 숫자는"+ want + "개 이며 총 합은 " + sum + "입니다.");
*/
		int want = 0;  //개수
		int number[] = null; //동적할당 초기화 값
		int sum = 0; 	//합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개의 합을 구하고 싶으세요? : ");
		want = sc.nextInt();	//원하는 개수를 입력받음
		
		number = new int[want];
		for(int i=1; i <= number.length; i++) {
			 System.out.print((i)+ "번째 수 = ");
			 	number[i] = sc.nextInt();
			}
		//사용자
		System.out.println(Arrays.toString(number));
		
		//합계
/*		for(int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
*/
		//foreach
		for(int num : number) {
			sum = sum + num;
		}
		System.out.println("합계 = " + sum);
	}
}

