package week1.day1;

public class mobile {
	public void unlockMobile() {
		System.out.println("Use fingerprint to unlock the mobile");
		
	}
	public void opencamera() {
		System.out.println("Open the camera and capture the pictures");
		
	}
	public void sendMessage() {
		System.out.println("Text the Message and Send it to friends");
		
	}
	public void shareimages() {
		System.out.println("open the whatsapp and share image to friends");
		
	}
	public void call() {
		
		System.out.println("go to contact and make a call");
	
	}
	public void updatephone() {
		System.out.println("update the phone to new version");
	
	}	
	public void greenline() {
		System.out.println("if your mobile is 1+ check weather green line is visible in display");
	
    }
	public static void main (String[] args) {
		mobile oneplus=new mobile();
		oneplus.unlockMobile();
		oneplus.opencamera();
		oneplus.sendMessage();
		oneplus.shareimages();
		oneplus.call();
		oneplus.updatephone();
		oneplus.greenline();
		
	}
}
