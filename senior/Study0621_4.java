package senior;

class NewDiceGame{
	NewDiceGame(){}
	int rand(){//1���� 6
		int r = (int)((Math.random()*6)+1);
		return r;
	}
	void diceV(int dice1, int dice2){
		if(dice1 == dice2){
			System.out.println("���º�");
		}else if(dice1 > dice2){
			System.out.println(
					dice1+"�� "+dice2+"�� dice1 ��");
		}else{
			System.out.println(
					dice1+"�� "+dice2+"�� dice2 ��");
		}
	}
	String diceR(int dice1, int dice2){
		String result = "";
		if(dice1 == dice2){
			result = "���º�";
		}else if(dice1 > dice2){
			result=dice1+"�� "+dice2+"�� dice1 ��";
		}else{
			result=dice1+"�� "+dice2+"�� dice2 ��";
		}
		return result;
	}
}
public class Study0621_4 {
	int rand(){//1���� 6
		int r = (int)((Math.random()*6)+1);
		return r;
	}
	void diceV(int dice1, int dice2){
		if(dice1 == dice2){
			System.out.println("���º�");
		}else if(dice1 > dice2){
			System.out.println(
					dice1+"�� "+dice2+"�� dice1 ��");
		}else{
			System.out.println(
					dice1+"�� "+dice2+"�� dice2 ��");
		}
	}
	String diceR(int dice1, int dice2){
		String result = "";
		if(dice1 == dice2){
			result = "���º�";
		}else if(dice1 > dice2){
			result=dice1+"�� "+dice2+"�� dice1 ��";
		}else{
			result=dice1+"�� "+dice2+"�� dice2 ��";
		}
		return result;
	}
//1. �ֻ��� ������ �޼���� �ۼ��մϴ�.(void,return)
//	  �ϳ��� Ŭ�������� �ۼ��մϴ�.
//2. ���� 1�� ������ ������ Ŭ������ �ۼ��մϴ�.
	public static void main(String[] args) {
		Study0621_4 s = new Study0621_4();
		s.diceV(s.rand(), s.rand());
		String r = s.diceR(s.rand(), s.rand());
		System.out.println(r);
		//---------------------------------
		NewDiceGame ndg = new NewDiceGame();
		ndg.diceV(ndg.rand(), ndg.rand());
		r = ndg.diceR(ndg.rand(), ndg.rand());
		System.out.println(r);
	}
}







