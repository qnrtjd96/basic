import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		/*
		 	Sort : 정렬
		 		   버블, 선택, 합병, 퀵
		 		   
		 		   퀵은 따로 공부할것!!!!
		 		   
		 		   2 6 1 5 3 4
		 		   
		 		   1 2 3 4 5 6	오름
		 		   6 5 4 3 2 1	내림
		 		   
		 		   swap(교환)
		 		   a = 1;
		 		   b = 2;
		 		   b = temp;
		 		   
		 */
		int number[] = {4, 7, 2, 5, 3, 1, 6};
		
		//입력
		// 몇개 정렬
		
		// 숫자 입력
		
		// 오름/내림
		int temp;
		
		for (int i = 0; i < number.length- 1; i++) {	// 0 ~6
			for (int j = i + 1; j < number.length; j++) { // 0~6
				if (number[i] > number[j]) { //오름
					//swap
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(number));
	}

}
