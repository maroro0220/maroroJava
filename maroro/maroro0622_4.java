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
			System.out.println("�л� "+(i+1)+"�� ���� �Է�:");
		stud[i]=scan.nextInt();
			System.out.println("�л� "+(i+1)+"�� ����:"+stud[i]);
			tot=tot+stud[i];
		}
		avg=tot/3;
		System.out.println("����:"+tot+"\n���"+avg);
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
