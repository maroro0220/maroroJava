package senior;
class Apple{
	Apple(){}
	void show(){
		System.out.println("사과");
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
		//문자열의 내용을 비교하고 싶다.
		//String클래스의 equals()라는 메서드
		//==는 해당 문자열인스턴스의 주소를 비교
		if("BCD".equals("ABC")){
			System.out.println("같다.");
		}else{
			System.out.println("다르다.");
		}
		if("ABC".equals(s3)){
			System.out.println("같다.");
		}else{
			System.out.println("다르다.");
		}
		if(s1.equals(s2)){
			System.out.println("같다.");
		}else{
			System.out.println("다르다.");
		}
		if(s1.equals("ABC")){
			System.out.println("OK");
		}else{
			System.out.println("NOK");
		}
	}
}






