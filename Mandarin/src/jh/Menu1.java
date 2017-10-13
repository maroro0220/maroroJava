package jh;

import java.util.Scanner;

public class Menu1 {
	
	Scanner scan = new Scanner(System.in);
	
	public void number(){
	
	System.out.println("start number");
	int start = scan.nextInt();
	System.out.println("end number");
	int end = scan.nextInt();
	
	int r = (int)(Math.random()*end+start);
	
	System.out.println(r);
	
	}

}