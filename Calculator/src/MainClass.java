import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, c, result, result1;
		String b;
		System.out.println("계산기 입니다. 숫자를 입력해주세요");
		
		//첫번째 숫자 입력받기
		a = sc.nextInt();
		
		//연산자입력
		System.out.println("연산자를 입력해주세요 +,-,*,/");
		b = sc.next();
		
		//두번째숫자 입력받기
		System.out.println("두번째 숫자를 입력해주세요.");
		c = sc.nextInt();
		
		//결과출력
		//+ - * / %
		result = a + c;
		result1 = a - c;
		
		System.out.println("+연산결과는 " + result);
		System.out.println("-연산결과는 " + result1);
		System.out.println("*연산결과는 " + a * c);
		System.out.println("/연산결과는 " + a / c);
	}
}
