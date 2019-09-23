package javacasestudy6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GuestCustomerBooking {
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		public static int[] booked=new int[25];
		public static void main(String[] args) throws IOException  {
			int roomId;
			for(int i=0;i<25;i++)
			{
			booked[i]=0;
			
			}
			
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
				 booking();
		}
			
private static void booking() throws IOException {

				String ac;
				String cot;
				String cable;
				String wifi;
				String laundry;
				int total=0;
				int flag=0;
				int roomno=0;
				System.out.println("\nBooking");
				System.out.println("Please choose the services required.");
				System.out.println("AC/non-AC(AC/nAC)");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				ac=br.readLine();
				System.out.println("Cot(Single/Double)");
				cot=br.readLine();
				System.out.println("With cable connection/without cable connection(C/nC)");
				cable=br.readLine();
				System.out.println("Wi-Fi needed or not(W/nW)");
				wifi=br.readLine();
				System.out.println("Laundry service needed or not(L/nL)");
				laundry=br.readLine();

				if(ac.equalsIgnoreCase("AC"))
				total=total+500;
				else if(ac.equalsIgnoreCase("nAC"))
				total=total+250;
				else
				ac="NULL";

				if(cot.equalsIgnoreCase("Single"))
				total=total+200;
				else if(cot.equalsIgnoreCase("Double"))
				total=total+450;
				else
				cot="NULL";

				if(cable.equalsIgnoreCase("C"))
				total=total+400;
				else if(cable.equalsIgnoreCase("nC"))
				total=total+350;
				else
				cable="NULL";

				if(wifi.equalsIgnoreCase("W"))
				total=total+400;
				else if(wifi.equalsIgnoreCase("nW"))
				total=total+350;
				else
				wifi="NULL";

				if(laundry.equalsIgnoreCase("L"))
				total=total+400;
				else if(laundry.equalsIgnoreCase("nL"))
				total=total+350;
				else
				laundry="NULL";
				
				System.out.println("The Total charge is "+total);
				System.out.println("The services chosen are");
				System.out.println(ac);
				System.out.println(cot);
				System.out.println(cable);
				System.out.println(wifi);
				System.out.println(laundry);
				System.out.println("Do you want to proceed?(yes/no)");
				String proceed=br.readLine();
				if(total>0 &&(proceed.equalsIgnoreCase("yes")))
				{
				for(int i=0;i<25;i++)
				{
				if(booked[i]==0)
				{
				booked[i]=total;
				roomno=i+1;
				flag=1;
				break;
				
				}
				}
				if(flag==1)
				System.out.println("Thank you for booking. Your room number is "+roomno+ ".");
				}
		}
}
