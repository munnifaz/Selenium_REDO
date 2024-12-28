package week1.Day3;

public class Anagram {

	public static void main(String[] args) {
		String text1="munnijkik";
		String text2="hgujkiuhk";
		boolean Ischarmatch = false;
		
		if(text1.length()==text2.length()) {
			
			char[] charArray = text1.toCharArray();
			
			char[] charArray1 = text2.toCharArray();
			
			
			for(int i=0;i<=charArray.length-1;i++) {
				
				for(int j=0;j<=charArray1.length-1;j++) {
					
					
					if(charArray[i]==charArray1[j]) {
						
						Ischarmatch=true;				
					}				
					else { 
						
						Ischarmatch=false;
					}
				}						
			}		
		
	if(Ischarmatch) {
		System.out.println("Both Strings are Anagram");}
		
	
	else {
		System.out.println("Both Strings are not Anagram");
	}
	}

	else {
		System.out.println("Please provide the correct strings");
	}
	}
}


