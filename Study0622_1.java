package senior;
//ö���� ���� �ٱ⸦ �߽��ϴ�. 
class Younghee{
	int record;
	Younghee(){}
	void jump(){
		record = (int)((Math.random()*10)+1);
	}
}
class Chalse{
	int record;
	Chalse(){}
	void jump(){
		record = (int)((Math.random()*10)+1);
	}
}
//���� ���� �ٱ⸦ �߽��ϴ�.
//(���� �ٱ� ����� ������ ����մϴ�)
//������ ö���� ���� �� ���� �� �ָ� �پ������� �Ǵ��մϴ�.
class Simpan{
	Simpan(){}
	void judge(Chalse c, Younghee y){
		if(c.record == y.record){
			System.out.println("���º�:"+c.record);
		}else if(c.record > y.record){
			System.out.println("ö ��:"+c.record+","+y.record);
		}else {
			System.out.println("�� ��:"+y.record+","+c.record);
		}
	}
}
public class Study0622_1 {
	public static void main(String[] args) {
		Chalse c = new Chalse();
		Younghee y = new Younghee();
		c.jump(); y.jump();
		Simpan s = new Simpan();
		s.judge(c, y);
	}
}






