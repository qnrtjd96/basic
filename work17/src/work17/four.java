package work17;

public class four {

	public static void main(String[] args) {
		/*
		 	������ ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷��̴�.
			(1)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
			a b c d e f g h i j k l m n o p q r s t u v w x y z
			` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /
			
			0 1 2 3 4 5 6 7 8 9
			q w e r t y u i o p
		 
		
		// abcdefghijklmnopqrstuvwxyz
		char[] abcCode =
						 { '`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
					//    '`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'
		char[] cbaCode = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] munCode = {'0','1','2','3','4','5','6','7','8','9'};
		
		String src = "abc123";
		String src2 = "`~!wer";
		String result = "";
		String result2 = " ";
		
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
				if ('a'<=ch && ch <= 'z') {
					result += abcCode[ch-'a'];
				}else {
					result += numCode[ch-'0'];
				}			
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		 for(int i=0; i < src2.length();i++) {
	         char ch1 = src2.charAt(i);
	         System.out.println(ch1);
	            if ('`'<=ch1 && ch1 <= '/') {
	               result2 += cbaCode[ch1-'`'];
	               System.out.println(result2);
	            }else {
	               result2 += munCode[ch1-'0'];
	            }
	            
	      } //for end 
	      System.out.println("result2 : "+result2);

		
		/*
		[������]
		src:abc123
		result :`~!wer
		�Է� ���� ���ڿ��� ��ȣȭ �ϵ��� �ڵ带 ���׷��̵� �Ѵ�.
				*/
		
		/*
	 	������ ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷��̴�.
		(1)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
		a b c d e f g h i j k l m n o p q r s t u v w x y z
		` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /
		
		0 1 2 3 4 5 6 7 8 9
		q w e r t y u i o p
	 	*/
	
		// abcdefghijklmnopqrstuvwxyz
		char[] abcCode ={ 	
				'`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'
		};	
		
		// 0 ~ 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "2034world34hwloe";
		String result = "";
		
		// ��ȣȭ
		for (int i = 0; i < src.length(); i++) {		
		
			char c = src.charAt(i);
			int asc = (int)c;
			
			// ���ĺ��� ���
			if(asc >= 97 && asc <= 122) {	
				asc = asc - 97;		// 'a' == 0
				result = result + abcCode[asc];
			}		
			// ������ ���
			if(asc >= 48 && asc<= 57) {
				asc = asc - 48;		// '0' == 0
				result = result + numCode[asc];
			}		
		}
		
		System.out.println("�����ڵ�:" + src);
		System.out.println("��ȣȭ�ڵ�:" + result);
				
		
		// ��ȣȭ
		String base = "";
		
		for (int j = 0; j < result.length(); j++) {		
			char c = result.charAt( j );
			int asc = (int)c;
			
			// ��ȣȭ�� ����
			int index = 0;
			if(asc >= 97 && asc <= 122) {	// a ~ z
				
				for (int i = 0; i < numCode.length; i++) {
					if(c == numCode[i]) {
						index = i;
						break;
					}
				}
				
				index = index + 48;
				base = base + (char)index;			
			}				
			else {	// ��ȣȭ�� ��ȣ
				
				for (int i = 0; i < abcCode.length; i++) {
					if(c == abcCode[i]) {
						index = i;
						break;
					}
				}
				
				index = index + 97;
				base = base + (char)index;			
			}		
		}
		
		System.out.println("��ȣȭ�ڵ�:" + base);
	}
}
