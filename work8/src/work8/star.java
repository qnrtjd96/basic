package work8;

public class star {

	public static void main(String[] args) {
		for(int i=1; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<5; i++) {
			for(int j=0; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	/*
	//¼±»ý´Ô¹æ½Ä
	int n = 0;
	for(int i = 0;i < 9; i++) {			
		if(i < 5) n++;
		else	  n--;
		
		for(int j = 0;j < n; j++) {				
			System.out.print("*");
		}			
		System.out.println();
	}
	*/
	}
}
