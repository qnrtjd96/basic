
public class Mainclass {

	public static void main(String[] args) {
		
		//출력함수
		System.out.println("안녕 자바");
		System.out.print("안녕 자바");
		
		//printf 치면 나옴 %d는 정수
		System.out.printf("%d \n",123);
		
		//변수, 상수
		//2진수, 16진수
		
		//변수
		//숫자
		byte by;   	//1 byte 1111 1111
		by = -128;	// 127~ -128
		
		short s; 	// 2 byte
		s=1234;
		
		int i;	//4byte
		i=123456;
		
		long lo; 	//8byte
		lo=12345678L;
		
		//소수
		float f; //4 byte
		f = 1234.56789F;
		System.out.println("f = " + f); //실행시켜보면 소수점은 4자리밖에나오지않음
		
		double d;
		d = 1234.567890123456; //그래서 그냥 double 변수를 쓴다.
		System.out.println(d);
		
		//문자
		char c; //2 byte
		c = 'A';
		c = '한';
		
		String str;
		str = "hello";
		str = "A";
		str = "hello" + "world";
		
		//논리
		boolean b;
		b = true;
		b = false;
					
	}

}
