package maroro;
//ö���� ���� �ٱ⸦ �߽��ϴ�. ���� ���� �ٱ⸦ �߽��ϴ�.(���� �ٱ� ����� ������ ����մϴ�)
//������ ö���� ���� �� ���� �� �ָ� �پ������� �Ǵ��մϴ�.

//ö���� ���� �ֻ��� ���̸� �մϴ�. ö���� �ֻ����� ���Ƚ��ϴ�. ���� �ֻ����� ���Ƚ��ϴ�. (�ֻ��� ���ڴ� ������ ����մϴ�.)

//1. ö���� ������ ���и� �Ǵ��մϴ�.
//2. ���� ������ ���и� �Ǵ��մϴ�.
//3. �μ��� ������ ���и� �Ǵ��մϴ�.



public class maroro0622_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man chul =new Man();
		Man young =new Man();
		Game muli=new Game();
		System.out.println("�ָ��ٱ� ����:");
		muli.Ref(chul.Record(), young.Record());
	}

}
class Game{
	Game(){}
	
	void Ref(int c, int y){
		System.out.println("ö��:"+c +"\n����:"+ y);
		if(c > y){
			System.out.println("ö�� ��");}
		else if(c< y){
			System.out.println("���� ��");}
		else{
			System.out.println("���º�");}
		
	}
}
class Man{
	Man(){}
	int Record(){
		int r=(int)(Math.random()*100+1);
				return r;
	}	
	int Dice(){
		int r=(int)(Math.random()*6+1);
		return r;
	}
}