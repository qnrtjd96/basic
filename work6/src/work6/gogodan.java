package work6;

import java.util.Scanner;

public class gogodan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ����� ����ұ��?");
		int a = sc.nextInt();
		
		int gogo;
		gogo = a;
		
		while(gogo < a+10) {
			for(int i=1; i<10; i++) {
				System.out.println(gogo+ "*"+ i  +" = "+gogo * i);
			}
			break;
		}
		
		
		//�����Թ��
		System.out.print("����ϰ� ���� �� = ");
		int num9 = sc.nextInt();

		// num9 * j = num9*j
		for(int j = 1;j < 10; j++) {
			System.out.print(num9 + "x" + j + "=" + (num9*j) + " ");
		}
		System.out.println();
	}

}
