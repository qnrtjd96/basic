package ifClass;

public class MainClass {

	public static void main(String[] args) {
			/*
			 	제어문 -> 알고리즘
			 	
			 	종류 : 
			 		조건
			 			if
			 			if else
			 			if else if else
			 			
			 			switch
			 			
			 		순환문
			 			loop
			 			for
			 			while
			 			do while
			 
			 			제어
			 				break
			 				continue
			 */
			/*
			 	형식:
			 		if(조건){조건 = 논리연산(true/false) 부등호< > == && ||
			 		   처리
			 		   처리2
			 		   }
			 		if(조건)
			 */
		
		int number;
		number = 1;
		
		if(number> 0) {
			System.out.println("number은 몇인가? " + number);
		}
		
		if(number == 1) {
			System.out.println("number은 몇인가? " + number);
		}
		
		if(true) {
			System.out.println("무조건실행");
		}
		
		boolean b = false;
		if(b == false) {
			System.out.println("b는 false입니다.");
		}
		
		if(!b) {
			System.out.println("b는 !b입니다.");
		}
		
		//범위조건
		if(number>0 && number < 10) {
			System.out.println("number의 값은 " + number + "이므로 출력됩니다.");
		}
		
		if(!(number>1 || number <10)){
			System.out.println("이건 실행될까?");
		}
		
		number=123;
		//if else
		if(number>10) {
			System.out.println("number가 1이니까 이건안나오겠쥬?");
		}
		else {
			System.out.println("number가 1이니까 이건 나오겠쥬?");
		}
		
		//if else if
		/*
		 	if(조건1){처리}
		 	else if(조건2){처리2}
		 	else if(조건3){처리3}
		 	else{처리4}// 이건 생각가능함
		 */
		
		int count = 95;
		
		if(count>90) {
			System.out.println("A입니다.");
		}
		else if(count> 80) {
			System.out.println("B입니다.");
		}
		else if(count> 70) {
			System.out.println("c입니다.");
		}
		else if(count> 60) {
			System.out.println("f입니다.");
		}
		
		//조건문 안에 조건문
		int num =95;
		if(num >= 90 && num <= 100) {
			if(num >= 95) {
				System.out.println("A+입니다.");
			}
			else {
				System.out.println("A입니다.");
			}
		}
		else if(count >= 80 && num <= 90) {
			if(num >= 85) {
				System.out.println("B+입니다.");
			}else {
				System.out.println("B입니다.");
			}
		}
		else if(count >= 70 && num <= 80) {
			if(num >= 85) {
				System.out.println("C+입니다.");
			}else {
				System.out.println("C입니다.");
			}
		}
		else if(count >= 60 && num <= 70) {
			if(num >= 85) {
				System.out.println("D+입니다.");
			}else {
				System.out.println("D입니다.");
			}
		}
		else {
			System.out.println("F");
		}
		
		
	}

}
