package seven;
import java.util.Scanner;
public class Factorial {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number alphabets in your name");
		int n=sc.nextInt();
		int i;
		int f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The number of combination is"+f);
	}

}
