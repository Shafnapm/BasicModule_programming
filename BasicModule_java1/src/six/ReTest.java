package six;

import java.util.Scanner;

public class ReTest {
	public static void main(String [] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		int a[]=new int[(int) n];
		System.out.println("Enter the marks of students:");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(i=0;i<n;i++)
		{
		if(a[i]<=50)
		{
			count++;
			
		}
		}
		System.out.println("Number of students appearing for retest is"+count);
}
}
