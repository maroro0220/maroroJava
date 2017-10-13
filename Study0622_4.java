package senior;

import java.util.Scanner;

//SRP(Single Responsibility Principle)원칙에 맞추어 설계
class ScannerStudy{
	Scanner scan;
	ScannerStudy(){
		scan = new Scanner(System.in);
	}
	void inputDate(){
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		System.out.println("입력한 나이:"+age);
		String name = scan.next();
		System.out.println("입력한 이름:"+name);
	}
}
public class Study0622_4 {
	public static void main(String[] args) {
		ScannerQuiz sq = new ScannerQuiz();
		sq.doIt();
	}
}
//Scanner를 이용한 데이터 처리 도전과제
//세명의 학생의 점수를 콘솔로 입력 받은 후,
//평균과 총점을 출력합니다.(반복문 사용)
class ScannerQuiz{
	Scanner scan;
	ScannerQuiz(){
		scan = new Scanner(System.in);
	}
	void doIt(){
		int sum = 0; int avg = 0;
		for(int cnt=1;cnt<4;cnt++){//3회 반복
			System.out.println("점수를 입력합니다.");
			sum = sum + scan.nextInt();
		}
		System.out.println(
			"총점:"+sum+",평균:"+sum/3);
	}
}












