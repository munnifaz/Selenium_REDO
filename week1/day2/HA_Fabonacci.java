package week1.day2;

public class HA_Fabonacci {

	public static void main(String[] args) {
		
		int input=43;
		int n1=0;
		int n2=1;
		
		System.out.println(n1+"\n"+n2);
		
		for(int i=2;i<=input-1;i++) {
			
			int n3=n1+n2;
			
			System.out.println(""+n3);
			
			n1=n2;
			n2=n3;
			
		}
	}

}
