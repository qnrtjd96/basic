
public class wrapper {

	public static void main(String[] args) {
	/*
	 	Wrapper Class
	 	�Ϲ� �ڷ��� (int, char, double)�� Ŭ����ȭ �Ѱ�
	 	�Ϲ� �ڷ��� 			class
	 	boolean				boolean
	 	byte				Byte
	 	short				Short
	 	int					Integer -------
	 	
	 	float				Float
	 	double				Double		---------
	 	
	 	char[]				String		--------------------
	 */
		
		//Integer == int
		int num = 12;
		
		Integer inum = 23;
		Integer iobj = new Integer(23);
		
		//���� -> ���ڿ�
		String s = String.valueOf(num);
		String s1 = iobj.toString();
		System.out.println(s1);
		
		//���ڿ� - > ����
		String str = "12300";
		num = Integer.parseInt(str);
		
		// �Ҽ� -> ���ڿ�
		double d =123.4567;
		Double d1 = new Double(123.45678);
		String s2 = d1.toString();
		
		//���ڿ� - > �Ҽ�
		d= Double.parseDouble("123.32456");
		System.out.println(d);
		
	}

}
