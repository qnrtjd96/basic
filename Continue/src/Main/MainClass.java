package Main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	continue: loop�̶��� ���̻�밡����
		 	break�� Ż�� continue�� �����̶�� �� =>��ŵ
		 	
		 	continue �����δ� ���Ұ���
		 	
		 	����:
		 	for(int i = 0; i<10; i++){
		 		ó��1
		 		ó��2
		 		
		 		if(i>4){
		 			continue; ���������� ó���� �����ض�
		 		}
		 		ó��3
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
