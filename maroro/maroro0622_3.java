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

		Man chul =new Man();
		Man young =new Man();
		Man minsu =new Man();	
		System.out.println("�ֻ�������:");
		chul.Judge(chul, young, "ö��");
		chul.rest();
		young.rest();
		young.Judge(chul, young, "����");
		chul.rest();
		young.rest();
		minsu.Judge(chul, young, "�μ�");
		}

}
class Game{
	Game(){}
	void res(Man c,Man y,String a){
		int cr=c.r, yr=y.r;
		System.out.println(a+"�Ǵ�: \nö��:"+cr +"\n����:"+ yr);
		if(cr > yr){
			System.out.println("ö�� ��");}
		else if(cr < yr){
			System.out.println("���� ��");}
		else{
			System.out.println("���º�");}
	}
}
class Man{
	Man(){r=(int)(Math.random()*6+1);}
	int r;
	Game g= new Game();
//	int Dice(){
//		int r=(int)(Math.random()*6+1);
//		return r;
//	}
	void Judge(Man c,Man y, String a){
		g.res(c, y, a);
	}
	void rest(){
		r=(int)(Math.random()*6+1);
	}
}
//class Young{
//	Young(){}
//	int Dice(){
//		int r=(int)(Math.random()*6+1);
//		return r;
//	}
//	g.res(chul, young);
//	
//
//}
//class Chulsu{
//	Chulsu(){}
//int Dice(){
//		int r=(int)(Math.random()*6+1);
//		return r;
//	}
//
//}
//class Minsu{
//	Minsu(){}
//}
