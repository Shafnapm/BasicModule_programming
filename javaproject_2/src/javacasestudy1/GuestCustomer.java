package javacasestudy1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GuestCustomer {
	
	public static void main(String[]args)throws IOException
	{
		int i=1;
	
		
		
	  String name;
	  String address;
	  String contact_number;
	  String email_update;
	  String proof_type;
	  String proof_id;
	  System.out.println("Registration");
	  System.out.println("Enter your name");
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=br.readLine();
		System.out.println("Enter your address");
		address=br.readLine();
		System.out.println("Enter your Contact Number");
		contact_number=br.readLine();
		System.out.println("Enter your email");
		email_update=br.readLine();
		System.out.println("Enter your Proof Type");
		proof_type=br.readLine();
		System.out.println("Enter your Proof ID");
		proof_id=br.readLine();
		System.out.println("Thank You for registering.Your id is"+i+"..");
		
	}

}
