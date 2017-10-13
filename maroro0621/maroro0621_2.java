package maroro0621;

///*자바모터스에 세 종류의 차량이 있습니다.세단,트럭,RV.
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
//* (가격은 난수로 정합니다.)
//* 자바모터스에는 두 명의 영업사원이 있습니다. 홍길동과 오길동.
class MrHong{
	int total;
	MrHong(){}
	void showTotal(){
		System.out.println("홍 총액:"+total);
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
		System.out.println("오 총액:"+total);
	}
	void sales(Truck t){
		total = total + t.price;
	}
	void sales(Rv r){
		total = total + r.price;
	}
}
//* 1.홍길동이 2대의 세단과 1대의 트럭을 판매하였습니다. 
//* 오길동이 2대의 트럭과 3대의 RV를 판매하였습니다.

//* 각 영업사원이 자신의 판매총액을 출력합니다.
//* 2.자바모터스의 지배인이 매출액 총액을 출력합니다.*/
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