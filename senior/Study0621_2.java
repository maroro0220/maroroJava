package senior;

public class Study0621_2 {
//1. ����,����,�� ������ ������ ����ؼ� �ٽ� �ۼ��մϴ�.
//	(���� void �޼���� return �޼���� �ۼ��մϴ�.)
	public static void main(String[] args) {
		Study0621_2.gababoV(Study0621_2.nansu(), 
				Study0621_2.nansu());
		int nan1 = Study0621_2.nansu();
		int nan2 = Study0621_2.nansu();
		Study0621_2.gababoV(nan1, nan2);
		
		String winner = Study0621_2.gababoR(
				Study0621_2.nansu(), 
				Study0621_2.nansu());
		System.out.println(winner);
	}
	static int nansu(){//0:����,1:����,2:��
		int su = (int)(Math.random()*3);
		return su;
	}
	static void gababoV(int g1, int g2){
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
	static String gababoR(int g1, int g2){
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
