package senior;
class Robot{
	Robot(){}
}
public class Study0620_4 {
//메서드 작성 도전과제
//1. 가위,바위,보 게임을 난수를 사용해서 다시 작성합니다.
//	(각각 void 메서드와 return 메서드로 작성합니다.)
//2. 위의 1번 문제를 서로 다른 클래스로 작성합니다.
	Robot myRobot(){
		Robot r = new Robot();
		return r;
	}
	String myName(){
		String name = "호랑이";
		return name;
	}
	Study0620_4(){}
	void nansu(){
	//1. 0부터 2까지의 난수 구하기
	int nsu1 = (int)((Math.random() * 3) + 0);
	System.out.println("가위바위보난수:"+nsu1);
	//2. 1부터 100까지의 난수 구하기
	nsu1 = (int)((Math.random() * 100) + 1);
	System.out.println("점수난수:"+nsu1);
	}
	public static void main(String[] args) {
		Study0620_4 s04 = new Study0620_4();
		s04.nansu();
	}
}
