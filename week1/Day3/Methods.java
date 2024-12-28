package week1.Day3;

public class Methods {
	
	public String launchBrowser(String browserName) {
		System.out.print(browserName + " "+"Browser launched successfully");
		return browserName;
		
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	

	public static void main(String[] args) {
		Methods obj=new Methods();
		
		String browsername = obj.launchBrowser("\n"+"edge");
		System.out.println(browsername);
		
		
		obj.loadUrl();
		
		
		


	}

}
