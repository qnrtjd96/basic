package study1;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		//조건문
		//if
		int number;
		number =123;
		char c;
		c = 'A';
		
		if(number == 123) {			
		}
		if(number>0 && number <= 100) {			
		}
		if(number > 0 && c =='A') {
		}
		if(number <= 100 && number > 90) {
		}
		else {
		}
		
		//if else
		if(number > 90) {
			if(number >= 95) {
			}else {
				
			}
		}
		else if(number > 80) {
			
		}else if(number> 70) {
			
		}
		
		//삼항연산자
		/*
		 	돌아오는 값 = (조건식) ? 값1 : 값2
		 */
		int tag=0;
		tag = (number > 100)?1:2;
		System.out.println("tag = "+ tag);
		
		String str = "";
		str = (number > 90)? "합격":"불합격";
		System.out.println("str = " + str);
		
		//switch
		String st = "하나";
		
		switch (st) {
		case "하나":	
			break;
		case "둘":	
			break;
		case "셋":
			break;
		default:
			break;
		}
		//반복문, 순환문, loop문
		//for
		int n;
		for(n=0; n<10; n++) {
		}
		for(int i =0; i<10; i++) {
		}
		for(int i=1; i<10; i++ ) {
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<5; j++) {
			}
		}
		
		//while
		int w = 0;
		while(w < 10) {
			w++;
		}
		
		//do while
		w= 0;
		do {
			w++;
		}while(w < 10);
		
		//break
		for(int i =0; i<100; i++) {
			if(i ==45) {
				break;
			}
		}
		
		//continue
		for(int i = 0; i<10; i++) {
			System.out.println("loop start");
			if(i > 4) continue;
			System.out.println("--loop end");
			
		//숫자의 범위가 틀리면 다시입력
		Scanner sc = new Scanner(System.in);
		int inputNum;
		int w1;
		/*
		w1=0;
		while(w1 <3) {
			System.out.println("입력수 = ");
			inputNum = sc.nextInt();
			if(inputNum <= 0) {
				System.out.println("다시입력해주세요");
				continue;
			}
		}
		w1++;
		*/
		for(int k=0; k<3; k++) {
			System.out.println("입력수 = ");
			inputNum = sc.nextInt();
			if(inputNum <= 0) {
				System.out.println("다시입력해주세요");
				continue;
			}
		}
	}
	}
}
