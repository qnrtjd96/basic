
public class MainClass {

	public static void main(String[] args) {
		/*
		  	숫자(상수) : 변할수없는수
		  		
		  		2진수: 0~1
		  		8진수: 0~7
		  		10진수 : 0~9
		  		16진수: 0~9 a b c d e f
		  		
		  		컴퓨터의 최소단위 == bit -> 0/1
		  						1 byte == 8 bit
		  						
		  						1111 1111 -> 255+ 0 >256개의 숫자를 표현할수 있음
		  						
		  						1010 1100 -> 16진수 -> AC
		  						
		  	변수 : variable 변할수 있는수
		  		자료형(정수, 소수, 문자, 문자열, 논리)
		  		예약어(int) : 프로그램에서 사용하는 단어
		  		
		 */
		
		//자료형 변수선언 -> 정수의 값을 저장할 수 있는 공간
		int i;
		
		i=1;
		System.out.println("i = " + i);
		
		i=2;
		System.out.println("i = " + i);
		
		//변수명 작명 규칙(동일하면 안됨)
		int aa;
		int AA; 		//대소문자는 다른취급이라서 가능
		int _number; 	//  _ 사용가능
		int number_; 	// 뒤에도 사용가능
		int 강산;			// 한글 변수명도 가능
		
			//안되는것
		//int int;  	//예약어는 사용불가
		//int _number 	//같은 문자는 사용불가
		//int -num;  	//-연산자는 사용불가
		//int *num;		//*사용불가
		//int 1num;		//앞에 숫자 사용불가
		
		강산 = 123;
				System.out.println("강산이는? " + 강산);
				
		//변수의 종류
		/*
		 숫자형
		 	정수
		 		byte	1byte -> 8bit
		 		short	2byte
		 		int		4byte
		 		long	8byte
		 		
		 	소수
		 		float	4byte
		 		double	8byet
		 		
		 문자형
		 	문자
		 		char	2byte	character
		 		
		 	논리형
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
	
			//문자열 넣기
			char c;
			c = 'A';
			System.out.println("c = " + c);
			
			String str;
			str = "안녕하세요";
			System.out.println("str = " + str);
			
			
			//논리연산
			
			boolean b;
			b = true; //참
			b = false; //거짓
			System.out.println("b = " + b);
			
			//escape sequence
			// \n
			// \"
			// \'
			// \t 띄어쓰기
			
	}

}
