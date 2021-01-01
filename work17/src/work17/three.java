package work17;

public class three {

	public static void main(String[] args) {
		
		/*
		 	다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
			변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서
			출력하라. 
			단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다. 프로그램을 완성하시오.
			
			[실행결과]
			money=2680
			500원: 5
			100원: 1
			50원: 1
			10원: 3

		 */
		// 큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money="+money);
			for(int i=0; i<coinUnit.length; i++) {
				System.out.println(coinUnit[i]+"원: "+ money / coinUnit[i]);
		        money %= coinUnit[i];
			}
			
			/*
			 * result = c - a;
							System.out.println("================================");
							System.out.println("거스름돈은 " + result + "원 입니다.");
							
							int re1 = result / 5000;
							int re2 = (result % 5000) / 1000;
							int re3 = ((result % 5000) % 1000) / 500;
							int re4 = (((result % 5000) % 1000) % 500) / 100;
							int re5 = ((((result % 5000) % 1000) % 500) % 100) / 50;
							int re6 = (((((result % 5000) % 1000) % 500) % 100) % 50) /10;
									
							System.out.println("잔돈은 5000원짜리"+ re1 +"장");
							System.out.println("잔돈은 1000원짜리"+ re2 +"장");
							System.out.println("잔돈은 500원짜리"+ re3 +"개");
							System.out.println("잔돈은 100원짜리"+ re4 +"개");
							System.out.println("잔돈은 50원짜리"+ re5 +"개 입니다.");
							System.out.println("잔돈은 10원짜리"+ re6 +"개 입니다.");
			 */
	}

}