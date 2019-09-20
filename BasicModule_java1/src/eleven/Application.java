package eleven;
import java.util.Scanner;
public class Application {
	public static void main(String[] args)
	{
		int i,temp,j = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of applications:");
		int n=sc.nextInt();	
		int a[]=new int[ n];
		System.out.println("Enter the amount:");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for( i=0;i<n;i++)
		{
			 if(max<a[i])
			 {
				max=a[i];
			 }
			
		}
		System.out.println("the winnig bid"+max);
	}

}
