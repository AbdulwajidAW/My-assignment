package week1.day2;

public class twowheeler {
		
	public void superBikespecs() {
			String bikeName="TVS XL";
			System.out.println("Bike name	:"+bikeName);
			
			double runningKm=10445.22;
			System.out.println("Running KM	:"+runningKm);
			
			int noOfWheels=2;
			System.out.println("No of wheels	:"+noOfWheels);
			
			short noOfMirror=2;
			System.out.println("No of mirrors	:"+noOfMirror);
			
			long chassisNumber=5852554558545555l;
			System.out.println("Chassis number	:"+chassisNumber);
			
			boolean isPunchered=false;
			System.out.println("Tyre is puncherd:"+isPunchered);
	
		}
	public static void main(String[] args) {
		twowheeler TVSXL=new twowheeler();
		TVSXL.superBikespecs();
	}
}
