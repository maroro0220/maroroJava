package senior;
class Apple{
		Apple(){}         //������
			void display(){
				System.out.println("����Դϴ�");	
		}
	
}
class Tiger{
	Tiger(){}     //�⺻ ������. �⺻ ������ ������ �����Ϸ��� �⺻ �����ڱ����� �ٿ���
}
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

public class Study01 {
	int value1=10;
	static double value2;
	static Tiger t2;
	public static void main(String[] args) {
		method01();
		int sum = method02(3,5);
		Apple app=new Apple();         //�ν��Ͻ��� �ٲ�, Apple class�� �ٲ����ϱ� �տ� Apple�� ����
		Tiger t =new Tiger();
		t2= new Tiger();
		Tiger t3;
		t3 = new Tiger();
		Apple app1=new Apple();  
		Apple app2=new Apple();
		Apple app3=new Apple();     
	}
	static void method01(){
		
	}
	static int method02(int v1, int v2){
		int v3 = v1 + v2;
		return v3;
	}
}
