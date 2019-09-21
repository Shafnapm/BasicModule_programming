package javacasestudy3;
import java.util.Scanner;
public class Email {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int i = 0;
		String n;
		String y;
		String name;
		String address;
		String number;
		String email;
		String pt;
		 String pid;
		do
		{
			i++;
		
		System.out.println("Registraion");
		System.out.println("\nEnter your name");
		 name=sc.nextLine();
		System.out.println("Enter your address");
		 address=sc.nextLine();
		System.out.println("Contact Number");
		  number=sc.nextLine();
		 sc.nextLine();
		 System.out.println("E-Mail ID");
		  email=sc.nextLine();
		 System.out.println("Enter proof type");
		  pt=sc.nextLine();
		 System.out.println("Enter proof ID");
		  pid=sc.nextLine();
		 System.out.println("Thank you for registering Your ID is:"+i);
		 System.out.println("Do you want continue?(y/n)");
		 n=sc.nextLine();
		} 
		while(n.equalsIgnoreCase("yes"));
		 System.out.println("Do you want to update the email id?(yes/no)");
		 y=sc.nextLine(); 
		 while(y.equalsIgnoreCase("yes"))
		 {
			System.out.println("Update Email:"); 
			System.out.println("Enter new Email id:"); 
			email=sc.nextLine();
			System.out.println("Email is updated successfully"); 
			System.out.println("Your details are follows"); 
			System.out.println("Name :"+name);
			System.out.println("Name :"+address);
			System.out.println("Name :"+email);
			System.out.println("Name :"+pt);
			System.out.println("Name :"+pid);
			break;
		 }
	}

}
