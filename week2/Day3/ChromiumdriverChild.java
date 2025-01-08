package week2.Day3;

public class ChromiumdriverChild extends ChromiumDriverParent {

	public  void launchBrowserChild() {
		
		System.out.println("its C class");
	
	}
	
	public static void main(String[] args) {
		
		ChromiumdriverChild crchild=new ChromiumdriverChild();
		
		crchild.findElement();
		crchild.launchBrowser();
		crchild.launchBrowserChild();
	}

}
