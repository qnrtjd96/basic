import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, c, result, result1;
		String b;
		System.out.println("���� �Դϴ�. ���ڸ� �Է����ּ���");
		
		//ù��° ���� �Է¹ޱ�
		a = sc.nextInt();
		
		//�������Է�
		System.out.println("�����ڸ� �Է����ּ��� +,-,*,/");
		b = sc.next();
		
		//�ι�°���� �Է¹ޱ�
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		c = sc.nextInt();
		
		//������
		//+ - * / %
		result = a + c;
		result1 = a - c;
		
		System.out.println("+�������� " + result);
		System.out.println("-�������� " + result1);
		System.out.println("*�������� " + a * c);
		System.out.println("/�������� " + a / c);
	}
}
