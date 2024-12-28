package week1.Day3;

public class Remove_duplicates {

	public static void main(String[] args) {
		
		String text="We learn Java basics as part of java sessions in java week1";
		int count=0;
		 String newstring1="";
		
		String[] splitword = text.split(" ");
//		
//		splitword[10]="python";
//		
//		for (int i = 0; i < splitword.length; i++) {
//			
//			System.out.println(splitword[i]);
//		}
//		
		for(int i=0;i<=splitword.length-1;i++) {
			
			for(int j=i+1;j<=splitword.length-1;j++) {
				
				if(splitword[i].equals(splitword[j])) {
					
					splitword[j]="";
				 
					count++;
										
				}		
			} 
			
			newstring1=newstring1+""+splitword[i];
		}
		
		if(count>0) {
			
			System.out.println(newstring1);
				
				
			}
		};
	}
	

