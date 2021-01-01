
public class MainClass {

	public static void main(String[] args) {
		/*
		 	(자료형)우선순위
		 	boolean 낮음
		 	byte
		 	short
		 	int
		 	long
		 	float
		 	double	높음
		 	
		 	자료형변환: 자동, 강제(cast)
		 */
		
		short sh =23456;
		int i;
		
		i=sh;	//자동형변환
		System.out.println( i );
		
		i=234;
		sh = (short)i;
		
		System.out.println(sh);
		
		long lo = 12345678654321L;
		float f = lo;
	}

}
