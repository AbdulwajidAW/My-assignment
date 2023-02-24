package assignment.oops;

public class Automation extends MultipleLangauge{

	public void Selenium() {
		System.out.println("selenium");
	}

	public void java() {
		System.out.println("OOPS concept");
	}

	@Override
	public void ruby() {
		System.out.println("programming language");
	}
	
	public static void main(String[] args) {
		Automation code=new Automation();
		code.Selenium();
		code.java();
		code.ruby();
		code.python();
	}
	
}
