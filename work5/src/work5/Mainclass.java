package work5;

public class Mainclass {

	public static void main(String[] args) {
		
		int gogo;
		
		gogo = 1;
		
		while(gogo < 10) {
			for(int i=1; i<10; i++) {
				System.out.println(gogo+ "*"+ i  +" = "+gogo * i);
			}
			gogo++;
		}
	}

}
