package maroro;

import java.util.Scanner;

//환전하기는, 콘솔에서 금액을 입력받으면, 오만원권 부터 오백원권까지의 갯수가 출력됩니다.

public class Menu3 {
	Scanner scan = new Scanner(System.in);
	public Menu3(){	
	};
	public int money,ex5m,ex1m,ex5c,ex1c,ex5b;

	public void Exchange(){
		System.out.println("Menu3입니다.\n금액을 입력하세요.");
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
			System.out.println("\n5만원권:"+ex5m+"\n1만원권:"+ex1m+"\n5천원권:"+ex5c+"\n1천원권:"+ex1c+"\n5백원권:"+ex5b);			
	}
}
