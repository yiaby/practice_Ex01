package ���ʿ���;

public class CharTypeEx {

	public static void main(String[] args) {
		char c1 = 'A';       //���ڷ� ���� ���ڵ�: ���ڸ� ���ڷ�
		char c2 = 65;        //10������ ���� ���ڵ�: ���ڸ� ���ڷ�
		char c3 = '\u0041';  //16������ ����  u : �����ڵ�(�ٱ������)
		
		System.out.println(c1);//A
		System.out.println(c2);//A
		System.out.println(c3);//A
	
	   char c4 = '��';
	   char c5 = 44032;
	   char c6 = '\uac00';
	   
	   //long ������ Ÿ�� ����
	   long var1 = 1000000000000L;//1��
	   System.out.println(var1);
	   
	   //[�߿�]byte Ÿ���� �н����尪�� ��ȣȭ ��ų �� ����
	   byte aa = 127;
	   short bb = 32767;
	   
	
	
	
	
	
	}

}
