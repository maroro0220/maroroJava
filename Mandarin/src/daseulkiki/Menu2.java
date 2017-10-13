package daseulkiki;

//표준체중구하기는 콘솔에서 신장과 체중을 입력받은 후,
//이 값을 이용해서 표준체중을 구한다음, 입력된 체중이 표준체중과 비교해서
//표준체중인지 아닌지를 출력합니다.
//(표준체중 = (신장 - 100) * 0.9

import java.util.Scanner;

public class Menu2 {
	Scanner scan;
	public Menu2(){
		scan = new Scanner(System.in);
	}
	
	public void data(){
		System.out.println("키와 몸무게를 입력하세요");
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		double stdweight;
		
		stdweight = ((height-100)* 0.9) ;
		
		if(stdweight > weight){
			System.out.println("표준 체중이 아닙니다.(저체중)");
		}
		else if(stdweight < weight){
			System.out.println("표준 체중이 아닙니다.(과체중)");
		}
		else{
			System.out.println("표준 체중 입니다.");
		}
		System.out.println("");
	}
	
}
