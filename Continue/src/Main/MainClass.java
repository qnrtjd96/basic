package Main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	continue: loop이랑만 같이사용가능함
		 	break는 탈출 continue는 생략이라는 뜻 =>스킵
		 	
		 	continue 만으로는 사용불가능
		 	
		 	형식:
		 	for(int i = 0; i<10; i++){
		 		처리1
		 		처리2
		 		
		 		if(i>4){
		 			continue; 다음문장의 처리를 생략해라
		 		}
		 		처리3
		 	}
		 */

		for(int i=0; i<10; i++) {
			
			System.out.println("i = "+ i);
			if(i>4) {
				continue;
			}
			System.out.println(" j  = "+ i);
		}
	}

}
