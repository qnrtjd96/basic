import java.util.Scanner;

public class work5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int num1, num2;
		String oper;
		int result = 0;
		
		
		while(true){
		// 첫번째 숫자 입력
		System.out.print("숫자1 = ");
		num1 = sc.nextInt();
		
		// 연산자 입력
		while(true) {		
			System.out.print("(+, -, *, /) = ");
			oper = sc.next();
		
			if(oper.equals("+")||oper.equals("-")||
					oper.equals("*")||oper.equals("/")) {
				break;
			}
			System.out.println(" 연산자를 정확히 입력해 주십시오.");			
		}
		
		// 두번째 숫자 입력
		while(true){
			System.out.print("숫자2 = ");
			num2 = sc.nextInt();
			if(num2==0) {
				System.out.println(" 0으로는 나눌수 없습니다. 다시 선택해 주세요");
			}else {
				break;
			}
		}
		
		/*
		// 결과
		// + - * / %
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		*/
		/*
		boolean ng = false;
		
		// switch
		switch( oper ) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:	
				ng = true;
		}
		*/
			boolean ng = false;
			
			if(oper.equals("+")) {
				result = num1 + num2;
			}
				else if(oper.equals("-")) {
					result = num1 - num2;
				}
				else if(oper.equals("*")) {
					result = num1 * num2;		
				}
				else if(oper.equals("/")) {
					result = num1 / num2;
				}
			else {
				ng = true;
			}
			
			if(ng == false) {
				System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
			}
			else {
				System.out.println("계산할 수 없습니다");
			}		
		}
		
		
		/*
		String str = "hel";
		str = str + "lo";
		
	//	if(str.equals("hello") == true) {
		if("hello".equals(str) == true) {
		// if(str == "hello") {
			System.out.println("hello입니다");
		}else {
			System.out.println("hello가 아닙니다");
		}
		*/
				
				
	}
}





//선생님꺼 보고배끼기 연산자를 잘못입력했을때, 바로돌아가게 바꿀것
//계산기가 계속 반복되게 진행할 것