package work13;

import java.util.Random;
import java.util.Scanner;

public class homwork {

	public static void main(String[] args) {
		// ����ã�� ����
		/*
		 	����ã��
		 	����: 1~100 �������� �ޱ�
		 	
		 	
		 	�Է�: ������ ���ߴ°�����
		 		���� < �Է¼��� : ũ�ٰ��ϰ� �ٽ�
		 		�Է¼��� < ����	: �۴ٰ� ���ϰ� �ٽ�
		 		��ȸ10��
		 		�����߸� ������ٰ� ǥ���ϰ� ���߸� �­��ٰ� ǥ��
		 		���ѻ�� �ѹ���? ����
		 	
		 	//��ȹ�����
		 	1.�������� ���� ����
		 	2. Scanner ���ؼ� ���� �ް�
		 	3. while�� ������ ������ ��� ���ڸ� ���߰� �ϱ�
		 	4. ��ȸ�� 10����
		 	5. ���������� ���­��ٰ� ǥ�� ���߸� ����ٰ� ǥ��
		 	6. �ѹ��� �Ͻðڽ��ϱ�? ����
		 */
	/*	
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()* 100);
		int user = 1;
		
		System.out.println("����  = " + random );
		
		for (int i = 1; i <= 10; i++) {
				user = sc.nextInt();
				if (user == random) {
					System.out.println("�����Դϴ�!");
				}else {
					System.out.println("Ʋ�Ƚ��ϴ� �ٽ� �õ����ּ���!");
				}
			 System.out.println(i +"�� �õ��ϼ̽��ϴ�. "+ "��ȸ�� "+ (10-i) +" �� �����̽��ϴ�.");
		}
	*/
		//�����ڵ� �ϼ�
		/*
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()* 100);
		int i= 1;
		
		while(true) {
			System.out.println("����  = " + random );
			System.out.print("���ڸ� �Է����ּ���(0~99) : ");
			int user = sc.nextInt();
			
			if (user == random) {
				System.out.println("");
				System.out.println("�����Դϴ�!");
					System.out.print("�ٽ� �Ͻðڽ��ϱ�? y/n :");
					String a=sc.next();
						if(a.equals("n")) {
							System.out.println("�� ��������~");
							break;
						}
						else {
						  i=1;
						  continue;
						}
			}else if(user < random){
				System.out.println("�� �����ϴ�.");
				System.out.println(i +"�� �õ��ϼ̽��ϴ�. "+ "��ȸ�� "+ (10-i) +" �� �����̽��ϴ�.");
				System.out.println("");
					if (i==10) {
						System.out.println("�� ���߼̽��ϴ�.");
						System.out.print("�ٽ� �Ͻðڽ��ϱ�? y/n :");
						String a=sc.next();
							if(a.equals("n")) {
								System.out.println("�� ��������~");
								break;
							}
							else {
							  i=1;
							  continue;
							}
					}
				++i;
				continue;
			}
			else if(random < user){
				System.out.println("�� �����ϴ�.");
				System.out.println(i +"�� �õ��ϼ̽��ϴ�. "+ "��ȸ�� "+ (10-i) +" �� �����̽��ϴ�.");
				System.out.println("");
					if (i==10) {
						System.out.println("�� ���߼̽��ϴ�.");
						System.out.print("�ٽ� �Ͻðڽ��ϱ�? y/n :");
						String a=sc.next();
							if(a.equals("n")) {
								System.out.println("�� ��������~");
								break;
							}
							else {
							  i=1;
							  continue;
							}
					}
				++i;
				continue;
			}
			
		}
		System.out.println("���� ���߱� ������ �����մϴ�.");
	
		*/
		Scanner sc = new Scanner(System.in);
		
		int rand_num; 	//������ ����
		int user_num;	//�����κ��� �Է¹��� ��
		boolean clear;	// ���������� �Ҹ�
		
		////////////////////////replay
		
		while(true) {
			//1.�ʱ�ȭ
			clear = false;
			
			//2.random��
			rand_num = (int)(Math.random()*100) +1;
			
			/////////////////////////////loop 10ȸ
			int w = 0;
			while(w <10) {
				//3. user �Է�
				System.out.print("number = ");
				user_num = sc.nextInt();
				
				//4. ��
				int msg = 0;
				if(user_num > rand_num) {
					msg = 1;
				}else if(user_num < rand_num) {
					msg = 2;
				}else {
					clear=true;
				}
				//5. �޼��� ���
				switch(msg) {
					case 1:
						System.out.println("�ʹ� Ů�ϴ�.");
						break;
					case 2:
						System.out.println("�ʹ� �۽��ϴ�.");
						break;
						
				}
				w++;
			}	
			///////////////////////////////
			//��� ���
			if(clear) {
				System.out.println("Game Clear!!!");
			}else {
				System.out.println("Game Over");
			}
			//7. ���÷��� �Է�
			String replay;
			
			while(true) {
				System.out.println("���Ǵ�? (y/n) = ");
				replay = sc.next();
				
				if(replay.equals("y")||replay.equals("n")) {
					break;
				}else {
					System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ��Է����ּ���");
				}
			}
			
			if(replay.equals("n")) {
				System.out.println("�ȳ��� ������");
				break;
			}
			System.out.println("�ٽ� �����մϴ�.");
		}
		//////////////////////////////////////////////
	}

}
