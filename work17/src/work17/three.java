package work17;

public class three {

	public static void main(String[] args) {
		
		/*
		 	������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴�. 
			���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ�
			����϶�. 
			��, ������ �� ���� ���� �������� �Ž��� �־�� �Ѵ�. ���α׷��� �ϼ��Ͻÿ�.
			
			[������]
			money=2680
			500��: 5
			100��: 1
			50��: 1
			10��: 3

		 */
		// ū �ݾ��� ������ �켱������ �Ž��� ��� �Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money="+money);
			for(int i=0; i<coinUnit.length; i++) {
				System.out.println(coinUnit[i]+"��: "+ money / coinUnit[i]);
		        money %= coinUnit[i];
			}
			
			/*
			 * result = c - a;
							System.out.println("================================");
							System.out.println("�Ž������� " + result + "�� �Դϴ�.");
							
							int re1 = result / 5000;
							int re2 = (result % 5000) / 1000;
							int re3 = ((result % 5000) % 1000) / 500;
							int re4 = (((result % 5000) % 1000) % 500) / 100;
							int re5 = ((((result % 5000) % 1000) % 500) % 100) / 50;
							int re6 = (((((result % 5000) % 1000) % 500) % 100) % 50) /10;
									
							System.out.println("�ܵ��� 5000��¥��"+ re1 +"��");
							System.out.println("�ܵ��� 1000��¥��"+ re2 +"��");
							System.out.println("�ܵ��� 500��¥��"+ re3 +"��");
							System.out.println("�ܵ��� 100��¥��"+ re4 +"��");
							System.out.println("�ܵ��� 50��¥��"+ re5 +"�� �Դϴ�.");
							System.out.println("�ܵ��� 10��¥��"+ re6 +"�� �Դϴ�.");
			 */
	}

}