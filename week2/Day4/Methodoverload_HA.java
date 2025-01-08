package week2.Day4;

public class Methodoverload_HA {
	
	public String sendRequest(String endpoint) {
		return endpoint;
		
	}
	
	public String sendRequest(String endpoint, String requestBody, String requestStatus) {
		return endpoint+" "+requestBody+" "+requestStatus ;
	}

	public static void main(String[] args) {
		
		Methodoverload_HA MOobj= new Methodoverload_HA();
		
		String sendRequest = MOobj.sendRequest("https://www.google.com");
		
		System.out.println(sendRequest);
		
		String sendRequest2 = MOobj.sendRequest("https://www.google.com", "munni","poip");
		
		System.out.println(sendRequest2);
		

	}
	

}
