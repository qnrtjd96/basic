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
			
			// �Է¹��� ���ڿ��� ��� �������� ����	a234a
			for(int i = 0;i < numStr.length(); i++) {
			
				char c = numStr.charAt( i );
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
		
			
		int n = 123;
		String s = n + "";	// int -> String
		
		// String -> Integer
		String s1 = "12345";
		int num = Integer.parseInt(s1);

		System.out.println("num = " + num);
	}
}