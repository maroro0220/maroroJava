package senior;

public class Study0621_1 {
	public static void main(String[] args) {
		Store s = new Store();
		Guest g = new Guest();
		g.showBalance();
		g.buy(s.b);//���ϰ����� �ٳ��� ����
		g.buy(s.k);//���ϰ����� Ű���� ����
		g.showBalance();
	}
}
class Store{
	Store(){}
	Banana b = new Banana();
	Kiwi k = new Kiwi();
}
class Banana{
	int price = 1000;
	Banana(){}
}
class Kiwi{
	int price = 500;
	Kiwi(){}
}
//�ٳ����� Ű���� ������ ���� 1000�� 500���Դϴ�.
//�մ��� �ֽ��ϴ�. �մ��� ��õ���� ������ �ֽ��ϴ�.
class Guest{
	int money = 5000;
	void showBalance(){
		System.out.println("�ܾ�:"+money);
	}
	void buy(Banana b){
		System.out.println("�ٳ����� ������");
		money = money - b.price;
	}
	void buy(Kiwi k){
		System.out.println("Ű���� ������");
		money = money - k.price;
	}
}
//�մ��� ���ϰ��Կ� �ִ� �ٳ����� �����մϴ�.
//(����:�մ��� ������ ������ ������ �����ȴ�.)
//�մ��� ���ϰ��Կ� �ִ� ī���� �����մϴ�.
//�մ��� ������ �ٳ����� ������ ����մϴ�.
//�մ��� �ܾ��� �մ��� ����մϴ�.

//����� �ֽ��ϴ�. �� ����� ������ 100���Դϴ�.
//ȫ�浿�̰� �ֽ��ϴ�. ȫ�浿�̰� 1000���� ������ �ֽ��ϴ�.
//ȫ�浿�̰� ����� ������ �ֽ��ϴ�.
//ȫ�浿�̰� ������ �ִ� ����� ������ ȫ�浿�̰�
//����մϴ�.

class Kildong{
	Kildong(){}
	int money = 1000;
	Apple apple = new Apple();
	void showPrice(){
		System.out.println(
		"ȫ�浿�̰� ����� ����:"+apple.price);
	}
}
class Apple{
	Apple(){}
	int price = 100;
}






