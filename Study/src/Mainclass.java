
public class Mainclass {

	public static void main(String[] args) {
		
		//����Լ�
		System.out.println("�ȳ� �ڹ�");
		System.out.print("�ȳ� �ڹ�");
		
		//printf ġ�� ���� %d�� ����
		System.out.printf("%d \n",123);
		
		//����, ���
		//2����, 16����
		
		//����
		//����
		byte by;   	//1 byte 1111 1111
		by = -128;	// 127~ -128
		
		short s; 	// 2 byte
		s=1234;
		
		int i;	//4byte
		i=123456;
		
		long lo; 	//8byte
		lo=12345678L;
		
		//�Ҽ�
		float f; //4 byte
		f = 1234.56789F;
		System.out.println("f = " + f); //������Ѻ��� �Ҽ����� 4�ڸ��ۿ�����������
		
		double d;
		d = 1234.567890123456; //�׷��� �׳� double ������ ����.
		System.out.println(d);
		
		//����
		char c; //2 byte
		c = 'A';
		c = '��';
		
		String str;
		str = "hello";
		str = "A";
		str = "hello" + "world";
		
		//��
		boolean b;
		b = true;
		b = false;
					
	}

}
