import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
		 		Array: �迭 (�������� �����ϱ����ؼ�����)
		 				���� �ڷ��� �������� ����.
		 		����: �迭 ��������
		 			 �ڷ��� �迭������[] =new �ڷ���[�迭�� �Ѽ�];
		 			 int number[] =new int[10];
		 			 				�����Ҵ�
		 			 				
		 			 	����������[0] = 1;
		 			 					0:index number
		 			 		:
		 			 	�迭������[9]
		 			 	
		 			 	����: static
		 			 	����: dynamic
		 			 	
		 			 	�ʱ�ȭ initialize
		 			 	
		 			 	//�������ʱ�ȭ
		 			 	int n = 10;
		 			 	int n;
		 			 	n= 10;
		 			 	
		 			 	//�迭�� �ʱ�ȭ
		 			 	  int array[]= {11, 22, 33}; 
		 			 	
		 */
//		int number; 	//local variable(��������)
//		{
//			number = 12;
//			int num;	//local variable(��������)
//		}
		
		/*
		 	memory : stack, 	heap, 	static, 	sys
		 			 ��������		�����Ҵ�	��������	
		 			 Array[] 	[][][]	
		 */
//		int Array[]	=	new int[5];
//		int []Array = new int[5];  �Ѵٰ���
//		int[] Array = new int[5]; //0~ n-1
//		
//		//�迭 ����
//		Array[0] = 1;
//		Array[1] = 2;
//		Array[2] = 3;
//		Array[3] = 4;
//		Array[4] = 5;
//		
//		System.out.println(Array[0]);
//		System.out.println(Arrays.toString(Array));
//		System.out.println(Array);
	
/*		int Array1[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(Array1));  //�迭���� �̱�
		System.out.println(Array1.length);  //�迭 ���̻̱�
*/		
		// char
		// �迭 5~ 10
		// ���� ����
		// ���
		
		// String
		// �迭 3
		// ���ڿ� ����
		
		// String
		// �迭 �ʱ�ȭ 5��
		// ���
		
		
		//1������
		char Array[] = {'A','B','c','d','e','f','g'};
		
		System.out.println(Arrays.toString(Array));
		
		//2������
		String Array1[] = {"������¯","¯¯��","����"};
		System.out.println(Arrays.toString(Array1));
		
		//3������
		String Array2[] = {"1","2","3","4","5"};
		System.out.println(Array2[0]);
		
	}

}
