
public class MainClass {

	public static void main(String[] args) {
		/*
		  	����(���) : ���Ҽ����¼�
		  		
		  		2����: 0~1
		  		8����: 0~7
		  		10���� : 0~9
		  		16����: 0~9 a b c d e f
		  		
		  		��ǻ���� �ּҴ��� == bit -> 0/1
		  						1 byte == 8 bit
		  						
		  						1111 1111 -> 255+ 0 >256���� ���ڸ� ǥ���Ҽ� ����
		  						
		  						1010 1100 -> 16���� -> AC
		  						
		  	���� : variable ���Ҽ� �ִ¼�
		  		�ڷ���(����, �Ҽ�, ����, ���ڿ�, ��)
		  		�����(int) : ���α׷����� ����ϴ� �ܾ�
		  		
		 */
		
		//�ڷ��� �������� -> ������ ���� ������ �� �ִ� ����
		int i;
		
		i=1;
		System.out.println("i = " + i);
		
		i=2;
		System.out.println("i = " + i);
		
		//������ �۸� ��Ģ(�����ϸ� �ȵ�)
		int aa;
		int AA; 		//��ҹ��ڴ� �ٸ�����̶� ����
		int _number; 	//  _ ��밡��
		int number_; 	// �ڿ��� ��밡��
		int ����;			// �ѱ� ������ ����
		
			//�ȵǴ°�
		//int int;  	//������ ���Ұ�
		//int _number 	//���� ���ڴ� ���Ұ�
		//int -num;  	//-�����ڴ� ���Ұ�
		//int *num;		//*���Ұ�
		//int 1num;		//�տ� ���� ���Ұ�
		
		���� = 123;
				System.out.println("�����̴�? " + ����);
				
		//������ ����
		/*
		 ������
		 	����
		 		byte	1byte -> 8bit
		 		short	2byte
		 		int		4byte
		 		long	8byte
		 		
		 	�Ҽ�
		 		float	4byte
		 		double	8byet
		 		
		 ������
		 	����
		 		char	2byte	character
		 		
		 	����
		 		boolean 1byte	true/false
		 		
		 */
			System.out.println();
			System.out.println();
			
			byte by;
			by=123;								//0000 0000
			System.out.println("by = " + by);	//-128 ~ 127
			
			short sh;
			sh=12345;
			System.out.println("sh =" + sh);
			
			int n;
			n=1234567;
			System.out.println("n = " + n);

			long lo;
			lo = 12345675;
			System.out.println("lo =" + lo);
			
			float f;
			f = 123.345f; //
			System.out.println("f = " + f);
			
			double d;
			d= 1234.1234567812345678;
			System.out.println("d = " + d);
	
			//���ڿ� �ֱ�
			char c;
			c = 'A';
			System.out.println("c = " + c);
			
			String str;
			str = "�ȳ��ϼ���";
			System.out.println("str = " + str);
			
			
			//������
			
			boolean b;
			b = true; //��
			b = false; //����
			System.out.println("b = " + b);
			
			//escape sequence
			// \n
			// \"
			// \'
			// \t ����
			
	}

}
