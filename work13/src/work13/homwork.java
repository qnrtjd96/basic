package work13;

import java.util.Random;
import java.util.Scanner;

public class homwork {

	public static void main(String[] args) {
		// ³­¼öÃ£±â °ÔÀÓ
		/*
		 	³­¼öÃ£±â
		 	¹üÀ§: 1~100 ·£´ıÀ¸·Î ¹Ş±â
		 	
		 	
		 	ÀÔ·Â: À¯Àú°¡ ¸ÂÃß´Â°ÔÀÓÀÓ
		 		³­¼ö < ÀÔ·Â¼ıÀÚ : Å©´Ù°í¸»ÇÏ°í ´Ù½Ã
		 		ÀÔ·Â¼ıÀÚ < ³­¼ö	: ÀÛ´Ù°í ¸»ÇÏ°í ´Ù½Ã
		 		±âÈ¸10¹ø
		 		¸ø¸ÂÃß¸é ¸ø¸ÂÃè´Ù°í Ç¥½ÃÇÏ°í ¸ÂÃß¸é ¸Â­Ÿ´Ù°í Ç¥½Ã
		 		´ÙÇÑ»ç¶÷ ÇÑ¹ø´õ? ±îÁö
		 	
		 	//°èÈ¹¼¼¿ì±â
		 	1.·£´ıÀ¸·Î ¼ıÀÚ ÁöÁ¤
		 	2. Scanner ÅëÇØ¼­ ³­¼ö ¹Ş°í
		 	3. while¹® µ¹·Á¼­ À¯Àú°¡ °è¼Ó ¼ıÀÚ¸¦ ¸ÂÃß°Ô ÇÏ±â
		 	4. ±âÈ¸´Â 10¹ø¸¸
		 	5. ¸ø¸ÂÃèÀ¸¸é ¸ø¸Â­Ÿ´Ù°í Ç¥½Ã ¸ÂÃß¸é ¸ÂÃè´Ù°í Ç¥»ç
		 	6. ÇÑ¹ø´õ ÇÏ½Ã°Ú½À´Ï±î? ±îÁö
		 */
	/*	
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()* 100);
		int user = 1;
		
		System.out.println("³­¼ö  = " + random );
		
		for (int i = 1; i <= 10; i++) {
				user = sc.nextInt();
				if (user == random) {
					System.out.println("Á¤´äÀÔ´Ï´Ù!");
				}else {
					System.out.println("Æ²·È½À´Ï´Ù ´Ù½Ã ½ÃµµÇØÁÖ¼¼¿ä!");
				}
			 System.out.println(i +"¹ø ½ÃµµÇÏ¼Ì½À´Ï´Ù. "+ "±âÈ¸°¡ "+ (10-i) +" ¹ø ³²À¸¼Ì½À´Ï´Ù.");
		}
	*/
		//°­»êÄÚµå ¿Ï¼º
		/*
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()* 100);
		int i= 1;
		
		while(true) {
			System.out.println("³­¼ö  = " + random );
			System.out.print("¼ıÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä(0~99) : ");
			int user = sc.nextInt();
			
			if (user == random) {
				System.out.println("");
				System.out.println("Á¤´äÀÔ´Ï´Ù!");
					System.out.print("´Ù½Ã ÇÏ½Ã°Ú½À´Ï±î? y/n :");
					String a=sc.next();
						if(a.equals("n")) {
							System.out.println("¤£ ¼ö±¸¹ÙÀ§~");
							break;
						}
						else {
						  i=1;
						  continue;
						}
			}else if(user < random){
				System.out.println("´õ ³ô½À´Ï´Ù.");
				System.out.println(i +"¹ø ½ÃµµÇÏ¼Ì½À´Ï´Ù. "+ "±âÈ¸°¡ "+ (10-i) +" ¹ø ³²À¸¼Ì½À´Ï´Ù.");
				System.out.println("");
					if (i==10) {
						System.out.println("¸ø ¸ÂÃß¼Ì½À´Ï´Ù.");
						System.out.print("´Ù½Ã ÇÏ½Ã°Ú½À´Ï±î? y/n :");
						String a=sc.next();
							if(a.equals("n")) {
								System.out.println("¤£ ¼ö±¸¹ÙÀ§~");
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
				System.out.println("´õ ³·½À´Ï´Ù.");
				System.out.println(i +"¹ø ½ÃµµÇÏ¼Ì½À´Ï´Ù. "+ "±âÈ¸°¡ "+ (10-i) +" ¹ø ³²À¸¼Ì½À´Ï´Ù.");
				System.out.println("");
					if (i==10) {
						System.out.println("¸ø ¸ÂÃß¼Ì½À´Ï´Ù.");
						System.out.print("´Ù½Ã ÇÏ½Ã°Ú½À´Ï±î? y/n :");
						String a=sc.next();
							if(a.equals("n")) {
								System.out.println("¤£ ¼ö±¸¹ÙÀ§~");
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
		System.out.println("¼ıÀÚ ¸ÂÃß±â °ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
	
		*/
		Scanner sc = new Scanner(System.in);
		
		int rand_num; 	//·£´ı¼ö ÀúÀå
		int user_num;	//À¯Àú·ÎºÎÅÍ ÀÔ·Â¹ŞÀº ¼ö
		boolean clear;	// °ÔÀÓÆÇÁ¤¿ë ºÒ¸¥
		
		////////////////////////replay
		
		while(true) {
			//1.ÃÊ±âÈ­
			clear = false;
			
			//2.random¼ö
			rand_num = (int)(Math.random()*100) +1;
			
			/////////////////////////////loop 10È¸
			int w = 0;
			while(w <10) {
				//3. user ÀÔ·Â
				System.out.print("number = ");
				user_num = sc.nextInt();
				
				//4. ºñ±³
				int msg = 0;
				if(user_num > rand_num) {
					msg = 1;
				}else if(user_num < rand_num) {
					msg = 2;
				}else {
					clear=true;
				}
				//5. ¸Ş¼¼Áö Ãâ·Â
				switch(msg) {
					case 1:
						System.out.println("³Ê¹« Å®´Ï´Ù.");
						break;
					case 2:
						System.out.println("³Ê¹« ÀÛ½À´Ï´Ù.");
						break;
						
				}
				w++;
			}	
			///////////////////////////////
			//°á°ú Ãâ·Â
			if(clear) {
				System.out.println("Game Clear!!!");
			}else {
				System.out.println("Game Over");
			}
			//7. ¸®ÇÃ·¹ÀÌ ÀÔ·Â
			String replay;
			
			while(true) {
				System.out.println("ÇÑÆÇ´õ? (y/n) = ");
				replay = sc.next();
				
				if(replay.equals("y")||replay.equals("n")) {
					break;
				}else {
					System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ë½À´Ï´Ù. ´Ù½ÃÀÔ·ÂÇØÁÖ¼¼¿ä");
				}
			}
			
			if(replay.equals("n")) {
				System.out.println("¾È³çÈ÷ °¡¼¼¿ä");
				break;
			}
			System.out.println("´Ù½Ã ½ÃÀÛÇÕ´Ï´Ù.");
		}
		//////////////////////////////////////////////
	}

}
