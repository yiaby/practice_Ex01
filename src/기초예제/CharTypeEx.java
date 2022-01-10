package 기초예제;

public class CharTypeEx {

	public static void main(String[] args) {
		char c1 = 'A';       //문자로 저장 디코딩: 숫자를 문자로
		char c2 = 65;        //10진수로 저장 인코딩: 문자를 숫자로
		char c3 = '\u0041';  //16진수로 저장  u : 유니코드(다국적언어)
		
		System.out.println(c1);//A
		System.out.println(c2);//A
		System.out.println(c3);//A
	
	   char c4 = '가';
	   char c5 = 44032;
	   char c6 = '\uac00';
	   
	   //long 데이터 타입 관련
	   long var1 = 1000000000000L;//1조
	   System.out.println(var1);
	   
	   //[중요]byte 타입은 패스워드값을 암호화 시킬 때 적용
	   byte aa = 127;
	   short bb = 32767;
	   
	
	
	
	
	
	}

}
