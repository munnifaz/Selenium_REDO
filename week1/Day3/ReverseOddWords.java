package week1.Day3;

public class ReverseOddWords {

	
	public static void main(String[] args) {
		
		
		  String test ="I am a software tester";
		  
		  String newstring1="";
		  
		  String reverseoddstr = "";
		  
		  String[] splitwords = test.split(" ");
		  
		  for (int i=0;i<=splitwords.length-1;i++) {
		  
			  	if((i+1)%2==1) {
		  
			  			newstring1+=" "+splitwords[i];
		  
			  			} 
			  	
			  	else
			  	
			  	{
			  
			  				char[] oddstr=  splitwords[i].toCharArray();
			
			  					for(int j=oddstr.length-1; j>=0;j--) {
				
			  							reverseoddstr=reverseoddstr+""+oddstr[j];
			  						}
			  					
			  					 newstring1=newstring1+" "+reverseoddstr;
			  			  
			  			}	
			  	
			  	
			  	
			  	reverseoddstr="";
			
		  		}
		  
		 
		 		
		  System.out.println(newstring1);
		  
	}
}
		 
		
	
	


