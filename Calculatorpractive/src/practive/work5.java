package practive;
import java.util.Scanner;

public class work5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		String oper;
		int result = 0;
		boolean numOK = true;
		
		
		while(true){
		// ù��° ���� �Է�
			numOK = true;
			System.out.print("num = ");
			String num11 = sc.next();		
			
			// �Է¹��� ���ڿ��� ��� �������� ����	a234a
			for(int i = 0;i < num11.length(); i++) {
			
				char c = num11.charAt( i );
				int asc = (int)c;
				if(asc < 48 || asc > 57) {	// ������ �ƴ�
					numOK = false;
					break;
				}			
			}
		
			if(numOK == true) {	// ����				
				break;
			}			
			// ���� -> �ٽ� �Է�
			System.out.println("���ڰ� �ƴմϴ�. �ٽ� �Է��� �ּ���.");
		}
		
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
			// ù��° ���� �Է�
				numOK = true;
			
				System.out.print("num = ");
				String num22 = sc.next();		
				
				// �Է¹��� ���ڿ��� ��� �������� ����	a234a
				for(int i = 0;i < num22.length(); i++) {
				
					char c = num22.charAt( i );
					int asc = (int)c;
					if(asc < 48 || asc > 57) {	// ������ �ƴ�
						numOK = false;
						break;
					}			
				}
			
				if(numOK == true) {	// ����				
					break;
				}			
				// ���� -> �ٽ� �Է�
				System.out.println("���ڰ� �ƴմϴ�. �ٽ� �Է��� �ּ���.");
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
		/*
			boolean ng = false;
			
			if(oper.equals("+")) {
				result = num11 + num22;
			}
				else if(oper.equals("-")) {
					result = num11 - num22;
				}
				else if(oper.equals("*")) {
					result = num11 * num22;		
				}
				else if(oper.equals("/")) {
					result = num11 / num22;
				}
			else {
				ng = true;
			}
			
			if(ng == false) {
				System.out.println(num11 + " " + oper + " " + num2 + " = " + result);
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