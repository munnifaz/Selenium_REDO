package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] array1= {1,4,3,2,8,6,7};

		Arrays.sort(array1);
			
		for(int i=0;i<=array1.length-1;i++) {
			
			if(array1[i]!=i+1) {
				
				System.out.println(i+1);
				break;
				
				
			}
			
			
			
		}
		

	}

}
