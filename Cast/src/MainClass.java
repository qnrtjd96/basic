
public class MainClass {

	public static void main(String[] args) {
		/*
		 	(�ڷ���)�켱����
		 	boolean ����
		 	byte
		 	short
		 	int
		 	long
		 	float
		 	double	����
		 	
		 	�ڷ�����ȯ: �ڵ�, ����(cast)
		 */
		
		short sh =23456;
		int i;
		
		i=sh;	//�ڵ�����ȯ
		System.out.println( i );
		
		i=234;
		sh = (short)i;
		
		System.out.println(sh);
		
		long lo = 12345678654321L;
		float f = lo;
	}

}
