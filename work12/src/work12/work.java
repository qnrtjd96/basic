package work12;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		
		// 입력받은 문자열이 소수/ 정수 판별
		// 소수 2 3 5 7 
/*		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("숫자를 입력해 주세요 : ");	
			a = sc.nextInt();
			if(a % 2 == 0) {
				System.out.println("해당되는 숫자는 정수 입니다.");
			}else {
				System.out.println("해당되는 숫자는 소수도 포함되어 있습니다.");
			}
*/
		String numStr = "1234";
		char arrChar[] = {'a', 'b', 'c' };
		
		for (int i = 0; i < arrChar.length; i++) {
			char c1 = arrChar[i];
		}
		
		boolean b2 = false;
		for (int i = 0; i < arrChar.length; i++) {
			char c1 = numStr.charAt(i);
			//System.out.println(c1);
			if(c1 == '.') {
				b2 = true;
				break;
			 	}
			}
		}
	
}
