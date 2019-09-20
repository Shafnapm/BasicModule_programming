package ten;

import java.util.Scanner;

public class Cricket {
	public static void main(String [] args)
	{
		int i,run;
		float ball = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of blowers:");
		int n=sc.nextInt();	
		float a[]=new float[ n];
		System.out.println("Enter the runs conceded by the bowlers:");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[(int) n];
		System.out.println("Enter the number of balls for each bowler:");
		for( i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("the economy is: ");
		
		for(i=0;i<n;i++)
		{
		  run=b[i]/6;
			a[i]=a[i]/run;
			System.out.println(a[i]);
			
		}
		float sum=0;
		
		for(i=0;i<n;i++)
		{
		 sum=sum+a[i];
		}
		float avg=sum/n;
		System.out.println("The overall economy of the teanm is:");
		System.out.println(avg);
		int c=0;
		for(i=0;i<n;i++)
		{
		 if(a[i]<6)
		 {
			 c++;
		 }
		}
		System.out.println("The number of bowlers eligible are:");
		System.out.println(c);
		 }
}

