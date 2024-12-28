package week1.Day3;

public class StringMethods {
	
	private static char[] charArray;

	public static void main (String args[]) {
		
		String data="Selenium";
		
		//tolowersace
		
		String lowercase=data.toLowerCase();
		System.out.println(lowercase);
		
		//touppercase
		
		String uc=data.toUpperCase();
		System.out.println(uc);
		
		//Replace
		
		String ai="Gen AI";
		String replace=ai.replace('e', 'E');
		System.out.println(replace);
		
		//Replace ALL
		
		String data1="Munnirunnisab@gmail.com";
		String RA=data1.replaceAll("[a-z]" , "@^");
		String RA1=data1.replaceAll("^[a-z]" , "@^"); //it will exclude the mentioned letters.
		System.out.println(RA);
		
		//Split
		
		String value= "welcome to testleaf";
		String[] splitvalues = value.split(" ");
		 
		for(int i=0; i<=splitvalues.length-1;i++) {
					
			System.out.println(splitvalues[i]);
		}
		
		
		//Reverse the string
		
		String value2="TestLeaf";
		char[] chararry= value2.toCharArray();
		System.out.println(chararry.length);
		
		for (int i=chararry.length-1;i>=0;i--) {
			
			
			System.out.print("The reverse string is :"+chararry[i]);
		}
			
		
		
		}
			
			
					
		
}
