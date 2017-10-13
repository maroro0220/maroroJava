//package maroro0621;
//
//public class maroro0621_1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		자바모터스에 세 종류의 차량이 있습니다. 세단, 트럭, RV.(가격은 난수로 정합니다.)
////		자바모터스에는 두 명의 영업사원이 있습니다. 홍길동과 오길동.
////		1. 
////		홍길동이 2대의 세단과 1대의 트럭을 판매하였습니다. 오길동이 2대의 트럭과 3대의 RV를 판매하였습니다.
////		각 영업사원이 자신의 판매총액을 출력합니다.
////		2. 
////		자바모터스의 재배인이 매출액 총액을 출력합니다.
//		JavaMotors jm =new JavaMotors();
////		Sedan se=new Sedan();
////		Truck tr=new Truck();
////		Rv rv=new Rv();
////		Boss boss=new Boss();
////		jm.s.price=jm.RandPrice();
////		jm.t.price=jm.RandPrice();
////		jm.r.price=jm.RandPrice();
//		Employee hong=new Employee();
//		Employee oh=new Employee();
//		hong.s.sn=2;
//		hong.t.tn=1;
//		oh.t.tn=2;
//		oh.r.rn=3;
//		System.out.println("hong sedan:"+hong.s.price+"*"+hong.s.sn);
//		System.out.println("hong truck:"+hong.t.price+"*"+hong.t.tn);
//		System.out.println("oh rv:"+oh.r.price+"*"+oh.r.rn);
//		System.out.println("oh truck:"+oh.t.price+"*"+oh.t.tn);
//		System.out.println("hong:"); hong.show(hong);
//		System.out.println("oh:"); oh.show(oh);
////		System.out.println("hong total:"+jm.hong.sellh(hong)+"\noh total:"+jm.oh.sello(oh));
//	}
//
//}
//class JavaMotors{
//	JavaMotors(){	Sedan s=new Sedan();
//	Truck t=new Truck();
//	Rv r=new Rv();
//	Employee hong=new Employee();
//	Employee oh=new Employee();
//	}
//Sedan s; Truck t; Rv r;
//Employee hong; Employee oh;
//
////	int RandPrice(){
////		int rp=(int)(Math.random()*10000+1);
////		return rp;
////	}
//}
//class Sedan{
//	Sedan(){price =(int)(Math.random()*100+1);}
//	int price;
//	int sn;
//}
//class Truck{
//	Truck(){price =(int)(Math.random()*100+1);}
//	int price;
//	int tn;
//}
//class Rv{
//	Rv(){price =(int)(Math.random()*100+1);}
//	int price;
//	int rn;
//}
//
//class hong{
//	int total;
//	hong(){}
//	void sales(Truck t){
//		total=total+t.price;
//	}
//}
//	
