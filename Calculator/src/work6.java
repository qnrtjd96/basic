import java.util.Scanner;

public class work6 {

	public static void main(String[] args) {
		 Scanner sc;
	        sc = new Scanner(System.in);
	        
	        float one; //첫번쨰 숫자
	        float two; //두번째 숫자
	        String oper; //연산자
	        boolean a; //논리값
	        
	        while(true){
	        System.out.print("첫번쨰 숫자를 입력해주세요 : ");
	        one = (int) sc.nextFloat();
		        if(one == 0) {
		        	System.out.println("잘못된 숫자입니다. 제대로 입력해주세요!");
		        }
		        
		    System.out.print("연산자를 입력해주세요 : ");
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
	                System.out.print("연산자를 다시 입력해주세요 \n ");                        
		    }
		          
		    System.out.print("두번째 숫자를 입력해주세요 : ");
		    two = sc.nextFloat();
			    if(two == 0) {
		        	System.out.println("잘못된 숫자입니다. 제대로 입력해주세요!");
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
                System.out.print("처음부터 다시 입력해주세요 \n ");              
            }
		    
	}
	}

}
