package Basicjava;

import java.util.Scanner;

public class practise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//checkign the string ispalindrome or not
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("enter the string");
		
		String jag= sc.next();
		String rev="";
		
         for (int i=jag.length()-1; i>=0;i--) 
         {
        	 rev= rev+jag.charAt(i);
         }
         
		
		if(jag.equals(rev)) {
			
			System.out.print(jag+ " is a palindrome");
		}
		else 
		{
			System.out.print(jag+ " is not a palindrome");

		}
		
		
		
		
		
		
		
		
		
	}

}
