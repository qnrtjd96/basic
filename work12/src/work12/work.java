package work12;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		
		// �Է¹��� ���ڿ��� �Ҽ�/ ���� �Ǻ�
		// �Ҽ� 2 3 5 7 
/*		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("���ڸ� �Է��� �ּ��� : ");	
			a = sc.nextInt();
			if(a % 2 == 0) {
				System.out.println("�ش�Ǵ� ���ڴ� ���� �Դϴ�.");
			}else {
				System.out.println("�ش�Ǵ� ���ڴ� �Ҽ��� ���ԵǾ� �ֽ��ϴ�.");
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
