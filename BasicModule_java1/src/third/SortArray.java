package third;
import java.util.Scanner;
public class SortArray 
{
	public static void main(String[] args)
	{
		float n,temp;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=s.nextFloat();
		float a[]=new float[(int) n];
		System.out.println("enter the height of the students:");
		for(int i=0;i<n;i++)
		{
		a[i]=s.nextFloat();

		}
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(a[i]>a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}
		System.out.println("The height in order are:");
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}

		}
}