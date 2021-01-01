package String;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// String : 문자열
		
		char array[]	=	{ 'H', 'e', 'l', 'l', 'o' };
		System.out.println("");
		
		//class ==object(객체) 변수 + 함수(메소드)
		//str ==object(class 변수)
		String str = "Hello";
		System.out.println(str);
		
		str="world";
		System.out.println(str);
		
		String str2 = " nice to meet you";
		String str3 = str + str2;
		System.out.println(str3);
		
		String str4 = "건강하세요";
		String str5 = str3.concat(str4);
		
		System.out.println(str5);
		
		//equals : 문자열 비교
		String str6 = "Hello";
		String str7 = "Hello";
		
//		if(str6 == str7) {
		if(str6.equals(str7) == true) {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
		
		boolean b = str.equals(str7); //문자열을 비교하는 함수 b
		if(b == true) {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
		
		/*
		 	넘어오는 값 = equals(들어오는 값)
		 */
		
		//indexOf : 문자를 검색하기 위한 함수. 문자를 찾으면 번호를 돌려준다.
		String str8 = "abcdeabcdeabcde";
		
		int indexNum = str8.indexOf("cde");
		System.out.println(indexNum);
		
		//lastIndexOf
		indexNum = str.lastIndexOf("c");
		System.out.println(indexNum);
		
		//length array.lenth == 배열
		int len = str8.length();
		System.out.println(len);
		
		//replace 수정
		String str9 ="A*B*C*D";
		
		str9 = str.replace("*", "-");
		System.out.println(str9);
		
		//split -> token을 이용해서 문자열을 자르는 함수
		/*
		 	이름 나이 생년월일 주소
		 	홍길동24 2000/12/02 서울시
		 	
		 */
		
		String str10 = "aa-bb-cc-dd";
		str10 ="홍길동-24-2001/10/12-서울시";
		String splits[] = str10.split("-");
		
		System.out.println(splits.length);
		System.out.println(Arrays.toString(splits));
		
		//substring 문자열을 영역으로 잘라서 취득
		String str11 = str10.substring(4,6);
		System.out.println(str11);
		
		//대문자, 소문자
		//toUpperCase toLowerCase
		String str12 = "abcDeF";
		
		str12 = str12.toUpperCase();
		System.out.println(str12);
		
		str12 = str12.toLowerCase();
		System.out.println(str12);
		
		//trim : 앞뒤 공백을 없애주는 함수
		String str13 = "               java      java  java      ";
		str13 =str13.trim();
		System.out.println(str13);
		
		//valueOf 숫자를 문자열로
		int num =123;
		long lo = 1234L;
		double d = 123.4567;
		
		String snum = String.valueOf(num);
		String slo = String.valueOf(lo);
		String sd = String.valueOf(d);
		
		System.out.println(snum + " "+ slo + " "+ sd);
		
		//언제쓰냐면
		
		String snum1 = num+ ""; //이렇게하면 오류나니까 문자열을 붙여주던가 valueOf 함수를 씀
		
		//탐색: contains
		// 알고리즘(정렬(sort), 트리, 셔플, 탐색)
		String str14 = "서울시 마포구 서교동";
		boolean b1 =str14.contains("마포");
		System.out.println(b1);
		
		//charAt : index번호를 넣으면
		
		String str15 = "가나다라마바사";
		
		char ch = str15.charAt(2);
		System.out.println(ch);
		
		//ASCII(아스키) Code
		//A = 65 B 0 1
		char c = 'A';
		System.out.println(c);
		System.out.println((int) c);
		
		int asc = (int)c;
		asc =asc + 32;
		
		c = (char)asc;
		System.out.println(c);
		
	}
}
