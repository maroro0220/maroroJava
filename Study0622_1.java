package senior;
//Ã¶¼ö°¡ ³ÐÀÌ ¶Ù±â¸¦ Çß½À´Ï´Ù. 
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
//¿µÈñµµ † ÀÌ ¶Ù±â¸¦ Çß½À´Ï´Ù.
//(³ÐÀÌ ¶Ù±â ±â·ÏÀº ³­¼ö¸¦ »ç¿ëÇÕ´Ï´Ù)
//½ÉÆÇÀÌ Ã¶¼ö¿Í ¿µÈñ Áß ´©°¡ ´õ ¸Ö¸® ¶Ù¾ú´ÂÁö¸¦ ÆÇ´ÜÇÕ´Ï´Ù.
class Simpan{
	Simpan(){}
	void judge(Chalse c, Younghee y){
		if(c.record == y.record){
			System.out.println("¹«½ÂºÎ:"+c.record);
		}else if(c.record > y.record){
			System.out.println("Ã¶ ½Â:"+c.record+","+y.record);
		}else {
			System.out.println("¿µ ½Â:"+y.record+","+c.record);
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






