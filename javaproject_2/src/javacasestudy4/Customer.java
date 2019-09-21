package javacasestudy4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Customer {
	int i=0;
public static String name[]=new String[10];

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		String n;
		String y;
		//String name;
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
        name[i]=br.readLine();
        System.out.println("Enter your address");
		address=br.readLine();
		System.out.println("Contact Number");
		number=br.readLine();
		System.out.println("E-Mail ID");
		email=br.readLine();
		System.out.println("Enter proof type");
		pt=br.readLine();
		System.out.println("Enter proof ID");
		pid=br.readLine(); 
		System.out.println("Thank you for registering Your ID is:"+i);
		System.out.println("Do you want continue?(yes/no)");
		n=br.readLine();
		}
		while(n.equalsIgnoreCase("yes"));
		ViewCustomers(i);
		
	}	
	private static void ViewCustomers(int a) {
		
		System.out.println("Customer list");
		 System.out.println("The registered customers are");
		
		System.out.printf("Customer ID    Customer name");
		for(int j=1;j<=a;j++)
		{
	      System.out.println("\n"+j+"\t\t\t"+name[j]);
	     
	     }
		
	}

}
