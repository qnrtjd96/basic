package main;

public class MainClass {
		public MainClass() {
			/*
			 	random	:	무작위, 난수
			 	pattern :
			 */
			
			double d = Math.random();
//			System.out.println(d);
			
			int r = (int)(Math.random()* 10); //0 1 2 3 4 5 6 7 8 9 *10이 결정
			System.out.println(r);
			
			//10 20 30 40 50
			int qwe = ((int)(Math.random()* 5) + 1) * 10;
			
			//-1,0,1
			int we = (int)(Math.random()* 3) - 1;
			
			
		}
}
