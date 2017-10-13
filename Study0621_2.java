package senior;

///*자바모터스에 세 종류의 차량이 있습니다.세단,트럭,RV.
class JavaMotors{
	JavaMotors(){
		s = new Sedan(); t = new Truck();
		r = new Rv(); mH = new MrHong();
		mO = new MrOh(); m = new Manager();
	}
	Manager m;
	Sedan s; Truck t; Rv r; MrHong mH; MrOh mO;
}
class Sedan{
	Sedan(){ 
		price = (int)((Math.random()*10)+1);
		System.out.println("세단:"+price);
	}
	int price;
}
class Truck{
	Truck(){ 
		price = (int)((Math.random()*10)+1);
		System.out.println("트럭:"+price);
	}
	int price;
}
class Rv{
	Rv(){ 
		price = (int)((Math.random()*10)+1);
		System.out.println("RV:"+price);
	}
	int price;
}
// * (가격은 난수로 정합니다.)
// * 자바모터스에는 두 명의 영업사원이 있습니다. 홍길동과 오길동.
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
// * 1.홍길동이 2대의 세단과 1대의 트럭을 판매하였습니다. 
// * 오길동이 2대의 트럭과 3대의 RV를 판매하였습니다.
// * 각 영업사원이 자신의 판매총액을 출력합니다.

// * 2.자바모터스의 지배인이 매출액 총액을 출력합니다.*/
class Manager{
	int total;//매출액 속성
	void showTotal(MrOh oh, MrHong hong){
		total = total + oh.total + hong.total;
		System.out.println("매장의 총액:"+total);
	}
}
public class Study0621_2 {
	public static void main(String[] args) {
		JavaMotors motors = new JavaMotors();
		motors.mH.sales(motors.s);//홍이 세단1대 판매
		motors.mH.sales(motors.s);//홍이 세단1대 판매
		motors.mH.sales(motors.t);//홍이 트럭1대 판매
		motors.mO.sales(motors.t);//오가 트럭1대 판매
		motors.mO.sales(motors.t);//오가 트럭1대 판매
		motors.mO.sales(motors.r);//오가 Rv 1대 판매
		motors.mO.sales(motors.r);//오가 Rv 1대 판매
		motors.mO.sales(motors.r);//오가 Rv 1대 판매
		motors.mH.showTotal();//홍이 매출액 출력
		motors.mO.showTotal();//오가 매출액 출력
		motors.m.showTotal(motors.mO, motors.mH);
		//총 매출액 출력
	}
}












