public class MainClass {

		//main 함수
		public static void main(String[] args) {
			System.out.println("Hello Hava");
			System.out.println("println"); //문장 출력 후 엔터
			System.out.println();//안써도 엔터
			System.out.print("print"); // 문장만 출력
			System.out.println("println");
			
			
			//문자열과 정수 구분
			System.out.println(123 + 2);
			System.out.println("123" + 2);
			System.out.println(2+ "123" + 4);
			System.out.println(123.12+ 123.12);
			
			//printf
			System.out.printf("%d", 123); //들여쓰기가안됨
			
			System.out.println();
			// 들여쓰기 가능한건 \n == 개행(들여쓰기)
			// escape sequence라고한다.
			System.out.printf("%d \n", 123);
			System.out.printf("%d", 123);
			
			System.out.println();
			//문자열에서도 \n먹으면 개행이됨
			System.out.print("hello \n");
			System.out.print("WORLD");
			System.out.print("java \n");
			
			// \쓰고싶으면 \\두개써야함
			System.out.println("\\");
			
			// ""포함 표시하는법
			System.out.println("\" \"");
			
			//''포함 표시하는법
			System.out.println("\"Hi nice to meet you\"");
			
			// 하나의 문자만 쓸때는 ''사용
			System.out.println('A');
			
			
		}
		//주석
		/*
		 * 
		 * 범위주석
		 * 
		 *
		 * 
		 * 
		 */
		
		/*
		  1. source code
		  
		  2. compile (code - > 기계어(0,1))
		  
		  3. build(exe파일 생성)
		  
		  4. link
		  
		  5. 실행
		 */
}
