package workfinal;

import java.util.Scanner;

public class copy {
	static final int MAX = 5;
	public static void main(String[] args) {
		  // ������� ���α׷�
		  // 5���� ������ �Է¹޾� ����ϴ� ���α׷�
		  // �Է� : ����, ��������, ��������, ���������� �Է¹޾Ƽ�
		  // ��»��� : �Է³��� ��µǰ� / �л��� ����, �л��� ���, �л��� ����� ����, �л��� ���
		  
		  String[] name = new String[MAX];
		  int[] kor = new int[MAX];
		  int[] eng = new int[MAX];
		  int[] math = new int[MAX];
		  
		  int[] total = new int[MAX];
		  double[] avg = new double[MAX];
		  String[] grade = new String[MAX];
		  int[] rank = new int[MAX];
		  
		  Scanner sc = new Scanner(System.in);
		  
		  for(int i=0; i<MAX; i++){
		   System.out.print((i+1) + "�� �л��� �̸��� �Է��ϼ���>>");
		   name[i] = sc.next();

		   do {
		    System.out.print((i + 1) + "�� �л��� ������� �Է��ϼ���>>");
		    kor[i] = sc.nextInt();
		   } while (kor[i] < 0 || kor[i] > 100);
		   do {
		    System.out.print((i + 1) + "�� �л��� ������� �Է��ϼ���>>");
		   } while (eng[i] < 0 || eng[i] > 100);
		   eng[i] = sc.nextInt();
		   do {
		    System.out.print((i + 1) + "�� �л��� ���м����� �Է��ϼ���>>");
		    math[i] = sc.nextInt();
		   } while (math[i] < 0 || math[i] > 100);
		   
		   total[i] = kor[i] + eng[i] + math[i]; // total
		   avg[i] = total[i] / 3; // avg

		   if(avg[i]>=90){
		    grade[i] = "A";
		   }else if(avg[i]>=80){
		    grade[i] = "B";
		   }else if(avg[i]>=70){
		    grade[i] = "C";
		   }else if(avg[i]>=60){
		    grade[i] = "D";
		   }else{
		    grade[i] = "F";
		   }
		   
		   rank[i] = 1; // ����� ��� 1�� �ʱ�ȭ
		   
		  } //for �Է�, ����, ��� �������
		  
		  for(int i=0; i<MAX; i++){
		   for(int j=0; j<MAX; j++){
		    if(i!=j && avg[i]<avg[j]){ // �Ȱ����� �ǳʶٱ�
		     rank[i]++;
		    }
		   }
		   
		  }
		  
		  System.out.println("����\t����\t����\t����\t����\t���\t����\t���");
		  System.out.println("------------------------------------------------------------");
		  
		  for(int i=0; i<MAX; i++){
		   System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d",
		     name[i], kor[i], eng[i], math[i], total[i], avg[i], grade[i], rank[i]);
		   System.out.println();
		   
		  }
		  
		  sc.close();
		 } // main

		}