import java.util.Arrays;
import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		/*
	 	Sort : ����
	 		   ����, ����, �պ�, ��
	 		   
	 		   ���� ���� �����Ұ�!!!!
	 		   
	 		   2 6 1 5 3 4
	 		   
	 		   1 2 3 4 5 6	����
	 		   6 5 4 3 2 1	����
	 		   
	 		   swap(��ȯ)
	 		   a = 1;
	 		   b = 2;
	 		   b = temp;
	 		   
	 */
		/*
	int number[] = {4, 7, 2, 5, 3, 1, 6};
	
	int temp;
	
	for (int i = 0; i < number.length- 1; i++) {	// 0 ~6
		for (int j = i + 1; j < number.length; j++) { // 0~6
			if (number[i] > number[j]) { //����
				//swap
				temp = number[i];
				number[i] = number[j];
				number[j] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(number));
	*/
	/*
	Scanner sc = new Scanner(System.in);
	int number[]; //�Է¹��� ����
	int Max; //�ִ밪
	int count;
	
	//�Է�
	System.out.println("�Է��� ������ ������ �Է����ּ��� = ");
	count = sc.nextInt();
	number = new int[count];

	// � ����
	
	// ���� �Է�
	
	// ����/����
	
	*/
		int count = 0;					// �Է¹��� ������ ���� 
		int[] num;						// �Է¹��� ���� 
		int numMax = 0;					// �ִ밪 
		int search;						// �˻��� ���� 
		Boolean searchCheck = false;	// �˻��� ���� üũ 
		
		Scanner scanner = new Scanner(System.in);
		// �Է¹��� ���� ���� �Է¹ޱ�
		System.out.print("�Է��� ������ ������ ? (100�� �̸�) : ");
		count = scanner.nextInt();
		num = new int[count];		
		
		// ���� �Է¹ޱ� 
		System.out.print(count + " ���� ���ڸ� �Է��ϼ���! : ");
		for (int i = 0 ; i < count ; i++) {
			num[i] = scanner.nextInt();		
		}
		
		// �˻��� ���� �ޱ� 
		System.out.print("�˻��� ���ڴ� ? :");
		search = scanner.nextInt();
		
		// �˻��� ���� üũ �� ��� 
		for (int i = 0 ; i < count ; i++)
			if (search == num[i]) {
				searchCheck = true;
				System.out.println(search + "�� ��ġ�� " + i + "��° �Դϴ�.");
			}				
		
		if (!searchCheck)
			System.out.println(search + "�� �������� �ʽ��ϴ�.");
	}

}
