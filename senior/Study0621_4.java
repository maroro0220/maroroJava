package senior;

class NewDiceGame{
	NewDiceGame(){}
	int rand(){//1부터 6
		int r = (int)((Math.random()*6)+1);
		return r;
	}
	void diceV(int dice1, int dice2){
		if(dice1 == dice2){
			System.out.println("무승부");
		}else if(dice1 > dice2){
			System.out.println(
					dice1+"대 "+dice2+"로 dice1 승");
		}else{
			System.out.println(
					dice1+"대 "+dice2+"로 dice2 승");
		}
	}
	String diceR(int dice1, int dice2){
		String result = "";
		if(dice1 == dice2){
			result = "무승부";
		}else if(dice1 > dice2){
			result=dice1+"대 "+dice2+"로 dice1 승";
		}else{
			result=dice1+"대 "+dice2+"로 dice2 승";
		}
		return result;
	}
}
public class Study0621_4 {
	int rand(){//1부터 6
		int r = (int)((Math.random()*6)+1);
		return r;
	}
	void diceV(int dice1, int dice2){
		if(dice1 == dice2){
			System.out.println("무승부");
		}else if(dice1 > dice2){
			System.out.println(
					dice1+"대 "+dice2+"로 dice1 승");
		}else{
			System.out.println(
					dice1+"대 "+dice2+"로 dice2 승");
		}
	}
	String diceR(int dice1, int dice2){
		String result = "";
		if(dice1 == dice2){
			result = "무승부";
		}else if(dice1 > dice2){
			result=dice1+"대 "+dice2+"로 dice1 승";
		}else{
			result=dice1+"대 "+dice2+"로 dice2 승";
		}
		return result;
	}
//1. 주사위 게임을 메서드로 작성합니다.(void,return)
//	  하나의 클래스에서 작성합니다.
//2. 위의 1번 문제를 별도의 클래스로 작성합니다.
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







