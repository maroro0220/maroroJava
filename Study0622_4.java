package senior;

import java.util.Scanner;

//SRP(Single Responsibility Principle)��Ģ�� ���߾� ����
class ScannerStudy{
	Scanner scan;
	ScannerStudy(){
		scan = new Scanner(System.in);
	}
	void inputDate(){
		System.out.println("���̸� �Է��ϼ���.");
		int age = scan.nextInt();
		System.out.println("�Է��� ����:"+age);
		String name = scan.next();
		System.out.println("�Է��� �̸�:"+name);
	}
}
public class Study0622_4 {
	public static void main(String[] args) {
		ScannerQuiz sq = new ScannerQuiz();
		sq.doIt();
	}
}
//Scanner�� �̿��� ������ ó�� ��������
//������ �л��� ������ �ַܼ� �Է� ���� ��,
//��հ� ������ ����մϴ�.(�ݺ��� ���)
class ScannerQuiz{
	Scanner scan;
	ScannerQuiz(){
		scan = new Scanner(System.in);
	}
	void doIt(){
		int sum = 0; int avg = 0;
		for(int cnt=1;cnt<4;cnt++){//3ȸ �ݺ�
			System.out.println("������ �Է��մϴ�.");
			sum = sum + scan.nextInt();
		}
		System.out.println(
			"����:"+sum+",���:"+sum/3);
	}
}












