package senior;

///*�ڹٸ��ͽ��� �� ������ ������ �ֽ��ϴ�.����,Ʈ��,RV.
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
		System.out.println("����:"+price);
	}
	int price;
}
class Truck{
	Truck(){ 
		price = (int)((Math.random()*10)+1);
		System.out.println("Ʈ��:"+price);
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
// * (������ ������ ���մϴ�.)
// * �ڹٸ��ͽ����� �� ���� ��������� �ֽ��ϴ�. ȫ�浿�� ���浿.
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
// * 1.ȫ�浿�� 2���� ���ܰ� 1���� Ʈ���� �Ǹ��Ͽ����ϴ�. 
// * ���浿�� 2���� Ʈ���� 3���� RV�� �Ǹ��Ͽ����ϴ�.
// * �� ��������� �ڽ��� �Ǹ��Ѿ��� ����մϴ�.

// * 2.�ڹٸ��ͽ��� �������� ����� �Ѿ��� ����մϴ�.*/
class Manager{
	int total;//����� �Ӽ�
	void showTotal(MrOh oh, MrHong hong){
		total = total + oh.total + hong.total;
		System.out.println("������ �Ѿ�:"+total);
	}
}
public class Study0621_2 {
	public static void main(String[] args) {
		JavaMotors motors = new JavaMotors();
		motors.mH.sales(motors.s);//ȫ�� ����1�� �Ǹ�
		motors.mH.sales(motors.s);//ȫ�� ����1�� �Ǹ�
		motors.mH.sales(motors.t);//ȫ�� Ʈ��1�� �Ǹ�
		motors.mO.sales(motors.t);//���� Ʈ��1�� �Ǹ�
		motors.mO.sales(motors.t);//���� Ʈ��1�� �Ǹ�
		motors.mO.sales(motors.r);//���� Rv 1�� �Ǹ�
		motors.mO.sales(motors.r);//���� Rv 1�� �Ǹ�
		motors.mO.sales(motors.r);//���� Rv 1�� �Ǹ�
		motors.mH.showTotal();//ȫ�� ����� ���
		motors.mO.showTotal();//���� ����� ���
		motors.m.showTotal(motors.mO, motors.mH);
		//�� ����� ���
	}
}












