package senior;
class Robot{
	Robot(){}
}
public class Study0620_4 {
//�޼��� �ۼ� ��������
//1. ����,����,�� ������ ������ ����ؼ� �ٽ� �ۼ��մϴ�.
//	(���� void �޼���� return �޼���� �ۼ��մϴ�.)
//2. ���� 1�� ������ ���� �ٸ� Ŭ������ �ۼ��մϴ�.
	Robot myRobot(){
		Robot r = new Robot();
		return r;
	}
	String myName(){
		String name = "ȣ����";
		return name;
	}
	Study0620_4(){}
	void nansu(){
	//1. 0���� 2������ ���� ���ϱ�
	int nsu1 = (int)((Math.random() * 3) + 0);
	System.out.println("��������������:"+nsu1);
	//2. 1���� 100������ ���� ���ϱ�
	nsu1 = (int)((Math.random() * 100) + 1);
	System.out.println("��������:"+nsu1);
	}
	public static void main(String[] args) {
		Study0620_4 s04 = new Study0620_4();
		s04.nansu();
	}
}
