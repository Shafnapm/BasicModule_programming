package companyproject;
import java.util.Scanner;
public class Vowels {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		       System.out.println("enter the  String :");
		       
		      String str= sc.next();
		 
		      int count=0;
		      for(int i=0;i<str.length();i++)
		      {
		      char ch = str.charAt(i);
		if((ch == 'A' || ch=='a') || (ch == 'E' || ch=='e') || ( ch == 'I' || ch=='i') || ( ch == 'O' || ch=='o' ) || (ch == 'U' || ch=='u'))
		{

		 count++;
		   for(int j=0;j<count;j++)
		    {

		        System.out.print("*");
		    }
		    System.out.print(ch);
		    for(int j=0;j<count;j++)
		     {
		        System.out.print("*");
		     }
		        } 
		      else
		      {

		      System.out.print(ch);
		      }
		}

		}

		}
	


