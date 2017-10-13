package senior;

class Banana{
	static int total = 500;
	static void display(){
		System.out.println("static display");
	}
	Banana(int v){
		price = v;
	}
	int price;
	void show(){
		System.out.println(price);
	}
}
public class Study0620_3 {
	static void study2(){//문자열->String
		String s1 = new String("대한민국");
		String s2 = "우리나라";
		String s3 = new String("대한민국");
		String s4 = "우리나라";
		String s5 = new String("대한민국");
		String s6 = "우리나라";
		if(s1 == s3) System.out.println("OK");
		else System.out.println("NOK");
		if(s2 == s4) System.out.println("같다");
		else System.out.println("다르다");
		if(s4 == s6) System.out.println("같다");
		else System.out.println("다르다");
		System.out.println(s1);
		System.out.println(s2);
	}
	static void study1(){
		int v = Banana.total; Banana.total = 5000; 
		Banana.display();
		Banana b1 = new Banana(10);	b1.show();
		Banana b2 = new Banana(20);	
		b2.show();
		Banana b3 = new Banana(30);	b3.show();
	}
	public static void main(String[] args) {
		study2();
	}
}



