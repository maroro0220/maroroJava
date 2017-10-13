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

		Chulsu chul =new Chulsu();
		Young young =new Young();
		Minsu minsu =new Minsu();
		System.out.println("ÁÖ»çÀ§°ÔÀÓ:");
		chul.res(chul, young);
		young.res(chul, young);
		minsu.res(chul, young);
	}

}

class Young{
	Young(){}
	int Dice(){
		int r=(int)(Math.random()*6+1);
		return r;
	}
	void res(Chulsu c,Young y){
		int cr=c.Dice(), yr=y.Dice();
		System.out.println("¿µÈñ ÆÇ´Ü: \nÃ¶¼ö:"+cr +"\n¿µÈñ:"+ yr);
		if(cr > yr){
			System.out.println("Ã¶¼ö ½Â");}
		else if(cr < yr){
			System.out.println("³»°¡ ½Â");}
		else{
			System.out.println("¹«½ÂºÎ");}
	}
}
class Chulsu{
	Chulsu(){}
int Dice(){
		int r=(int)(Math.random()*6+1);
		return r;
	}
void res(Chulsu c, Young y){
	int cr=c.Dice(), yr=y.Dice();
	System.out.println("¿µÈñ ÆÇ´Ü: \nÃ¶¼ö:"+cr +"\n¿µÈñ:"+ yr);
	if(cr > yr){
		System.out.println("³»°¡ ½Â");}
	else if(cr < yr){
		System.out.println("¿µÈñ ½Â");}
	else{
		System.out.println("¹«½ÂºÎ");}
}
}
class Minsu{
	Minsu(){}
	void res(Chulsu c, Young y){
		int cr=c.Dice(), yr=y.Dice();
		System.out.println("¿µÈñ ÆÇ´Ü: \nÃ¶¼ö:"+cr +"\n¿µÈñ:"+ yr);
		if(cr > yr){
			System.out.println("Ã¶¼ö ½Â");}
		else if(cr < yr){
			System.out.println("¿µÈñ ½Â");}
		else{
			System.out.println("¹«½ÂºÎ");}
	}
}
