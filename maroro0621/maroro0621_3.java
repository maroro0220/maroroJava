package maroro0621;

public class maroro0621_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hong man =new Hong();
		Item product1 =new Item(100);
		Item product2 =new Item(500);
		man.Showm();
		man.Showw();
		man.Buy(product1);
		man.Showm();
		man.Showw();
		man.Buy(product2);
		man.Showm();
		man.Showw();
		man.wallet.Buy(product2);
		man.Showm();
		man.Showw();
	}

}
class Hong{
		int money;
		Wallet wallet;
		Hong(){
			wallet =new Wallet(1000);
			money =1000;//hong'smoney
		}
		void Buy(Item item){
			System.out.println(item.price +"�� ����(ȫ)");
			money=money-item.price;
		}
		void Showm(){
			System.out.println("ȫ�浿 ��:"+money);
		}
		void Showw(){
			System.out.println("������ ���� ��:"+wallet.money);
		}
}
class Item{
	int price;
	Item(int p){
		price=p;
	}
	
}
class Wallet{
	int money;
	Wallet(int m){
		money=m;
	}
	void Buy(Item item){
		System.out.println(item.price +"�� ����(����)");
		money=money-item.price;
	}

}
