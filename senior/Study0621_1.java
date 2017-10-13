package senior;
class Kiwi{
	Kiwi(){}
	int price = 1000;
	void add(){}
	void add(int a){}
	int add(int a, int b, int c){ return 10;}
	void add(int a, int b){}
	void add(long a, int c){}
	void add(long a, long b){}
	void add(int a, long b){}
}
class Client{//기본생성자가 자동생성
	int money = 1000;
	void method(int a){
		int total = 10;
	}
}
//static의 위치
//1. 메서드 앞
//2. 클래스 내의 변수 앞
public class Study0621_1 {
	Study0621_1(){}
	//키위의 가격을 출력하는 메서드
	void display(int kiwi){//kiwi <- 1000
		System.out.println(kiwi);
	}
	void display(Kiwi kiwi){//kiwi <- new Kiwi();
		System.out.println(kiwi.price);
	}
	public static void main(String[] args) {
		Study0621_1 s = new Study0621_1();
		Kiwi kiwi = new Kiwi();
		s.display(kiwi.price);
		s.display(kiwi);
	}
}





