package senior;

///*철수와 영희가 주사위 놀이를 합니다. 
// * 철수가 주사위를 굴렸습니다. 영희가 주사위를 굴렸습니다.
// * (주사위 숫자는 난수를 사용합니다.)
class Chulsu{
	int su;
	void judge(Younghe y){
		if(su == y.su){
			
		}else if(su > y.su){
			
		}else {
			
		}
	}
	void rolling(){
		su = (int)(Math.random()*6+1);
	}
}
class Younghe{
	int su;
	void judge(Chulsu c){
		if(su == c.su){
			
		}else if(su > c.su){
			
		}else {
			
		}
	}
	void rolling(){
		su = (int)(Math.random()*6+1);
	}
}
class Minsu{
	void judge(Chulsu c, Younghe y){
		if(y.su == c.su){
			
		}else if(y.su > c.su){
			
		}else {
			
		}
	}
}
//1. 철수가 게임의 승패를 판단합니다.
//2. 영희가 게임의 승패를 판단합니다.
//3. 민수가 게임의 승패를 판단합니다. */
public class Study0622_2 {
	public static void main(String[] args) {

	}
}



