
public class MainClass {

	public static void main(String[] args) {
		/*
		 	for(�ʱ�ȭ; ���ǽ�; �����){
		  			ó��
		  	}
		  	
		  	�ʱ�ȭ
		  	while(���ǽ�){
		  		ó��
		  		�����
		  	}
		  	
		  	�ʱ�ȭ
		  	do{
		  		ó��
		  		
		  		�����
		  	}while(���ǽ�);
		  	
		 */
		
		int w;
		
		w=0;
		
		while(w < 10) {
			System.out.println("while loop = " + w);
			w++;
		}
		
//		w=0;            ���ѷ���
//		while(true) {
//			System.out.println("loop = " + w);
//			w++;
//		}
		
		int w1;
		w1 = 10;	//�ʱ�ȭ
		do {
			System.out.println("do while w1 = " + w1);
			w1++;		//�����
		}while(w1 < 10);	//���ǽ�
		
		
	}

}
