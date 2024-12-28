package week1.Day3;

public class Oddindextouppercase {

	public static void main(String[] args) {
	
		
		String test="changeme";
		String newstring1 ="";
		
		char[] charArray = test.toCharArray();
		
		for(int i=0;i<=charArray.length-1;i++) {
			
		
			if((i+1)%2==1) {
				
				newstring1=newstring1+charArray[i];
				
			}
			else {
				
				char newstr=Character.toUpperCase(charArray[i]);
				newstring1=newstring1+newstr;
			}
			
			
		}

		System.out.println(newstring1);
	}

}
