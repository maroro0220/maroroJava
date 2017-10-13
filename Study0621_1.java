package senior;

public class Study0621_1 {
	public static void main(String[] args) {
		Store s = new Store();
		Guest g = new Guest();
		g.showBalance();
		g.buy(s.b);//과일가게의 바나나 구입
		g.buy(s.k);//과일가게의 키위를 구입
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
//바나나와 키위의 가격은 각각 1000원 500원입니다.
//손님이 있습니다. 손님이 오천원을 가지고 있습니다.
class Guest{
	int money = 5000;
	void showBalance(){
		System.out.println("잔액:"+money);
	}
	void buy(Banana b){
		System.out.println("바나나를 구입합");
		money = money - b.price;
	}
	void buy(Kiwi k){
		System.out.println("키위를 구입합");
		money = money - k.price;
	}
}
//손님이 과일가게에 있는 바나나를 구입합니다.
//(구매:손님의 돈에서 물건의 가격이 차감된다.)
//손님이 과일가게에 있는 카위를 구입합니다.
//손님이 구입한 바나나의 가격을 출력합니다.
//손님의 잔액을 손님이 출력합니다.

//사과가 있습니다. 이 사과의 가격은 100원입니다.
//홍길동이가 있습니다. 홍길동이가 1000원을 가지고 있습니다.
//홍길동이가 사과를 가지고 있습니다.
//홍길동이가 가지고 있는 사과의 가격을 홍길동이가
//출력합니다.

class Kildong{
	Kildong(){}
	int money = 1000;
	Apple apple = new Apple();
	void showPrice(){
		System.out.println(
		"홍길동이가 출력한 가격:"+apple.price);
	}
}
class Apple{
	Apple(){}
	int price = 100;
}






