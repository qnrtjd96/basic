package workfinal;

import java.util.Arrays;
import java.util.Scanner;

public class finial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 	menu
		  
		  	1. �л��� �Է�		  	
		  	      �л� ������(�̸�, ����, ����, ����) �Է�
		  			
			2. ���� Sum
			
			3. ��� Avg
			
			4. 1��	Max
			
			5. �õ�	Min	
			
			6. �������� ���� ���
		*/
		
		String student[][] = {
				{ "ȫ�浿", "90", "30", "60" },
				{ "������", "10", "40", "70" },
				{ "������", "20", "50", "80" },
		};
		
		while(true) {
		
			System.out.println("menu--------------------");
			System.out.println("1.�л����� �Է�");
			System.out.println("2.����");
			System.out.println("3.���");
			System.out.println("4.1�� �л�");
			System.out.println("5.�õ� �л�");
			System.out.println("6.�������� ���� ���");
			
			System.out.print(">> ");
			int workNum = sc.nextInt();
			
			if(workNum == 1) {		// �Է�				
				System.out.print("�л� ����� �Է��Ͻðڽ��ϱ�? = ");
				int count = sc.nextInt();
				
				student = new String[count][4];	// �����Ҵ�
								
			//	String title[] = { "�̸�", "����", "����", "����" };
				
				int w = 0;
				while(w < count) {					
					System.out.println( (w + 1) + "��° �л� >>" );
					
					System.out.print("�̸� = ");
					String name = sc.next();
					
					System.out.print("���� = ");
					String lang = sc.next();
					
					System.out.print("���� = ");
					String eng = sc.next();
					
					System.out.print("���� = ");
					String math = sc.next();
					
					student[w][0] = name;
					student[w][1] = lang;
					student[w][2] = eng;
					student[w][3] = math;
					
					/*
					for (int i = 0; i < title.length; i++) {
						System.out.print(title[i] + " = ");
						String str = sc.next();						
						
						student[w][i] = str;
					}
					*/
					
					w++;
				}	
				
				// Ȯ�ο�
				for (int i = 0; i < student.length; i++) {
					System.out.println(Arrays.toString(student[i]));
				}				
			}
			else if(workNum == 2) {	// ����				
				int sum = 0;
				for (int i = 0; i < student.length; i++) {
					for (int j = 1; j < student[i].length; j++) {
						sum = sum + Integer.parseInt(student[i][j]);
					}
				}
				System.out.println("����:" + sum);				
			}
			else if(workNum == 3) { // ���
				int sum[] = new int[student.length];
				
				for (int i = 0; i < student.length; i++) {	// �л���
					for (int j = 1; j < student[i].length; j++) {
						sum[i] = sum[i] + Integer.parseInt(student[i][j]);
					}
				}							
				// System.out.println(Arrays.toString(sum));
				
				int allSum = 0;
				for (int i = 0; i < sum.length; i++) {
					allSum = allSum + sum[i];
				}
				
				double avg = allSum / student.length;
				System.out.println("���:" + avg);
			}
			else if(workNum == 4) { // 1��
				int sum[] = new int[student.length];
				
				for (int i = 0; i < student.length; i++) {	// �л���
					for (int j = 1; j < student[i].length; j++) {
						sum[i] = sum[i] + Integer.parseInt(student[i][j]);
					}
				}
				
				int max = 0;
				int index = 0;
				// 1�� ����
				for (int i = 0; i < sum.length; i++) {
					if(max < sum[i]) {	
						max = sum[i];
						index = i;
					}
				}		
				System.out.println("1������:" + max);
				
				// ����?
				System.out.println("1���л� �̸�:" + student[index][0]);
				
			}
			else if(workNum == 5) { // �õ�
				int sum[] = new int[student.length];
				
				for (int i = 0; i < student.length; i++) {	// �л���
					for (int j = 1; j < student[i].length; j++) {
						sum[i] = sum[i] + Integer.parseInt(student[i][j]);
					}
				}
				
				int min = sum[0];
				for (int i = 0; i < sum.length; i++) {
					if(min > sum[i]) {
						min = sum[i];
					}
				}
				
				System.out.println("��������:" + min);				
			}
			else if(workNum == 6 ) {  //[0][1], [1][1],[2][1]
				String language[][] = new String[student.length][2];
				for (int i = 0; i < language.length; i++) {
					language[i][0] = student[i][0];	// �̸�
					language[i][1] = student[i][1]; // ����
				}
				
				String temp[] = null;
				for (int i = 0; i < language.length - 1; i++) {
					for (int j = i+1; j < language.length; j++) {
						int s1 =Integer. parseInt(language[i][1]);
						int s2 = Integer. parseInt(language[j][1]);
						
						if(s1 < s2) {
							temp = language[i];
							language[i] = language[j];
							language[j] = temp;
						}
					}
				}
				
				for (int i = 0; i < language.length; i++) {
					System.out.println((i+1) + "�� " + language[i][0] + "���� : "+ language[i][1]);
				}
			}
		}
	}
}

