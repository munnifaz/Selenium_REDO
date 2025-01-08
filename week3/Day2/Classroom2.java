package week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Classroom2 {

	public static void main(String[] args) {
		
		String Name="Munnghjghu7t87vbhnfgvi";
		
		//char[] charArray = Name.toCharArray();
		
		Set<Character> unqval=new LinkedHashSet<Character>();
		
		for(int i=0;i<=Name.length()-1;i++)
		{
			
			unqval.add(Name.charAt(i));	
		}
		
	       for(Character ch : unqval)   
	            System.out.print(ch);   
	    }   
			
		}

	



