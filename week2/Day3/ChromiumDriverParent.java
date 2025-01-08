package week2.Day3;

public class ChromiumDriverParent extends Remotewebdriver {

	public  void launchBrowser() {
		
		System.out.println("its P class");
	
	}
	
	public static void main(String[] args) {
		
		ChromiumDriverParent cr=new ChromiumDriverParent();
		
		cr.findElement();
		cr.launchBrowser();
	}

}
