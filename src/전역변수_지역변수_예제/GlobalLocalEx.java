package ��������_��������_����;

public class GlobalLocalEx {
    
	static int class_var;//Ŭ���� ����:0���� �ڵ� �ʱ�ȭ
	int instance_var;//�ν��Ͻ� ����:0���� �ڵ��ʱ�ȭ
	
	public static void main(String[] args) {
		int local_var = 3;
		//��������:���� �����ؾ���
		
		
		System.out.println("Ŭ���� ����="+GlobalLocalEx.class_var);
		
		GlobalLocalEx gle = new GlobalLocalEx();
		System.out.println("�ν��Ͻ� ������="+gle.instance_var);
		
		
		System.out.println("�������� �� ="+local_var);
		

	}

}
