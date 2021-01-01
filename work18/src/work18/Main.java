package work18;

public class Main {

	public static void main(String[] args) {
		/*
		  피보나치 수열  -> 30번쨰 값을 구하라
		  0 1 1 2 3 5 8 13
		  a b c
		  	a b c
		  	  a b c
		 */
/*		int a= 0,b = 1,result = 0;
		
		for (int i = 1; i < 30; i++) {
			result=a+b;
			a=b;
			b=result;
		}
		System.out.println("result : "+ result);
	*/
		long a, b, c;
		long array[] = new long[30];
		a= 0;
		b = 1;
		
		array[0] = a;
		array[1] = b;
		
		int w = 0;
		while(w < 28) {
			c = a + b;
			array[w + 2] = c;
			
			a=b;
			b=c;
			
			w++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
