package senior;
class Apple{
		Apple(){}         //생성자
			void display(){
				System.out.println("사과입니다");	
		}
	
}
class Tiger{
	Tiger(){}     //기본 생성자. 기본 생성자 없으면 컴파일러가 기본 생성자까지는 붙여줌
}
class Other{
	//생성자->메서드
	//void 메서드, 리턴 메서드
	
	Other(){}//생성자:Other 클래스를 생성하는 작업
	
	int salary;
	void method(){
		
	}
}
//클래스를 상용하기 위해서는,
//클래스를 생성해야 한다. -> 생성은 데이터처리다.
//데이터처리 -> 메서드가 필요하다.
//클래스를 생성하는 메서드 -> 생성자(constructor)

//변수초기화,변수선언을 제외한 모든 작업은 데이터처리다
//모든 데이터 처리는 메서드에서 이루어져야 한다.

public class Study01 {
	int value1=10;
	static double value2;
	static Tiger t2;
	public static void main(String[] args) {
		method01();
		int sum = method02(3,5);
		Apple app=new Apple();         //인스턴스가 바뀜, Apple class가 바꼈으니깐 앞에 Apple을 써줌
		Tiger t =new Tiger();
		t2= new Tiger();
		Tiger t3;
		t3 = new Tiger();
		Apple app1=new Apple();  
		Apple app2=new Apple();
		Apple app3=new Apple();     
	}
	static void method01(){
		
	}
	static int method02(int v1, int v2){
		int v3 = v1 + v2;
		return v3;
	}
}
