package maroro;
//ö���� ���� �ٱ⸦ �߽��ϴ�. ���� ���� �ٱ⸦ �߽��ϴ�.(���� �ٱ� ����� ������ ����մϴ�)
//������ ö���� ���� �� ���� �� �ָ� �پ������� �Ǵ��մϴ�.

//ö���� ���� �ֻ��� ���̸� �մϴ�. ö���� �ֻ����� ���Ƚ��ϴ�. ���� �ֻ����� ���Ƚ��ϴ�. (�ֻ��� ���ڴ� ������ ����մϴ�.)

//1. ö���� ������ ���и� �Ǵ��մϴ�.
//2. ���� ������ ���и� �Ǵ��մϴ�.
//3. �μ��� ������ ���и� �Ǵ��մϴ�.

public class maroro0622_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chulsu chul =new Chulsu();
		Young young =new Young();
		Minsu minsu =new Minsu();
		System.out.println("�ֻ�������:");
		chul.res(chul, young);
		young.res(chul, young);
		minsu.res(chul, young);
	}

}

class Young{
	Young(){}
	int Dice(){
		int r=(int)(Math.random()*6+1);
		return r;
	}
	void res(Chulsu c,Young y){
		int cr=c.Dice(), yr=y.Dice();
		System.out.println("���� �Ǵ�: \nö��:"+cr +"\n����:"+ yr);
		if(cr > yr){
			System.out.println("ö�� ��");}
		else if(cr < yr){
			System.out.println("���� ��");}
		else{
			System.out.println("���º�");}
	}
}
class Chulsu{
	Chulsu(){}
int Dice(){
		int r=(int)(Math.random()*6+1);
		return r;
	}
void res(Chulsu c, Young y){
	int cr=c.Dice(), yr=y.Dice();
	System.out.println("���� �Ǵ�: \nö��:"+cr +"\n����:"+ yr);
	if(cr > yr){
		System.out.println("���� ��");}
	else if(cr < yr){
		System.out.println("���� ��");}
	else{
		System.out.println("���º�");}
}
}
class Minsu{
	Minsu(){}
	void res(Chulsu c, Young y){
		int cr=c.Dice(), yr=y.Dice();
		System.out.println("���� �Ǵ�: \nö��:"+cr +"\n����:"+ yr);
		if(cr > yr){
			System.out.println("ö�� ��");}
		else if(cr < yr){
			System.out.println("���� ��");}
		else{
			System.out.println("���º�");}
	}
}
