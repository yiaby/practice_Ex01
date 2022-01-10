package 전역변수_지역변수_예제;

public class GlobalLocalEx {
    
	static int class_var;//클래스 변수:0으로 자동 초기화
	int instance_var;//인스턴스 변수:0으로 자동초기화
	
	public static void main(String[] args) {
		int local_var = 3;
		//지역변수:값을 설정해야함
		
		
		System.out.println("클래스 변수="+GlobalLocalEx.class_var);
		
		GlobalLocalEx gle = new GlobalLocalEx();
		System.out.println("인스턴스 변수값="+gle.instance_var);
		
		
		System.out.println("지역변수 값 ="+local_var);
		

	}

}
