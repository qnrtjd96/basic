package work13;

import java.util.Random;
import java.util.Scanner;

public class homwork {

	public static void main(String[] args) {
		// 난수찾기 게임
		/*
		 	난수찾기
		 	범위: 1~100 랜덤으로 받기
		 	
		 	
		 	입력: 유저가 맞추는게임임
		 		난수 < 입력숫자 : 크다고말하고 다시
		 		입력숫자 < 난수	: 작다고 말하고 다시
		 		기회10번
		 		못맞추면 못맞췄다고 표시하고 맞추면 맞췃다고 표시
		 		다한사람 한번더? 까지
		 	
		 	//계획세우기
		 	1.랜덤으로 숫자 지정
		 	2. Scanner 통해서 난수 받고
		 	3. while문 돌려서 유저가 계속 숫자를 맞추게 하기
		 	4. 기회는 10번만
		 	5. 못맞췄으면 못맞췃다고 표시 맞추면 맞췄다고 표사
		 	6. 한번더 하시겠습니까? 까지
		 */
	/*	
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()* 100);
		int user = 1;
		
		System.out.println("난수  = " + random );
		
		for (int i = 1; i <= 10; i++) {
				user = sc.nextInt();
				if (user == random) {
					System.out.println("정답입니다!");
				}else {
					System.out.println("틀렸습니다 다시 시도해주세요!");
				}
			 System.out.println(i +"번 시도하셨습니다. "+ "기회가 "+ (10-i) +" 번 남으셨습니다.");
		}
	*/
		//강산코드 완성
		/*
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()* 100);
		int i= 1;
		
		while(true) {
			System.out.println("난수  = " + random );
			System.out.print("숫자를 입력해주세요(0~99) : ");
			int user = sc.nextInt();
			
			if (user == random) {
				System.out.println("");
				System.out.println("정답입니다!");
					System.out.print("다시 하시겠습니까? y/n :");
					String a=sc.next();
						if(a.equals("n")) {
							System.out.println("ㄳ 수구바위~");
							break;
						}
						else {
						  i=1;
						  continue;
						}
			}else if(user < random){
				System.out.println("더 높습니다.");
				System.out.println(i +"번 시도하셨습니다. "+ "기회가 "+ (10-i) +" 번 남으셨습니다.");
				System.out.println("");
					if (i==10) {
						System.out.println("못 맞추셨습니다.");
						System.out.print("다시 하시겠습니까? y/n :");
						String a=sc.next();
							if(a.equals("n")) {
								System.out.println("ㄳ 수구바위~");
								break;
							}
							else {
							  i=1;
							  continue;
							}
					}
				++i;
				continue;
			}
			else if(random < user){
				System.out.println("더 낮습니다.");
				System.out.println(i +"번 시도하셨습니다. "+ "기회가 "+ (10-i) +" 번 남으셨습니다.");
				System.out.println("");
					if (i==10) {
						System.out.println("못 맞추셨습니다.");
						System.out.print("다시 하시겠습니까? y/n :");
						String a=sc.next();
							if(a.equals("n")) {
								System.out.println("ㄳ 수구바위~");
								break;
							}
							else {
							  i=1;
							  continue;
							}
					}
				++i;
				continue;
			}
			
		}
		System.out.println("숫자 맞추기 게임을 종료합니다.");
	
		*/
		Scanner sc = new Scanner(System.in);
		
		int rand_num; 	//랜덤수 저장
		int user_num;	//유저로부터 입력받은 수
		boolean clear;	// 게임판정용 불른
		
		////////////////////////replay
		
		while(true) {
			//1.초기화
			clear = false;
			
			//2.random수
			rand_num = (int)(Math.random()*100) +1;
			
			/////////////////////////////loop 10회
			int w = 0;
			while(w <10) {
				//3. user 입력
				System.out.print("number = ");
				user_num = sc.nextInt();
				
				//4. 비교
				int msg = 0;
				if(user_num > rand_num) {
					msg = 1;
				}else if(user_num < rand_num) {
					msg = 2;
				}else {
					clear=true;
				}
				//5. 메세지 출력
				switch(msg) {
					case 1:
						System.out.println("너무 큽니다.");
						break;
					case 2:
						System.out.println("너무 작습니다.");
						break;
						
				}
				w++;
			}	
			///////////////////////////////
			//결과 출력
			if(clear) {
				System.out.println("Game Clear!!!");
			}else {
				System.out.println("Game Over");
			}
			//7. 리플레이 입력
			String replay;
			
			while(true) {
				System.out.println("한판더? (y/n) = ");
				replay = sc.next();
				
				if(replay.equals("y")||replay.equals("n")) {
					break;
				}else {
					System.out.println("잘못 입력하셧습니다. 다시입력해주세요");
				}
			}
			
			if(replay.equals("n")) {
				System.out.println("안녕히 가세요");
				break;
			}
			System.out.println("다시 시작합니다.");
		}
		//////////////////////////////////////////////
	}

}
