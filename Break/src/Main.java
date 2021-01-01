
public class Main {
	public static void main(String[] args) {
		/*
		 	break => 탈출
		 	
		 	break 만으로 사용할 수 없음
		 	loop문과 같이 사용해야한다. (for, while, do while)
		 	
		 	형식:
		 	for(int i =0; i< 10; i++){
		 		처리
		 		if(i ==5){
		 			break;
		 			}
		 		}
		 */
		for(int i =0; i< 10; i++){
	 		System.out.println("loop i = " + i);
	 		if(i ==5){
	 			break;
	 			}
	 		}
		int w = 0;
		while(w < 10) {
			System.out.println("w = "+ w);
			if(w ==4) break;
			
			w++; 
		}
		
		//이중 for문 탈출
//		for(int i =0; i < 10; i++) {
//				System.out.println("i = " + i);
//				for(int j=0; j<5; j++) {
//					System.out.println("  j = " + j );
//					if(i == 5 && j ==2) {
//						break;
//					}
//				}
//		}  //이걸보면 i=5, j=2일때 나왔지만 계속 i를 돌아서 실행된것을 봄
		
		//1. break문을 loop문에 수에 맞게 기입
		
		boolean b = false;
		for(int i =0; i < 10; i++) {
			System.out.println("i = " + i);
			for(int j=0; j<5; j++) {
				System.out.println("  j = " + j );
				if(i == 5 && j ==2) {
					b = true;
				}
				if(b== true){
					break;
				}
			}
			if(b== true){
				break;
			}
	}
	
		//goto 형태  자바만 가능한 방법 빠져나와를 out:으로 사용해도댐
		빠져나와: for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for(int j = 0; j < 5; j++) {
				System.out.println("  j = " + j);
				
				if(i == 5 && j ==2 ) {
					break 빠져나와;
				}
			}
		}
		
		
	}
}
