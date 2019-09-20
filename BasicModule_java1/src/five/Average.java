package five;
import java.util.Scanner;
public class Average {
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		int sum=0;
		int avgmk;
		int a[]=new int[(int) n];
		System.out.println("Enter the marks of students:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avgmk=sum/n;
		System.out.println("The average mark is"+avgmk);
	}

}
