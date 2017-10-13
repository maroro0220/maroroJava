package maroro;

public class maro0621_1 {
static String Dice(){
	int d1= (int)((Math.random()*6)+1);
	int d2= (int)((Math.random()*6)+1);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Dice());
	}

}
