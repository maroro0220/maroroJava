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
class Client{//�⺻�����ڰ� �ڵ�����
	int money = 1000;
	void method(int a){
		int total = 10;
	}
}
//static�� ��ġ
//1. �޼��� ��
//2. Ŭ���� ���� ���� ��
public class Study0621_1 {
	Study0621_1(){}
	//Ű���� ������ ����ϴ� �޼���
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





