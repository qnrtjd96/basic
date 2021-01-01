import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
		 		Array: 배열 (변수들을 관리하기위해서나옴)
		 				같은 자료형 변수들의 묶음.
		 		형식: 배열 변수선언
		 			 자료형 배열변수명[] =new 자료형[배열의 총수];
		 			 int number[] =new int[10];
		 			 				동적할당
		 			 				
		 			 	벼열변수명[0] = 1;
		 			 					0:index number
		 			 		:
		 			 	배열변수명[9]
		 			 	
		 			 	정적: static
		 			 	동적: dynamic
		 			 	
		 			 	초기화 initialize
		 			 	
		 			 	//변수의초기화
		 			 	int n = 10;
		 			 	int n;
		 			 	n= 10;
		 			 	
		 			 	//배열의 초기화
		 			 	  int array[]= {11, 22, 33}; 
		 			 	
		 */
//		int number; 	//local variable(지역변수)
//		{
//			number = 12;
//			int num;	//local variable(지역변수)
//		}
		
		/*
		 	memory : stack, 	heap, 	static, 	sys
		 			 지역변수		동적할당	정적변수	
		 			 Array[] 	[][][]	
		 */
//		int Array[]	=	new int[5];
//		int []Array = new int[5];  둘다가능
//		int[] Array = new int[5]; //0~ n-1
//		
//		//배열 접근
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
		System.out.println(Arrays.toString(Array1));  //배열갯수 뽑기
		System.out.println(Array1.length);  //배열 길이뽑기
*/		
		// char
		// 배열 5~ 10
		// 문자 대입
		// 출력
		
		// String
		// 배열 3
		// 문자열 대입
		
		// String
		// 배열 초기화 5개
		// 출력
		
		
		//1번문제
		char Array[] = {'A','B','c','d','e','f','g'};
		
		System.out.println(Arrays.toString(Array));
		
		//2번문제
		String Array1[] = {"강산이짱","짱짱맨","루삥뽕"};
		System.out.println(Arrays.toString(Array1));
		
		//3번문제
		String Array2[] = {"1","2","3","4","5"};
		System.out.println(Array2[0]);
		
	}

}
