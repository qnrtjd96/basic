package work10;

public class SumEven {

	public static void main(String[] args) {
		
		int even = 0;
		int odd = 0;
		
		for(int i=1; i<101; i++) {
			if(i%2 == 0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		System.out.println("È¦¼öÀÇ ÇÕÀº : "+ odd);
		System.out.println("Â¦¼öÀÇ ÇÕÀº : "+ even);

	}

}
