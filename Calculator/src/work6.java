import java.util.Scanner;

public class work6 {

	public static void main(String[] args) {
		 Scanner sc;
	        sc = new Scanner(System.in);
	        
	        float one; //ù���� ����
	        float two; //�ι�° ����
	        String oper; //������
	        boolean a; //����
	        
	        while(true){
	        System.out.print("ù���� ���ڸ� �Է����ּ��� : ");
	        one = (int) sc.nextFloat();
		        if(one == 0) {
		        	System.out.println("�߸��� �����Դϴ�. ����� �Է����ּ���!");
		        }
		        
		    System.out.print("�����ڸ� �Է����ּ��� : ");
		    oper = sc.next();
		    switch(oper) {
			    case "+":
	                a=false;
	                break;
	            case "-":
	                a=false;
	                break;
	            case "*":
	                a=false;
	                break;
	            case "/":
	                a=false;
	                break;
	            default:
	                System.out.print("�����ڸ� �ٽ� �Է����ּ��� \n ");                        
		    }
		          
		    System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
		    two = sc.nextFloat();
			    if(two == 0) {
		        	System.out.println("�߸��� �����Դϴ�. ����� �Է����ּ���!");
		        }
			
		    switch(oper) {
            case "+":
                System.out.println(one + two);
                break;
            case "-":
                System.out.println(one-two);
                break;
            case "*":
                System.out.println(one*two);
                break;
            case "/":
                System.out.println(one/two);
                break;
            default:
                System.out.print("ó������ �ٽ� �Է����ּ��� \n ");              
            }
		    
	}
	}

}
