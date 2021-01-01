package main;

public class MainClass {
	public static void main(String[] args) {
		/*
		 	Bit ���� 0,1
		 	& AND
		 	| OR
		 	^ XOR 		 -����
		 	<< left shift
		 	>> right shift
		 	~ ����
		 */
		
		//AND &
		/*
		 	0 0 ->0
		 	0 1 ->0
		 	1 0 ->0
		 	1 1 ->1
		 	
		 	0x71 		0111 0001								0111 0001
		 				8421 8421
		 	0xB5					1011 0101                   1011 0101
		 							8421 8421					0011 0001
		 							
		 				
		 */
		int number;
		number = 0x71 & 0xB5;
		System.out.println("number = " +number);
		System.out.printf("0x%x \n", number);
		
		//or����(|)
		/*
		 * 0 0 ->0 
		 * 0 1 ->1 
		 * 1 0 ->1 
		 * 1 1 ->1
		 * 0x71 		0111 0001								0111 0001
		 				8421 8421
		   0xB5						1011 0101                   1011 0101
		 							8421 8421					1111 0101
		 */
		int ber;
		ber = 0x71 | 0xB5;
		System.out.println("number = " +ber);
		System.out.printf("0x%x \n", ber);
		
		//XOR���� ^
		/*
		 * 0 0 ->0 
		 * 0 1 ->1
		 * 1 0 ->1 
		 * 1 1 ->0
		 * 0x71 		0111 0001								0111 0001
		 				8421 8421
		   0xB5						1011 0101                   1011 0101
		 							8421 8421					0011 0001
		 */
		int kang;
		kang = 0x71 ^ 0xB5;
		System.out.println("number = " + kang);
		System.out.printf("0x%x \n", kang);
		
		//<<����  X2����ó��
		/*
		 	0000 0001 1
		 	0000 0010 2
		 	0000 0100 4
		 	0000 1000 8
		 */
		byte by;
		by = 0x1 << 2;
		System.out.println("by = " + by);
		
		//>>���� /2����ó��
		/*
		 	0000 0001 1
		 	0000 0010 2
		 	0000 0100 4
		 	0000 1000 8
		 */
		byte by2;
		by2 = 0x1 >> 2;
		System.out.println("by = " + by2);
		
		//~ ���� 0>1 1>0
		int b;
		b = ~0xf0;
		System.out.printf("%x", b);
		
	}

}
