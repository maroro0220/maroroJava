package senior;

class Other{
	//������->�޼���
	//void �޼���, ���� �޼���
	
	Other(){}//������:Other Ŭ������ �����ϴ� �۾�
	
	int salary;
	void method(){
		
	}
}
//Ŭ������ ����ϱ� ���ؼ���,
//Ŭ������ �����ؾ� �Ѵ�. -> ������ ������ó����.
//������ó�� -> �޼��尡 �ʿ��ϴ�.
//Ŭ������ �����ϴ� �޼��� -> ������(constructor)

//�����ʱ�ȭ,���������� ������ ��� �۾��� ������ó����
//��� ������ ó���� �޼��忡�� �̷������ �Ѵ�.

public class Study0620_1 {
	int value1=10;
	static double value2;
	public static void main(String[] args) {
		method01();
		int sum = method02(3,5);
	}
	static void method01(){
		
	}
	static int method02(int v1, int v2){
		int v3 = v1 + v2;
		return v3;
	}
}
