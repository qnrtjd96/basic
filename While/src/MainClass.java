
public class MainClass {

	public static void main(String[] args) {
		/*
		 	for(초기화; 조건식; 연산식){
		  			처리
		  	}
		  	
		  	초기화
		  	while(조건식){
		  		처리
		  		연산식
		  	}
		  	
		  	초기화
		  	do{
		  		처리
		  		
		  		연산식
		  	}while(조건식);
		  	
		 */
		
		int w;
		
		w=0;
		
		while(w < 10) {
			System.out.println("while loop = " + w);
			w++;
		}
		
//		w=0;            무한루프
//		while(true) {
//			System.out.println("loop = " + w);
//			w++;
//		}
		
		int w1;
		w1 = 10;	//초기화
		do {
			System.out.println("do while w1 = " + w1);
			w1++;		//연산식
		}while(w1 < 10);	//조건식
		
		
	}

}
