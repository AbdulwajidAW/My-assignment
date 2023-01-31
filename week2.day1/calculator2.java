package week2.day1;

public class calculator2 {
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public void sub(int total,int b) {
		int c=total-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		calculator2 cal=new calculator2();
		int total = cal.add(10, 20)	;
		System.out.println(total);
		cal.sub(total, 15);
		
	}
}
