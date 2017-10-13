package senior;

import java.util.Scanner;

class Menu2{
	void doIt(){
		System.out.println("메뉴2입니다.");
	}
}
class Menu1{
	void doIt(){
		System.out.println("메뉴1입니다.");
	}
}
class ConsoleApp{
	Scanner scan; Menu1 m1; Menu2 m2;
	ConsoleApp(){
		scan = new Scanner(System.in);
		m1 = new Menu1();
		m2 = new Menu2();
	}
	void showMenu(){
		System.out.println("*****콘솔 System*****");
		System.out.println("*1. 인사관리");
		System.out.println("*2. 영업관리");
		System.out.println("");
		System.out.println("*9. 종 료");
		System.out.println("*********************");
		System.out.println("*원하는 메뉴를 선택합니다.*");
	}
	void doIt(){
		int select = -1;
		do{
			showMenu();
			select = scan.nextInt();
			switch(select){
			case 1:
				m1.doIt();
				break;
			case 2:
				m2.doIt();
				break;
			case 9:
				//
				break;
			default:
				System.out.println(
					"잘못된 입력입니다.다시 선택하세요.");
			}
		}while(select != 9);
		System.out.println("감사합니다. 또 이용해 주세요.");
	}
}

public class Study0622_5 {
	public static void main(String[] args) {
		ConsoleApp consoleApp = new ConsoleApp();
		consoleApp.doIt();
	}
}







