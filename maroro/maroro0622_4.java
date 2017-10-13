package maroro;

import java.util.Scanner;

class Student{
	Scanner scan;
	int[] stud=new int[3];
	int tot;
	double avg;
	Student(){
		scan = new Scanner(System.in);	}
	void insert(){
		for(int i=0;i<3;i++){
			System.out.println("학생 "+(i+1)+"의 점수 입력:");
		stud[i]=scan.nextInt();
			System.out.println("학생 "+(i+1)+"의 점수:"+stud[i]);
			tot=tot+stud[i];
		}
		avg=tot/3;
		System.out.println("총점:"+tot+"\n평균"+avg);
	}
}
public class maroro0622_4 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Student st=new Student();
		st.insert();
//		Scanner scan=new Scanner(System.in);
//		
//		int[] stud={0,0,0};
//		for(int i=0;i<3;i++){
//			stud[i]=scan.nextInt();
//		}
	}

}
