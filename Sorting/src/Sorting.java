import java.util.Arrays;

public class Sorting {

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
		int number[] = {4, 7, 2, 5, 3, 1, 6};
		
		//�Է�
		// � ����
		
		// ���� �Է�
		
		// ����/����
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
	}

}
