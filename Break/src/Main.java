
public class Main {
	public static void main(String[] args) {
		/*
		 	break => Ż��
		 	
		 	break ������ ����� �� ����
		 	loop���� ���� ����ؾ��Ѵ�. (for, while, do while)
		 	
		 	����:
		 	for(int i =0; i< 10; i++){
		 		ó��
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
		
		//���� for�� Ż��
//		for(int i =0; i < 10; i++) {
//				System.out.println("i = " + i);
//				for(int j=0; j<5; j++) {
//					System.out.println("  j = " + j );
//					if(i == 5 && j ==2) {
//						break;
//					}
//				}
//		}  //�̰ɺ��� i=5, j=2�϶� �������� ��� i�� ���Ƽ� ����Ȱ��� ��
		
		//1. break���� loop���� ���� �°� ����
		
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
	
		//goto ����  �ڹٸ� ������ ��� �������͸� out:���� ����ص���
		��������: for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for(int j = 0; j < 5; j++) {
				System.out.println("  j = " + j);
				
				if(i == 5 && j ==2 ) {
					break ��������;
				}
			}
		}
		
		
	}
}
