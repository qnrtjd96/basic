package work14;

import java.util.Arrays;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		/*
		 	baseball
		 	
		 	1 ~10 -> 6 3 8
		 			 4 6 5 -> 1ball
		 			 6 1 2 -> 1strike
		 			 8 3 1 -> 1strike 1ball
		 	
		 	랜덤숫자 3개 
		 	유저숫자도 3개입력하게할것
		 	
		 	주의사항 : 랜덤함수가 766, 666, 111, 222 등 같은 숫자가 나오면 안됨
		 			  유저도 같은 숫자를 입력해도 안됨
		 	10번의 기회만 주면됨
		 	다시한판더도 물어보기
		 	
		 	
		 	1. 랜덤숫자 3개 배정하기(같은숫자 중복안되게)
		 	2. 유저숫자 3개 입력하기
		 	3. 옮고 그름 판별하기
		 	4. 루프돌기
		 	5. 10번기회 한판더 포함
		 	
		 	//입력받은 문자열이 모두 숫자인지 조사
		 	//숫자
		 	//문자
		 	//String -> Integer
		 	 
		 //내가만든거
		int com[] = new int[3]; // 컴퓨터의 배열 3개 
		int user[] = new int[3]; // 사용자의 배열 3개 
		int ch = 0; 
		int counter = 0; 
		

		boolean randomball = true; 

		while (randomball) { 
			for (int i=0; i<com.length; i++) { 
					com[i] = (int)(Math.random() * 9) + 1; 
				} 
			if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) { 
				randomball = false; 
			} 
		} 
		randomball = true; 
		System.out.println("야구게임 시작");
		System.out.println("컴퓨터가 정한 숫자는? : "+ Arrays.toString(com));
		
		while (randomball) { 
			int strike = 0; 
			int ball = 0; 
			System.out.println("1~9까지 숫자를 3번 입력하세요"); 
			Scanner kk = new Scanner(System.in); 
	
				for (int i=0; i < user.length; i++) { 
					try { ch = kk.nextInt(); user[i] = ch; 
						if (ch > 10 || ch < 0) { 
							System.out.println("1~9의 숫자를 입력하세요"); 
							} 
					} catch (Exception e) { 
					System.out.println("잘못 입력하셨습니다."); 
					}
					
				} 

			for (int i=0; i<com.length; i++){ 
				for (int j=0; j<user.length; j++) { 
						if (com[i] == user[j] && i == j){ 
								strike++; 
						} else if (com[i] == user[j] && i != j){ 
							ball++; 
						} 
	
						} 
			} 
			System.out.println(strike + "스트라이크  " + ball + "볼"); 
				if (strike == 3){ 
					randomball = false; 
				} 
			counter++; 
		} 
		
		System.out.println("횟수 : " + counter); 
		System.out.println("게임 끝"); 
		 
		*/
		
		Scanner sc = new Scanner(System.in); 
		int r_num[]= new int[3]; //랜덤 숫자 3개
		int u_num[]= new int[3]; //유저 숫자 3개
		boolean clear;
		
		
		//1. 초기화 initialize
		clear = false;
		
		//2. random number 3 1~10
		//방법1
/*		for(int i = 0; i < r_num.length; i++) {
			r_num[0] =(int)(Math.random() * 10)+1;
		
			//같은 숫자인지 조사
			if(r_num[0] != r_num[1] && r_num[1] != r_num[2] && r_num[2] != r_num[0]) {
				break;
			}
		}
		/*
		 	1 2 3 4 5 6 7 8 9 10
		 	0 0 0 1 1 0 0 0 0 
		 		  4
		 		    5
		 */
		//방법2 이거진짜 중요하다!!!!!!!!!!!!!!!11
		boolean swit[] = new boolean[10];
		
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false; //0 0 0 0 0 0 0 0 0 스위치가 꺼져있는거
		}
		int w = 0;
		while(w<3) { //이게왜 좋은코드냐면 10개의 랜덤숫자를 3만 바꾸면 가능하기떄문이다.    ++++++++ex) 고스톱 패섞기 원카드 패섞기 로또번호 섞기 응용하면?) 제외수 뽑기도 가능 swit = r-1
			int r = (int)(Math.random() * 10); // 0 ~ 9
			if(swit[r] == false) {
				swit[r] = true;  //0 0 0 1 0 0 0 0 0 0
				r_num[w] = r+1; // 1~10
				w++;
			}
		}
		System.out.println(Arrays.toString(r_num));
		///////////////////////////loop
		/*
		int gameloop=0;
		while(gameloop<10) {
		
			//3. user number 3
			while(true) {
				for (int i = 0; i < u_num.length; i++) {
					System.out.print(i+ 1+ "번 째 수 : ");
					u_num[i] =sc.nextInt();
				}
				if(u_num[0] != u_num[1] && u_num[1] != u_num[2] && u_num[2] != u_num[0]) {
					System.out.println("중복된 숫자가 있습니다.");
					continue;
				}
				break;
			}
			
			//4. 판정
			int strike, ball;
			strike = ball = 0;
			
			//ball
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (u_num[i] == r_num[j] && i != j) {
						ball++;
					}
				}
			}
			
			//strike
			for (int i = 0; i < 3; i++) {
				if (u_num[i] == r_num[i]) {
					strike++;
				}
			}
			
			//탈출코드
			if(strike ==3) {
				clear = true;
				break;
			}
			
		//5. 메세지
		System.out.println(strike + "스트라이크" + ball +"볼입니다.");
			gameloop++;
		}
		///////////////////////////loop
		
		//6. 결과출력
		*/
		
	}

}
