package maroro;
class Game{
	String Dice(int d1, int d2){
		int res=0;
		System.out.println("me :"+d1+"\ncom:"+d2);
		String winner="";
		if(d1==d2)
			winner="draw";
		else{
		res=d1>d2 ? 1:2;
		if (res==1)
			winner="me";
		else if(res==2)
			winner="com";
			}
		return winner;
	}
	int Ran(){
		int r=(int)((Math.random()*6)+1);
		return r;
	}
	
}

public class maro0621_2 {
	static void Play(){
		int r1=0, r2=0;
		Game g= new Game();
		r1=g.Ran();
		r2=g.Ran();
		System.out.println("winner:"+g.Dice(r1,r2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Play();
	}

}
