package Main;

public class MainClass {

	public static void main(String[] args) {
			/*
			 	switch : ����
			 			���� ��Ȯ, ���� ���� �Ұ�. �Ҽ��� ���Ұ�
			 			
			 	����
			 			Switch(����� �Ǵ� ����){
			 					case ��1: 
			 					ó��1
			 					break;
			 					
			 					case ��1: 
			 					ó��1
			 					break;
			 					  :
			 					default: 
			 					
			 				}
			 				
			 */
		
			int num = 2;                				
			switch(num){
				case 1:
					System.out.println("number�� 1�Դϴ�.");
					break;
					
				case 2:
					System.out.println("number�� 2�Դϴ�.");
					break;
					
				case 3:
					System.out.println("number�� 3�Դϴ�.");
					break;
					
				default:
					System.out.println("1,2,3 �߿� �ƹ��͵� �����ϴ�.");
					break;
			}
			
			String d = "����";				//c������ String�� �ȸԴµ�, �ڹ� �ֽŹ��������� ����
			
			switch(d) {
				case "����":
					System.out.println("����");
					break;
			}
		}

}
