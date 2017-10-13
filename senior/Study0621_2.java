package senior;

public class Study0621_2 {
//1. 가위,바위,보 게임을 난수를 사용해서 다시 작성합니다.
//	(각각 void 메서드와 return 메서드로 작성합니다.)
	public static void main(String[] args) {
		Study0621_2.gababoV(Study0621_2.nansu(), 
				Study0621_2.nansu());
		int nan1 = Study0621_2.nansu();
		int nan2 = Study0621_2.nansu();
		Study0621_2.gababoV(nan1, nan2);
		
		String winner = Study0621_2.gababoR(
				Study0621_2.nansu(), 
				Study0621_2.nansu());
		System.out.println(winner);
	}
	static int nansu(){//0:가위,1:바위,2:보
		int su = (int)(Math.random()*3);
		return su;
	}
	static void gababoV(int g1, int g2){
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
	static String gababoR(int g1, int g2){
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
