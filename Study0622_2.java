package senior;

///*ö���� ���� �ֻ��� ���̸� �մϴ�. 
// * ö���� �ֻ����� ���Ƚ��ϴ�. ���� �ֻ����� ���Ƚ��ϴ�.
// * (�ֻ��� ���ڴ� ������ ����մϴ�.)
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
//1. ö���� ������ ���и� �Ǵ��մϴ�.
//2. ���� ������ ���и� �Ǵ��մϴ�.
//3. �μ��� ������ ���и� �Ǵ��մϴ�. */
public class Study0622_2 {
	public static void main(String[] args) {

	}
}



