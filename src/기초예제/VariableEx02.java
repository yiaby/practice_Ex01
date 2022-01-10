package 기초예제;

public class VariableEx02 {
    //클래스 변수:어디에서든 사용 가능
    static int v2;//클래스 변수,전역변수,자동초기화=>0
    
	public static void main(String[] args) {
		int v1 = 15;//지역 변수 [반드시 초기화:값을 설정하는 것을 말함]
		
		
		
		if(v1 > 10) {
		v2 = v1 - 10; //if 블록 *()
		
		}
		
		int v3= v1+v2;
		System.out.println(v3);
        
	}

}
 