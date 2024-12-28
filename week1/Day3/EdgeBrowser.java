package week1.Day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		
		Methods mthds =new Methods();
		
		String brwsername=mthds.launchBrowser("Edge");
		System.out.println(brwsername);
		mthds.loadUrl();
		
		
	}

}
