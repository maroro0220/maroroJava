package daseulkiki;

//ǥ��ü�߱��ϱ�� �ֿܼ��� ����� ü���� �Է¹��� ��,
//�� ���� �̿��ؼ� ǥ��ü���� ���Ѵ���, �Էµ� ü���� ǥ��ü�߰� ���ؼ�
//ǥ��ü������ �ƴ����� ����մϴ�.
//(ǥ��ü�� = (���� - 100) * 0.9

import java.util.Scanner;

public class Menu2 {
	Scanner scan;
	public Menu2(){
		scan = new Scanner(System.in);
	}
	
	public void data(){
		System.out.println("Ű�� �����Ը� �Է��ϼ���");
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		double stdweight;
		
		stdweight = ((height-100)* 0.9) ;
		
		if(stdweight > weight){
			System.out.println("ǥ�� ü���� �ƴմϴ�.(��ü��)");
		}
		else if(stdweight < weight){
			System.out.println("ǥ�� ü���� �ƴմϴ�.(��ü��)");
		}
		else{
			System.out.println("ǥ�� ü�� �Դϴ�.");
		}
		System.out.println("");
	}
	
}
