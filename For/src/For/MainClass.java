package For;

public class MainClass {

	public static void main(String[] args) {
		/*
		  ��ȯ��(loop, �ݺ���)
		  10ȸ, 20ȸ
		  
		  for
		  
		  while
		  
		  do while
		  
		  for(���� or �ʱ�ȭ; ���ǽ�; �����){
		  
		  		ó��
		  		}
		  		
		  for((1);(2)(5)(8)(11);(4)(7)(10)(13)){
		  	ó��(3)(6)(9)(12)
		  	}
		  	
		  	(14)
		  	
		 */
		
		int n;
		
		for( n = 0; n < 5; n++) {
			System.out.println("for loop");
		}
		
		for( n = 0; n < 5; n++) {
			System.out.println(n);
		}
		
		int i;
		for(i=1; i< 100; i++) {
			System.out.println("i = " + i);
		}
		
		for(i=0; i<10; i= i+2) {
			System.out.println("i = " + i);
		}
		
		n = 0;
		for( ; n< 5 ; ) {
			System.out.println("n = "+ n);
			n++;
		}
		
//		for(i=0;  ; i++) {
//			System.out.println("i = " + i);
//		}  //���ѷ���
		
		for(int k= 0; k< 5; k++) {
			System.out.println(k);
			for(int j = 0; j <3; j++) {
				System.out.println("j = " + j);
			}
		}
		
		/*
		  for(1, 9	;2, 10	;8, 16	){
		  	3, 11
		  	for(4, 12	;5, 13		;7,15	){
		  		6,14 
		  	}
		  }
		  
		 */
	}
}
