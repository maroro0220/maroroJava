package team;


import java.util.Scanner;
import daseulkiki.Menu2;
import maroro.Menu3;
import jh.Menu1;


class ConsoleApp{
	Scanner scan;
	ConsoleApp(){
		scan = new Scanner(System.in);
	}
	
	Menu1 m1 = new Menu1();
	Menu2 m2 = new Menu2();
	Menu3 m3 = new Menu3();

	
	void showMenu(){
		System.out.println("***** Choose number *****");
		System.out.println("*1. random number ");
		System.out.println("*2. standard weight");
		System.out.println("*3. exchange");
		System.out.println("*9. exit");
		System.out.println("*********************");

	}
	public void doIt(){
		int select = -1;
		do{
			showMenu();
			select = scan.nextInt();
			switch(select){
			case 1:
				m1.number();
				
				break;
			case 2:
				m2.data();
				break;
				
			case 3:
				m3.Exchange();
				break;
				
			case 9:
				//
				break;
			default:
				System.out.println(
					"wrong way. try again.");
			}
		}while(select != 9);
		System.out.println("Thank you! Have a nice day");
	}
}
public class Console{
	public static void main(String[] args) {
		ConsoleApp consoleApp = new ConsoleApp();
		consoleApp.doIt();
	}
}



