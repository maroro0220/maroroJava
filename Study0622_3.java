package senior;
class Apple{
	Apple(){}
	void show(){
		System.out.println("���");
	}
}
public class Study0622_3 {
	public static void main(String[] args) {
		new Apple().show();
		new Apple().show();
		Apple a = new Apple();
		a.show(); a.show();
		String s1 = new String("ABC");
		String s2 = "ABC";
		String s3 = "ABC";
		//���ڿ��� ������ ���ϰ� �ʹ�.
		//StringŬ������ equals()��� �޼���
		//==�� �ش� ���ڿ��ν��Ͻ��� �ּҸ� ��
		if("BCD".equals("ABC")){
			System.out.println("����.");
		}else{
			System.out.println("�ٸ���.");
		}
		if("ABC".equals(s3)){
			System.out.println("����.");
		}else{
			System.out.println("�ٸ���.");
		}
		if(s1.equals(s2)){
			System.out.println("����.");
		}else{
			System.out.println("�ٸ���.");
		}
		if(s1.equals("ABC")){
			System.out.println("OK");
		}else{
			System.out.println("NOK");
		}
	}
}






