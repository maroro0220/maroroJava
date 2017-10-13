package senior;

//1. 주사위 게임을 메서드로 작성합니다.(void,return)
//	  하나의 클래스에서 작성합니다.
//2. 위의 1번 문제를 별도의 클래스로 작성합니다.

class DiceGame{
	DiceGame(){}
	int nansu(){//0:가위,1:바위,2:보
		int su = (int)(Math.random()*3);
		return su;
	}
	void gababoV(int g1, int g2){
		System.out.println("1:"+g1+",2:"+g2);
		if(g1 == g2){//무승부
			System.out.println("무승부");
		}else if((g1==0 && g2==2) || 
			(g1==1 && g2==0) || (g1==2 && g2==1)){
			System.out.println("첫번째 승");
		}else {//두번째 승
			System.out.println("두번째 승");
		}
	}
	String gababoR(int g1, int g2){
	//예1)무승부:0리턴,첫번째승:1리턴,두번째승:-1리턴
	//예2)문자열 리턴
		System.out.println("1:"+g1+",2:"+g2);
		String winner = "";
		if(g1 == g2){//무승부
			winner = "무승부";
		}else if((g1==0 && g2==2) || 
			(g1==1 && g2==0) || (g1==2 && g2==1)){
		//첫번째 승	
			winner = "첫번째 승";
		}else {//두번째 승
			winner = "두번째 승";
		}
		return winner;
	}
	
}

public class Study0621_3 {
//2. 위의 1번 문제를 서로 다른 클래스로 작성합니다.
	static void play(){
		DiceGame game = new DiceGame();
		game.gababoV(game.nansu(), game.nansu());
		String winner =
		game.gababoR(game.nansu(), game.nansu());
		System.out.println(winner);
	}
	public static void main(String[] args) {
		play();
	}
}










