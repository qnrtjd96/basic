import java.util.Scanner;

public class work5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int num1, num2;
		String oper;
		int result = 0;
		
		
		while(true){
		// ù��° ���� �Է�
		System.out.print("����1 = ");
		num1 = sc.nextInt();
		
		// ������ �Է�
		while(true) {		
			System.out.print("(+, -, *, /) = ");
			oper = sc.next();
		
			if(oper.equals("+")||oper.equals("-")||
					oper.equals("*")||oper.equals("/")) {
				break;
			}
			System.out.println(" �����ڸ� ��Ȯ�� �Է��� �ֽʽÿ�.");			
		}
		
		// �ι�° ���� �Է�
		while(true){
			System.out.print("����2 = ");
			num2 = sc.nextInt();
			if(num2==0) {
				System.out.println(" 0���δ� ������ �����ϴ�. �ٽ� ������ �ּ���");
			}else {
				break;
			}
		}
		
		/*
		// ���
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
				System.out.println("����� �� �����ϴ�");
			}		
		}
		
		
		/*
		String str = "hel";
		str = str + "lo";
		
	//	if(str.equals("hello") == true) {
		if("hello".equals(str) == true) {
		// if(str == "hello") {
			System.out.println("hello�Դϴ�");
		}else {
			System.out.println("hello�� �ƴմϴ�");
		}
		*/
				
				
	}
}





//�����Բ� ����賢�� �����ڸ� �߸��Է�������, �ٷε��ư��� �ٲܰ�
//���Ⱑ ��� �ݺ��ǰ� ������ ��