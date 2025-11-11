package Basicjava;

import org.openqa.selenium.interactions.Actions;
import java.util.Scanner;
public class Basic1 
{
	
public static void main(String[] args) 
  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string:");
		String s= sc.nextLine();
		
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			
			int count=0;
			
			for(int j=i-1;j>=0;j--) 
			{
				if(s.charAt(i)==s.charAt(j)) 
				{
					count++;
					break;
				}
			}
			
			if(count==0) 
			{
				System.out.print("the last non repeating character is:"+ s.charAt(i));
				break;
			}
		}
		
		
		

	}

}
