package senior;

//���� �޼��忡�� ���ϵǴ� ������ ������ 1
//����. �л��� �������� 3���� �����ϴ� �޼���
class Student{
	Student(){}
	Student(int a){ score1 = a;}
	Student(int a, int b){score1=a; score2=b;}
	Student(int a, int b, int c){
		score1=a; score2=b; score3=c;
	}
	int score1 = 100;	int score2 = 90;
	int score3 = 80;
}
public class Study0621_5 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(99);s2.score1=100;
		Student s3 = new Student(99,89);
		Student s4 = new Student(67,56,78);
	}
}



