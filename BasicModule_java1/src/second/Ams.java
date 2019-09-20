package second;
import java.util.Scanner;
public class Ams {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int t=num;
	int a=1;
	int b = 0;
	int rem;
	int count=0;
	while(num!=0)
	{
		count++;
		num=num/10;
	}
	num=t;
	while(num!=0)
	{
	  rem=num%10;
	  for(int i=0;i<count;i++)
	  {
		  a=a*rem;
		 
	  }
	  b=b+a;
	  a=1;
	  num=num/10;
	}
	if(t==b)
	{
		System.out.println("the given number is amstrong");
	}
	else
	{
		System.out.println("the given number is not amstrong");
	}
	
	}
}
