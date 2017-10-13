package senior;
class Hongildong{
	Hongildong(){
		w = new Wallet();
		money = 1000;
	}
	void buy(Item i){
		money = money - i.price;
	}
	void buyWallet(Item i){
		w.money = w.money - i.price;
	}
	Wallet w;
	int money;
}
class Wallet{
	Wallet(){
		money = 1000;
	}
	int money;
}
class Item{
	int price;
	Item(int p){
		price = p;
	}
}
public class Study0622_1 {
	public static void main(String[] args) {
		Hongildong h = new Hongildong(); 
		Item i100 = new Item(100);
		Item i500 = new Item(500);
		h.buy(i100); h.buy(i500);
		System.out.println(h.money);
		System.out.println(h.w.money);
		h.buyWallet(i500);
		System.out.println(h.w.money);
	}
}






