package maroro0621;

///*�ڹٸ��ͽ��� �� ������ ������ �ֽ��ϴ�.����,Ʈ��,RV.
class JavaMotors{
	JavaMotors(){
		s = new Sedan(); t = new Truck();
		r = new Rv(); mH = new MrHong();
		mO = new MrOh();
	}
	Sedan s; Truck t; Rv r; MrHong mH; MrOh mO;
}
class Sedan{
	Sedan(){ 
		price = (int)((Math.random()*10)+1);
	}
	int price;
}
class Truck{
	Truck(){ 
		price = (int)((Math.random()*10)+1);
	}
	int price;
}
class Rv{
	Rv(){ 
		price = (int)((Math.random()*10)+1);
	}
	int price;
}
//* (������ ������ ���մϴ�.)
//* �ڹٸ��ͽ����� �� ���� ��������� �ֽ��ϴ�. ȫ�浿�� ���浿.
class MrHong{
	int total;
	MrHong(){}
	void showTotal(){
		System.out.println("ȫ �Ѿ�:"+total);
	}
	void sales(Sedan sedan){
		total = total + sedan.price;
	}
	void sales(Truck truck){
		total = total + truck.price;
	}
}
class MrOh{
	int total;
	MrOh(){}
	void showTotal(){
		System.out.println("�� �Ѿ�:"+total);
	}
	void sales(Truck t){
		total = total + t.price;
	}
	void sales(Rv r){
		total = total + r.price;
	}
}
//* 1.ȫ�浿�� 2���� ���ܰ� 1���� Ʈ���� �Ǹ��Ͽ����ϴ�. 
//* ���浿�� 2���� Ʈ���� 3���� RV�� �Ǹ��Ͽ����ϴ�.

//* �� ��������� �ڽ��� �Ǹ��Ѿ��� ����մϴ�.
//* 2.�ڹٸ��ͽ��� �������� ����� �Ѿ��� ����մϴ�.*/
class Boss{
	Boss(MrHong h, MrOh o){tot = (h.total)+(o.total);}
	int tot;
	
}
public class maroro0621_2 {
	public static void main(String[] args) {
		JavaMotors jm=new JavaMotors();
		System.out.println("sedan price:"+jm.s.price+"\ntruck price:"+jm.t.price+"\nrv price"+jm.r.price);
		jm.mH.sales(jm.s);		jm.mH.sales(jm.s);
		jm.mH.sales(jm.t);
		jm.mO.sales(jm.t);		jm.mO.sales(jm.t);
		jm.mO.sales(jm.r);		jm.mO.sales(jm.r);		jm.mO.sales(jm.r);
	System.out.println("\nhong tot:"+jm.mH.total +"\noh tot:"+jm.mO.total);	
	Boss b=new Boss(jm.mH, jm.mO);
	System.out.println("JM Total:"+ b.tot);	
	}
}