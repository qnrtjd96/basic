
public class wrapper {

	public static void main(String[] args) {
	/*
	 	Wrapper Class
	 	일반 자료형 (int, char, double)을 클래스화 한것
	 	일반 자료형 			class
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
		
		//숫자 -> 문자열
		String s = String.valueOf(num);
		String s1 = iobj.toString();
		System.out.println(s1);
		
		//문자열 - > 숫자
		String str = "12300";
		num = Integer.parseInt(str);
		
		// 소수 -> 문자열
		double d =123.4567;
		Double d1 = new Double(123.45678);
		String s2 = d1.toString();
		
		//문자열 - > 소수
		d= Double.parseDouble("123.32456");
		System.out.println(d);
		
	}

}
