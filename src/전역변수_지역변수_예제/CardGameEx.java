package ��������_��������_����;
/*
 * �ڹ��� Ŭ���� ������ �ν��Ͻ� ������ �����ϱ� ���� ���� ���α׷�
 */

class Card{
	static int width = 100;   //���� Ŭ���� ����
	static int hieght = 250;    //���� Ŭ���� ����
    
	int number; //����
    String kind;//����
}

public class CardGameEx {
	public static void main(String[] args) {
		
     System.out.println("crad's width = "+ Card.width);
     System.out.println("crad's hieght = "+ Card.hieght);
     
     
     
     Card card1 = new Card();//Card��� �ν��Ͻ� ��ü�� ����
     card1.kind = "spade";
     card1.number = 5;
     System.out.println("card1��"+card1.kind+","+card1.number+"�̸�,ī��ũ���("+ card1.width+","+card1.hieght+")");
     
     
     Card card2 = new Card();
     card2.kind = "heart";
     card2.number = 8;
     System.out.println("card2��"+card2.kind+","+card2.number+"�̸�,ī��ũ���("+ card2.width+","+card2.hieght+")");
	}

}
