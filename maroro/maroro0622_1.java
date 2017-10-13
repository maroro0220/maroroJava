package maroro;
//Ã¶¼ö°¡ ³ÐÀÌ ¶Ù±â¸¦ Çß½À´Ï´Ù. ¿µÈñµµ † ÀÌ ¶Ù±â¸¦ Çß½À´Ï´Ù.(³ÐÀÌ ¶Ù±â ±â·ÏÀº ³­¼ö¸¦ »ç¿ëÇÕ´Ï´Ù)
//½ÉÆÇÀÌ Ã¶¼ö¿Í ¿µÈñ Áß ´©°¡ ´õ ¸Ö¸® ¶Ù¾ú´ÂÁö¸¦ ÆÇ´ÜÇÕ´Ï´Ù.

//Ã¶¼ö¿Í ¿µÈñ°¡ ÁÖ»çÀ§ ³îÀÌ¸¦ ÇÕ´Ï´Ù. Ã¶¼ö°¡ ÁÖ»çÀ§¸¦ ±¼·È½À´Ï´Ù. ¿µÈñ°¡ ÁÖ»çÀ§¸¦ ±¼·È½À´Ï´Ù. (ÁÖ»çÀ§ ¼ýÀÚ´Â ³­¼ö¸¦ »ç¿ëÇÕ´Ï´Ù.)

//1. Ã¶¼ö°¡ °ÔÀÓÀÇ ½ÂÆÐ¸¦ ÆÇ´ÜÇÕ´Ï´Ù.
//2. ¿µÈñ°¡ °ÔÀÓÀÇ ½ÂÆÐ¸¦ ÆÇ´ÜÇÕ´Ï´Ù.
//3. ¹Î¼ö°¡ °ÔÀÓÀÇ ½ÂÆÐ¸¦ ÆÇ´ÜÇÕ´Ï´Ù.



public class maroro0622_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man chul =new Man();
		Man young =new Man();
		Game muli=new Game();
		System.out.println("¸Ö¸®¶Ù±â °ÔÀÓ:");
		muli.Ref(chul.Record(), young.Record());
	}

}
class Game{
	Game(){}
	
	void Ref(int c, int y){
		System.out.println("Ã¶¼ö:"+c +"\n¿µÈñ:"+ y);
		if(c > y){
			System.out.println("Ã¶¼ö ½Â");}
		else if(c< y){
			System.out.println("¿µÈñ ½Â");}
		else{
			System.out.println("¹«½ÂºÎ");}
		
	}
}
class Man{
	Man(){}
	int Record(){
		int r=(int)(Math.random()*100+1);
				return r;
	}	
	int Dice(){
		int r=(int)(Math.random()*6+1);
		return r;
	}
}