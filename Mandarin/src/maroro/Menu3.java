package maroro;

import java.util.Scanner;

//ȯ���ϱ��, �ֿܼ��� �ݾ��� �Է¹�����, �������� ���� ������Ǳ����� ������ ��µ˴ϴ�.

public class Menu3 {
	Scanner scan = new Scanner(System.in);
	public Menu3(){	
	};
	public int money,ex5m,ex1m,ex5c,ex1c,ex5b;

	public void Exchange(){
		System.out.println("Menu3�Դϴ�.\n�ݾ��� �Է��ϼ���.");
		money=scan.nextInt();
			ex5m=money/50000;
			money=money-(ex5m*50000);
			ex1m=money/10000;
			money=money-(ex1m*10000);
			ex5c=money/5000;
			money=money-(ex5c*5000);
			ex1c=money/1000;
			money=money-(ex1c*1000);
			ex5b=money/500;
			System.out.println("\n5������:"+ex5m+"\n1������:"+ex1m+"\n5õ����:"+ex5c+"\n1õ����:"+ex1c+"\n5�����:"+ex5b);			
	}
}