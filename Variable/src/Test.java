
public class Test {
	public static void main(String[] args) {
		
		//과제
		
		 System.out.println("===================================");
		 System.out.println("이름 \t나이 \t전화번호	 \t주소");
		 System.out.println("===================================");
		 System.out.println("홍길동 \t20 \t010-6231-9238 \t경기도");
		 System.out.println("일지매 \t18 \t02-123-4567 \t서울");
		 System.out.println("===================================");
		
		String name;
		int age;
		boolean man;
		String phone;
		double height;
		String address;
		
		name = "홍길동";
		age = 20;
		man = true;
		phone = "010-111-2222";
		height = 175.12;
		address = "경기도";
		
		System.out.println("==========================================================");
		System.out.println("\\"+"name \tage \tman \tphone 	\theight \taddress"+ "\t\\");
		System.out.println("==========================================================");
		System.out.println("\\"+"\"" + name + "\"" +"\t" + age +"\t" + man +"\t" + phone +"\t" + height +"\t" + "\"" + address + "\"" +"\t\\");
		
		name = "일지매";
		age = 18;
		man = true;
		phone = "02-123-4567";
		height = 180.01;
		address = "서울";
		
		System.out.println("\\"+"\"" + name + "\"" +"\t" + age +"\t" + man +"\t" + phone +"\t" + height +"\t" + "\"" + address + "\"" +"\t\\" );
		
		name = "장옥정";
		age = 14;
		man = false;
		phone = "02-345-7890";
		height = 155.78;
		address = "부산";
		System.out.println("\\"+"\"" + name + "\"" +"\t" + age +"\t" + man +"\t" + phone +"\t" + height +"\t" + "\"" + address + "\""+"\t\\" );
		System.out.println("==========================================================");
		
	}
}
