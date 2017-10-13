package senior;

class Tiger{
	Tiger(){}
	int age = 12;
}
class Apple{
	Apple(){}//생성자
	int price = 1000;
	static int sum = 1;
	void display(){
		System.out.println("사과입니다.");
	}
	void show(){}
	void run(){}
}
public class Study0620_2 {
	Study0620_2(){}
	static Tiger t2;
	int summary= 500;
	static void quiz1(){
		Tiger t = new Tiger();
		t2 = new Tiger();
		Study0620_2 s = new Study0620_2();
		int total = 1 + s.summary;
		Apple app1 = new Apple();
		Apple app2 = new Apple();
		Apple app3 = new Apple();
	}
	public static void main(String[] args) {
		quiz1();
	}
}
//모든 클래스는 인스턴스로 바뀌어야 한다.
//메서드가 클래스 안에 존재

//모든 데이터 처리는 메서드에서 수행된다.
//프로그램 시작 -> 데이터 처리 -> 메서드 수행

//인스턴스로 생성하지 않고, 사용할 수 있는 수단
//-----> static(인스턴스와 관계없다)













