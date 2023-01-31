package week2.day1;

public class calculator {
     
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("The value of c ="+c);
	}
	public void sub(int e,int f) {
		int g=e-f;
		System.out.println("The value of g ="+g);
	}
	public void multiply(double i,double j) {
		double k=i*j;
		System.out.println("The value of k ="+k);
	}
	public void div(float x,float y) {
		float z=x/y;
		
		System.out.println("The value of z ="+z);
	}
	
	
	
	public static void main(String[] args) {
		calculator cal=new calculator();
		cal.add(20, 30);
		cal.sub(25, 15);
		cal.multiply(100.250, 12.233);
		cal.div(15.5f, 2.5f);
	}
}
