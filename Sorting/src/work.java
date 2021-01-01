import java.util.Arrays;
import java.util.Scanner;

public class work {

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
		/*
	int number[] = {4, 7, 2, 5, 3, 1, 6};
	
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
	*/
	/*
	Scanner sc = new Scanner(System.in);
	int number[]; //입력받을 숫자
	int Max; //최대값
	int count;
	
	//입력
	System.out.println("입력할 숫자의 갯수를 입력해주세요 = ");
	count = sc.nextInt();
	number = new int[count];

	// 몇개 정렬
	
	// 숫자 입력
	
	// 오름/내림
	
	*/
		int count = 0;					// 입력받을 숫자의 개수 
		int[] num;						// 입력받을 숫자 
		int numMax = 0;					// 최대값 
		int search;						// 검색할 숫자 
		Boolean searchCheck = false;	// 검색한 숫자 체크 
		
		Scanner scanner = new Scanner(System.in);
		// 입력받을 숫자 개수 입력받기
		System.out.print("입력할 숫자의 개수는 ? (100개 미만) : ");
		count = scanner.nextInt();
		num = new int[count];		
		
		// 숫자 입력받기 
		System.out.print(count + " 개의 숫자를 입력하세요! : ");
		for (int i = 0 ; i < count ; i++) {
			num[i] = scanner.nextInt();		
		}
		
		// 검색할 숫자 받기 
		System.out.print("검색할 숫자는 ? :");
		search = scanner.nextInt();
		
		// 검색할 숫자 체크 후 출력 
		for (int i = 0 ; i < count ; i++)
			if (search == num[i]) {
				searchCheck = true;
				System.out.println(search + "의 위치는 " + i + "번째 입니다.");
			}				
		
		if (!searchCheck)
			System.out.println(search + "는 존재하지 않습니다.");
	}

}
