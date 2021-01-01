package operator2;

public class MainClass {
	public static void main(String[] args) {
		/*
		 *	논리연산자(true/false)
		 *	제어문 (if, else, for, while, do while, switch, break, continue)
		 *		&&	AND	그리고
		 *		||	OR	또는
		 *		!	NOT	~아닌
		 *
		 * 	< > >= =< == !=
		 */
		
		int number;
		number =5;
		
		System.out.println(number > 0 && number < 10);
		System.out.println(number > 0 ||number < 10);
		System.out.println( !(number > 0 && number < 10) );
		System.out.println( number <= 0 || number >= 10 );
	}
}
