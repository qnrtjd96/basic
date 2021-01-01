package work9;

import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int a;
		
		a= sc.nextInt();               				
		int count = a*10;
		
		if(10<=count && 20>=count) {
			System.out.println("입력한 수는 10보다 크고 20보다 작습니다.");
		}
		else if(20<=count && 30>=count) {
			System.out.println("입력한 수는 20보다 크고 30보다 작습니다.");
		}
		else if(30<=count && 40>=count) {
			System.out.println("입력한 수는 30보다 크고 40보다 작습니다.");
		}
		else if(40<=count && 50>=count) {
			System.out.println("입력한 수는 40보다 크고 50보다 작습니다.");
		}
		else if(50<=count && 60>=count) {
			System.out.println("입력한 수는 50보다 크고 60보다 작습니다.");
		}
		else if(60<=count && 70>=count) {
			System.out.println("입력한 수는 60보다 크고 70보다 작습니다.");
		}
		else if(70<=count && 80>=count) {
			System.out.println("입력한 수는 70보다 크고 80보다 작습니다.");
		}
		else if(90<=count && 100>=count) {
			System.out.println("입력한 수는 90보다 크고 100보다 작습니다.");
		}
		else {
			System.out.println("측정할수 없습니다.");
		}
		
		
		//선생님방식
//		int num = 0;
//		for(int i = 0;i < 20; i++) {			
//			num = i * 10;			
//			if(number > num && number <= num + 10) {
//				System.out.println("number는 " + num + "보다 크고 " + (num + 10) + "의 범위안에 있습니다");
//			}			
//		}
		

	}

}
