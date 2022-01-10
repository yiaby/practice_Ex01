package 전역변수_지역변수_예제;
/*
 * 자바의 클래스 변수와 인스턴스 변수를 이해하기 좋은 예제 프로그램
 */

class Card{
	static int width = 100;   //넓이 클래스 변수
	static int hieght = 250;    //높이 클래스 변수
    
	int number; //숫자
    String kind;//무늬
}

public class CardGameEx {
	public static void main(String[] args) {
		
     System.out.println("crad's width = "+ Card.width);
     System.out.println("crad's hieght = "+ Card.hieght);
     
     
     
     Card card1 = new Card();//Card라는 인스턴스 객체가 생성
     card1.kind = "spade";
     card1.number = 5;
     System.out.println("card1은"+card1.kind+","+card1.number+"이며,카드크기는("+ card1.width+","+card1.hieght+")");
     
     
     Card card2 = new Card();
     card2.kind = "heart";
     card2.number = 8;
     System.out.println("card2는"+card2.kind+","+card2.number+"이며,카드크기는("+ card2.width+","+card2.hieght+")");
	}

}
