package operator;

public class MainClass {
	public MainClass() {
		/*
		 * 연산자 operator : + - * / %
		 * = : 대입연산자
		 * a = b; a에다가 b에 있는값을 넣어라
		 * increment ++
		 * decrement --
		 */
		
		int num1, num2;
		int result;
		
		//대입
		num1 = 25;
		num2 = 7;
		
		result = num1 + num2;
		System.out.println(num1 + "+" +  num2 + "+ = "+ result );
	}
}
