package week1.day2;

public class mobile {

	public void mobileSpecs() {
		String mobileBrandName="Blackberry";
		System.out.println("Mobile brand name	: "+mobileBrandName);
		
		char mobileLogo='B';
		System.out.println("Mobile Logo		: "+mobileLogo);
		
		short noOfMobilePiece= 1;
		System.out.println("no of mobile piece	: "+noOfMobilePiece);
		
		int modelNumber=10;
		System.out.println("Model Number		: "+modelNumber);
		
		long mobileImeiNumber=1862555895854689555l;
		System.out.println("Imei number		: "+mobileImeiNumber);
		
		float mobilePrice=90.85f;
		System.out.println("Mobile price in pounds	: "+mobilePrice);
		
		boolean isDamaged=false;
		System.out.println("Mobile is damaged	: "+isDamaged);
	}
	public static void main(String[] args) {
		mobile Blackberry=new mobile();
		Blackberry.mobileSpecs();
	}
}
