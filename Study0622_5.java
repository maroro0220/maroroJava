package senior;

import java.util.Scanner;

class Menu2{
	void doIt(){
		System.out.println("�޴�2�Դϴ�.");
	}
}
class Menu1{
	void doIt(){
		System.out.println("�޴�1�Դϴ�.");
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
		System.out.println("*****�ܼ� System*****");
		System.out.println("*1. �λ����");
		System.out.println("*2. ��������");
		System.out.println("");
		System.out.println("*9. �� ��");
		System.out.println("*********************");
		System.out.println("*���ϴ� �޴��� �����մϴ�.*");
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
					"�߸��� �Է��Դϴ�.�ٽ� �����ϼ���.");
			}
		}while(select != 9);
		System.out.println("�����մϴ�. �� �̿��� �ּ���.");
	}
}

public class Study0622_5 {
	public static void main(String[] args) {
		ConsoleApp consoleApp = new ConsoleApp();
		consoleApp.doIt();
	}
}







