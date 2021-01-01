import java.util.Arrays;

public class Araay {

	public static void main(String[] args) {
		/*
		 	배열 : Array
		 	같은자료형 변수들의 묶음
		 	
		 	int array[] = new int[5];
		 	array[0] = 1;			키 : 값
		 	array[1] = 2;			0	1
		 	array[2] = 3;			str : 1 -> json
		 	array[3] = 4;
		 	array[4] = 5;
		 	
		 	int array[] = {1, 2, 3, 4, 5};
		 	
		 	2차원배열
		 	int array[][]	=	new int[3][4];
		 	int []array[]	=	new int[3][4];
		 	
		 	
		 */
		
		//1번째 사용법
		int array[][]	= new int[3][];
		
		int arr1[]	=	{1,2,3};
		array[0] = arr1;
		
		int arr2[] = {4,5,6,7};
		array[1] = arr2;
		
		int arr3[] = {8,9};
		array[2] = arr3;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		/*
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
			
		}*/
		
		/*
		 System.out.println(array[0][0]); 
		 System.out.println(array[0][1]);
		 System.out.println(array[0][2]);
		 System.out.println(array[1][0]);
		 
		 
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		System.out.println(array[2].length);
		*/
		
		//2번쨰 사용법
		
		int array2[][]= new int[4][3];
		
		array2[0][0] = 11;
		array2[0][1] = 12;
		array2[0][2] = 13;
		
		array2[1][0] = 21;
		array2[1][1] = 22;
		array2[1][2] = 23;
		
		array2[2][0] = 31;
		array2[2][1] = 32;
		array2[2][2] = 33;
		
		array2[3][0] = 41;
		array2[3][1] = 42;
		array2[3][2] = 43;
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		//3번쨰 사용법
		int array3[][]	=	{
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34}
		};
		
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
