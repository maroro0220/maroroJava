package senior;

//1. �ֻ��� ������ �޼���� �ۼ��մϴ�.(void,return)
//	  �ϳ��� Ŭ�������� �ۼ��մϴ�.
//2. ���� 1�� ������ ������ Ŭ������ �ۼ��մϴ�.

class DiceGame{
	DiceGame(){}
	int nansu(){//0:����,1:����,2:��
		int su = (int)(Math.random()*3);
		return su;
	}
	void gababoV(int g1, int g2){
		System.out.println("1:"+g1+",2:"+g2);
		if(g1 == g2){//���º�
			System.out.println("���º�");
		}else if((g1==0 && g2==2) || 
			(g1==1 && g2==0) || (g1==2 && g2==1)){
			System.out.println("ù��° ��");
		}else {//�ι�° ��
			System.out.println("�ι�° ��");
		}
	}
	String gababoR(int g1, int g2){
	//��1)���º�:0����,ù��°��:1����,�ι�°��:-1����
	//��2)���ڿ� ����
		System.out.println("1:"+g1+",2:"+g2);
		String winner = "";
		if(g1 == g2){//���º�
			winner = "���º�";
		}else if((g1==0 && g2==2) || 
			(g1==1 && g2==0) || (g1==2 && g2==1)){
		//ù��° ��	
			winner = "ù��° ��";
		}else {//�ι�° ��
			winner = "�ι�° ��";
		}
		return winner;
	}
	
}

public class Study0621_3 {
//2. ���� 1�� ������ ���� �ٸ� Ŭ������ �ۼ��մϴ�.
	static void play(){
		DiceGame game = new DiceGame();
		game.gababoV(game.nansu(), game.nansu());
		String winner =
		game.gababoR(game.nansu(), game.nansu());
		System.out.println(winner);
	}
	public static void main(String[] args) {
		play();
	}
}










