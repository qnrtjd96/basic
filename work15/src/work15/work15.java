package work15;

import java.util.Scanner;

public class work15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean numOK = true;
		
		while(true) {
			numOK = true;
		
			System.out.print("num = ");
			String numStr = sc.next();		
			
			// 입력받은 문자열이 모두 숫자인지 조사	a234a
			for(int i = 0;i < numStr.length(); i++) {
			
				char c = numStr.charAt( i );
				int asc = (int)c;
				if(asc < 48 || asc > 57) {	// 정수가 아님
					numOK = false;
					break;
				}			
			}
			
			if(numOK == true) {	// 숫자				
				break;
			}			
			// 문자 -> 다시 입력
			System.out.println("숫자가 아닙니다. 다시 입력해 주세요.");
		}
		
			
		int n = 123;
		String s = n + "";	// int -> String
		
		// String -> Integer
		String s1 = "12345";
		int num = Integer.parseInt(s1);

		System.out.println("num = " + num);
	}
}