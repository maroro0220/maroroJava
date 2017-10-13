package maroro;
//Ã¶¼ö°¡ ³ÐÀÌ ¶Ù±â¸¦ Çß½À´Ï´Ù. ¿µÈñµµ † ÀÌ ¶Ù±â¸¦ Çß½À´Ï´Ù.(³ÐÀÌ ¶Ù±â ±â·ÏÀº ³­¼ö¸¦ »ç¿ëÇÕ´Ï´Ù)
//½ÉÆÇÀÌ Ã¶¼ö¿Í ¿µÈñ Áß ´©°¡ ´õ ¸Ö¸® ¶Ù¾ú´ÂÁö¸¦ ÆÇ´ÜÇÕ´Ï´Ù.

//Ã¶¼ö¿Í ¿µÈñ°¡ ÁÖ»çÀ§ ³îÀÌ¸¦ ÇÕ´Ï´Ù. Ã¶¼ö°¡ ÁÖ»çÀ§¸¦ ±¼·È½À´Ï´Ù. ¿µÈñ°¡ ÁÖ»çÀ§¸¦ ±¼·È½À´Ï´Ù. (ÁÖ»çÀ§ ¼ýÀÚ´Â ³­¼ö¸¦ »ç¿ëÇÕ´Ï´Ù.)

//1. Ã¶¼ö°¡ °ÔÀÓÀÇ ½ÂÆÐ¸¦ ÆÇ´ÜÇÕ´Ï´Ù.
//2. ¿µÈñ°¡ °ÔÀÓÀÇ ½ÂÆÐ¸¦ ÆÇ´ÜÇÕ´Ï´Ù.
//3. ¹Î¼ö°¡ °ÔÀÓÀÇ ½ÂÆÐ¸¦ ÆÇ´ÜÇÕ´Ï´Ù.

public class maroro0622_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man chul =new Man();
		Man young =new Man();
		Man minsu =new Man();	
		System.out.println("ÁÖ»çÀ§°ÔÀÓ:");
		chul.Judge(chul, young, "Ã¶¼ö");
		chul.rest();
		young.rest();
		young.Judge(chul, young, "¿µÈñ");
		chul.rest();
		young.rest();
		minsu.Judge(chul, young, "¹Î¼ö");
		}

}
class Game{
	Game(){}
	void res(Man c,Man y,String a){
		int cr=c.r, yr=y.r;
		System.out.println(a+"ÆÇ´Ü: \nÃ¶¼ö:"+cr +"\n¿µÈñ:"+ yr);
		if(cr > yr){
			System.out.println("Ã¶¼ö ½Â");}
		else if(cr < yr){
			System.out.println("¿µÈñ ½Â");}
		else{
			System.out.println("¹«½ÂºÎ");}
	}
}
class Man{
	Man(){r=(int)(Math.random()*6+1);}
	int r;
	Game g= new Game();
//	int Dice(){
//		int r=(int)(Math.random()*6+1);
//		return r;
//	}
	void Judge(Man c,Man y, String a){
		g.res(c, y, a);
	}
	void rest(){
		r=(int)(Math.random()*6+1);
	}
}
//class Young{
//	Young(){}
//	int Dice(){
//		int r=(int)(Math.random()*6+1);
//		return r;
//	}
//	g.res(chul, young);
//	
//
//}
//class Chulsu{
//	Chulsu(){}
//int Dice(){
//		int r=(int)(Math.random()*6+1);
//		return r;
//	}
//
//}
//class Minsu{
//	Minsu(){}
//}
