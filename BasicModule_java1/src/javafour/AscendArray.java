package javafour;

import java.util.Scanner;

public class AscendArray {
	public static void main(String[] args)
	{
		int temp;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=s.nextInt();
		
		int a[]=new int[(int) n];
		System.out.println("enter the marks of students:");
		for(int i=0;i<n;i++)
		{
		a[i]=s.nextInt();

		}
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(a[i]<a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}
		System.out.println("The marks in order are:");
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}

		}
}


