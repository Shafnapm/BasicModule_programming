package first;
import java.util.Scanner;
public class InputOutput {
	 public static void main(String[] args)
	    {
	    
	 Scanner scan=new Scanner(System.in);
     String name=scan.nextLine();
     int age=scan.nextInt();
     scan.nextLine();
     String degree=scan.nextLine();
     String branch=scan.nextLine();
     String contactnumber=scan.nextLine();
 
    	System.out.println("Name:" +name);
    	System.out.println("Age:" +age);
    	System.out.println("Degree:" +degree);
    	System.out.println("Branch:" +branch);
    	System.out.println("Contact Number:"+ contactnumber);
    	
}
}