package work4;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		// ���� �Է� 3��
		// 0���� ū ���ڿ��߸� �Ѵ�.
		// ���� 0���� ���� ������ ��� -> �ٽ��Է�
		
//		Scanner sc = new Scanner(System.in);
//		
//		double a;
//		System.out.print("���ڸ� �Է��� �ּ��� : ");	
//			a = sc.nextDouble();
//				if(0< a) {
//					while(0 < a) {
//						System.out.println("�Է��Ͻ� ���� "+ a + " �Դϴ�.");
//						a++;
//						break;
//					}
//				}else {
//					
//				}
				
//				if(0 < a) {
//					System.out.println("�Է��Ͻ� ���� "+ a + " �Դϴ�.");
//				}
//				else {
//					System.out.print("0 ������ ���ڴ� �Է��̾ȵ˴ϴ�."); 
//				}
		
		
		//����:
		
		Scanner sc = new Scanner(System.in);
		
		int w = 0;
		int numer = 0;
		while(w <3) {
			System.out.print((w+1) + " 2���� �Է� = ");
			numer = sc.nextInt();
			
			if(numer < 0) {
				System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ� �Է����ֽʽÿ�.");
				continue;
			}
			w++;
		}
	}

}
