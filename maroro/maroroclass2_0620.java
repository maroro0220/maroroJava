package maroro;

class Gbb{
	Gbb(){}
	 void gababovoid(){
		int me= (int)((Math.random() * 3) + 0);
		int com= (int)((Math.random() * 3) + 0);
		int res=0;
		//가위 =0, 바위=1, 보=2
		//	if(me)
		System.out.println("me :"+me+"\ncom:"+com);
		if(me==com){
			System.out.println("draw game\n");
		}
		else if(com!=2){
		res=me>com ? 1:2;
		if(res==2)
			System.out.println("com win \n");
		else if(res==1)
			System.out.println("I win \n");
		}
		else if(com==2 && me==0)
			System.out.println("I win \n");
		else if(com==0 && me==2)
			System.out.println("com win \n");
	}
	 int gababoret(){
		int me= (int)((Math.random() * 3) + 0);
		int com= (int)((Math.random() * 3) + 0);
		int res=0;
		//가위 =0, 바위=1, 보=2
		//	if(me)
		System.out.println("me :"+me+"\ncom:"+com);
		if(me==com){
			res=0;
		}
		else if(com!=2){
		res=me>com ? 1:2;
		
		}
		else if(com==2 && me==0){
			res=1;
		}
		else if(com==0 && me==2){
			res=2;	
		}
		return res;
	}  
}

public class maroroclass2_0620 {
	//메서드 작성 도전과제
	//1. 가위,바위,보 게임을 난수를 사용해서 다시 작성합니다.
//		(각각 void 메서드와 return 메서드로 작성합니다.)
	//2. 위의 1번 문제를 서로 다른 클래스로 작성합니다. 
	
		public static void main(String[] args) {
			int r;
			Gbb g=new Gbb();
			System.out.println("0:가위 1:바위 2:보");
			System.out.println("non return");
			g.gababovoid();
			System.out.println("return");		
			r=g.gababoret();
			if(r==1)
			System.out.println("I win \n");
			else if(r==2)
			System.out.println("com win \n");
			else if(r==0)
			System.out.println("draw game\n");
		
		}
		
		
}
