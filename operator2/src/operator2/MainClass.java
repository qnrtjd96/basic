package operator2;

public class MainClass {
	public static void main(String[] args) {
		/*
		 *	��������(true/false)
		 *	��� (if, else, for, while, do while, switch, break, continue)
		 *		&&	AND	�׸���
		 *		||	OR	�Ǵ�
		 *		!	NOT	~�ƴ�
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
