package ifClass;

public class MainClass {

	public static void main(String[] args) {
			/*
			 	��� -> �˰���
			 	
			 	���� : 
			 		����
			 			if
			 			if else
			 			if else if else
			 			
			 			switch
			 			
			 		��ȯ��
			 			loop
			 			for
			 			while
			 			do while
			 
			 			����
			 				break
			 				continue
			 */
			/*
			 	����:
			 		if(����){���� = ������(true/false) �ε�ȣ< > == && ||
			 		   ó��
			 		   ó��2
			 		   }
			 		if(����)
			 */
		
		int number;
		number = 1;
		
		if(number> 0) {
			System.out.println("number�� ���ΰ�? " + number);
		}
		
		if(number == 1) {
			System.out.println("number�� ���ΰ�? " + number);
		}
		
		if(true) {
			System.out.println("�����ǽ���");
		}
		
		boolean b = false;
		if(b == false) {
			System.out.println("b�� false�Դϴ�.");
		}
		
		if(!b) {
			System.out.println("b�� !b�Դϴ�.");
		}
		
		//��������
		if(number>0 && number < 10) {
			System.out.println("number�� ���� " + number + "�̹Ƿ� ��µ˴ϴ�.");
		}
		
		if(!(number>1 || number <10)){
			System.out.println("�̰� ����ɱ�?");
		}
		
		number=123;
		//if else
		if(number>10) {
			System.out.println("number�� 1�̴ϱ� �̰Ǿȳ�������?");
		}
		else {
			System.out.println("number�� 1�̴ϱ� �̰� ��������?");
		}
		
		//if else if
		/*
		 	if(����1){ó��}
		 	else if(����2){ó��2}
		 	else if(����3){ó��3}
		 	else{ó��4}// �̰� ����������
		 */
		
		int count = 95;
		
		if(count>90) {
			System.out.println("A�Դϴ�.");
		}
		else if(count> 80) {
			System.out.println("B�Դϴ�.");
		}
		else if(count> 70) {
			System.out.println("c�Դϴ�.");
		}
		else if(count> 60) {
			System.out.println("f�Դϴ�.");
		}
		
		//���ǹ� �ȿ� ���ǹ�
		int num =95;
		if(num >= 90 && num <= 100) {
			if(num >= 95) {
				System.out.println("A+�Դϴ�.");
			}
			else {
				System.out.println("A�Դϴ�.");
			}
		}
		else if(count >= 80 && num <= 90) {
			if(num >= 85) {
				System.out.println("B+�Դϴ�.");
			}else {
				System.out.println("B�Դϴ�.");
			}
		}
		else if(count >= 70 && num <= 80) {
			if(num >= 85) {
				System.out.println("C+�Դϴ�.");
			}else {
				System.out.println("C�Դϴ�.");
			}
		}
		else if(count >= 60 && num <= 70) {
			if(num >= 85) {
				System.out.println("D+�Դϴ�.");
			}else {
				System.out.println("D�Դϴ�.");
			}
		}
		else {
			System.out.println("F");
		}
		
		
	}

}
