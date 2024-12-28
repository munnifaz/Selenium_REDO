package week1.day2;

public class HA_Primenumber {

	public static void main(String[] args) {
		
		int input=89;
		int flag=0;
		
		for(int i=2;i<=input-1;i++) {
			
			if(input%i==0) {
				System.out.println("The number is not prime number");
				flag=1;
				break;				
			}
			
			
			}
				
		
			if(flag==0) {
				System.out.println("The number is prime number");
			}
		}
		
	}


