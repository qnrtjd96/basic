package work14;

import java.util.Arrays;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		/*
		 	baseball
		 	
		 	1 ~10 -> 6 3 8
		 			 4 6 5 -> 1ball
		 			 6 1 2 -> 1strike
		 			 8 3 1 -> 1strike 1ball
		 	
		 	�������� 3�� 
		 	�������ڵ� 3���Է��ϰ��Ұ�
		 	
		 	���ǻ��� : �����Լ��� 766, 666, 111, 222 �� ���� ���ڰ� ������ �ȵ�
		 			  ������ ���� ���ڸ� �Է��ص� �ȵ�
		 	10���� ��ȸ�� �ָ��
		 	�ٽ����Ǵ��� �����
		 	
		 	
		 	1. �������� 3�� �����ϱ�(�������� �ߺ��ȵǰ�)
		 	2. �������� 3�� �Է��ϱ�
		 	3. �Ű� �׸� �Ǻ��ϱ�
		 	4. ��������
		 	5. 10����ȸ ���Ǵ� ����
		 	
		 	//�Է¹��� ���ڿ��� ��� �������� ����
		 	//����
		 	//����
		 	//String -> Integer
		 	 
		 //���������
		int com[] = new int[3]; // ��ǻ���� �迭 3�� 
		int user[] = new int[3]; // ������� �迭 3�� 
		int ch = 0; 
		int counter = 0; 
		

		boolean randomball = true; 

		while (randomball) { 
			for (int i=0; i<com.length; i++) { 
					com[i] = (int)(Math.random() * 9) + 1; 
				} 
			if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) { 
				randomball = false; 
			} 
		} 
		randomball = true; 
		System.out.println("�߱����� ����");
		System.out.println("��ǻ�Ͱ� ���� ���ڴ�? : "+ Arrays.toString(com));
		
		while (randomball) { 
			int strike = 0; 
			int ball = 0; 
			System.out.println("1~9���� ���ڸ� 3�� �Է��ϼ���"); 
			Scanner kk = new Scanner(System.in); 
	
				for (int i=0; i < user.length; i++) { 
					try { ch = kk.nextInt(); user[i] = ch; 
						if (ch > 10 || ch < 0) { 
							System.out.println("1~9�� ���ڸ� �Է��ϼ���"); 
							} 
					} catch (Exception e) { 
					System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
					}
					
				} 

			for (int i=0; i<com.length; i++){ 
				for (int j=0; j<user.length; j++) { 
						if (com[i] == user[j] && i == j){ 
								strike++; 
						} else if (com[i] == user[j] && i != j){ 
							ball++; 
						} 
	
						} 
			} 
			System.out.println(strike + "��Ʈ����ũ  " + ball + "��"); 
				if (strike == 3){ 
					randomball = false; 
				} 
			counter++; 
		} 
		
		System.out.println("Ƚ�� : " + counter); 
		System.out.println("���� ��"); 
		 
		*/
		
		Scanner sc = new Scanner(System.in); 
		int r_num[]= new int[3]; //���� ���� 3��
		int u_num[]= new int[3]; //���� ���� 3��
		boolean clear;
		
		
		//1. �ʱ�ȭ initialize
		clear = false;
		
		//2. random number 3 1~10
		//���1
/*		for(int i = 0; i < r_num.length; i++) {
			r_num[0] =(int)(Math.random() * 10)+1;
		
			//���� �������� ����
			if(r_num[0] != r_num[1] && r_num[1] != r_num[2] && r_num[2] != r_num[0]) {
				break;
			}
		}
		/*
		 	1 2 3 4 5 6 7 8 9 10
		 	0 0 0 1 1 0 0 0 0 
		 		  4
		 		    5
		 */
		//���2 �̰���¥ �߿��ϴ�!!!!!!!!!!!!!!!11
		boolean swit[] = new boolean[10];
		
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false; //0 0 0 0 0 0 0 0 0 ����ġ�� �����ִ°�
		}
		int w = 0;
		while(w<3) { //�̰Կ� �����ڵ�ĸ� 10���� �������ڸ� 3�� �ٲٸ� �����ϱ⋚���̴�.    ++++++++ex) ���� �м��� ��ī�� �м��� �ζǹ�ȣ ���� �����ϸ�?) ���ܼ� �̱⵵ ���� swit = r-1
			int r = (int)(Math.random() * 10); // 0 ~ 9
			if(swit[r] == false) {
				swit[r] = true;  //0 0 0 1 0 0 0 0 0 0
				r_num[w] = r+1; // 1~10
				w++;
			}
		}
		System.out.println(Arrays.toString(r_num));
		///////////////////////////loop
		/*
		int gameloop=0;
		while(gameloop<10) {
		
			//3. user number 3
			while(true) {
				for (int i = 0; i < u_num.length; i++) {
					System.out.print(i+ 1+ "�� ° �� : ");
					u_num[i] =sc.nextInt();
				}
				if(u_num[0] != u_num[1] && u_num[1] != u_num[2] && u_num[2] != u_num[0]) {
					System.out.println("�ߺ��� ���ڰ� �ֽ��ϴ�.");
					continue;
				}
				break;
			}
			
			//4. ����
			int strike, ball;
			strike = ball = 0;
			
			//ball
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (u_num[i] == r_num[j] && i != j) {
						ball++;
					}
				}
			}
			
			//strike
			for (int i = 0; i < 3; i++) {
				if (u_num[i] == r_num[i]) {
					strike++;
				}
			}
			
			//Ż���ڵ�
			if(strike ==3) {
				clear = true;
				break;
			}
			
		//5. �޼���
		System.out.println(strike + "��Ʈ����ũ" + ball +"���Դϴ�.");
			gameloop++;
		}
		///////////////////////////loop
		
		//6. ������
		*/
		
	}

}
