package maroro;

public class maroroclass_0620 {
	//�޼��� �ۼ� ��������
	//1. ����,����,�� ������ ������ ����ؼ� �ٽ� �ۼ��մϴ�.
//		(���� void �޼���� return �޼���� �ۼ��մϴ�.)
	//2. ���� 1�� ������ ���� �ٸ� Ŭ������ �ۼ��մϴ�. 

		public static void main(String[] args) {
			int r;
			int me= (int)((Math.random() * 3) + 0);
			int com= (int)((Math.random() * 3) + 0);
			System.out.println("0:���� 1:���� 2:��");
		System.out.println("non return");
			gababovoid(me, com);
		System.out.println("return");		
			r=gababoret(me, com);
			if(r==1)
			System.out.println("I win \n");
			else if(r==2)
			System.out.println("com win \n");
			else if(r==0)
			System.out.println("draw game\n");
		}
		static void gababovoid(int me, int com){
			int res=0;
			//���� =0, ����=1, ��=2
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
		static int gababoret(int me, int com){
			int res=0;
			//���� =0, ����=1, ��=2
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
