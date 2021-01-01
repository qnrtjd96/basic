package Main;

public class MainClass {

	public static void main(String[] args) {
			/*
			 	switch : 조건
			 			값이 명확, 범위 설정 불가. 소수는 사용불가
			 			
			 	형식
			 			Switch(대상이 되는 변수){
			 					case 값1: 
			 					처리1
			 					break;
			 					
			 					case 값1: 
			 					처리1
			 					break;
			 					  :
			 					default: 
			 					
			 				}
			 				
			 */
		
			int num = 2;                				
			switch(num){
				case 1:
					System.out.println("number은 1입니다.");
					break;
					
				case 2:
					System.out.println("number은 2입니다.");
					break;
					
				case 3:
					System.out.println("number은 3입니다.");
					break;
					
				default:
					System.out.println("1,2,3 중에 아무것도 없습니다.");
					break;
			}
			
			String d = "강산";				//c언어에서는 String이 안먹는데, 자바 최신버전에서는 먹음
			
			switch(d) {
				case "강산":
					System.out.println("강산");
					break;
			}
		}

}
