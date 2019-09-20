package countdigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigit {

public static void main(String[] args) throws NumberFormatException, IOException
{
int n,count=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number ");
n=Integer.parseInt(br.readLine());

while(n!=0)
{
if(n<20)
{
switch(n)
{
case 1:
case 2:
case 10:
case 6:count=count+3;break;

case 0:
case 4:
case 9:
case 5:count=count+4;break;
case 3:
case 7:
case 8:count=count+5;break;
case 11:
case 12:count=count+6;break;
case 15:
case 16:count=count+7;break;
case 13:
case 18:
case 19:count=count+8;break;
case 17:
case 14:count=count+9;break;
}
n=n/10;
}
if(n>=20 && n<=99)
{
int r=(n/10)*10;
System.out.println(r);
switch(r)
{
case 20:
case 30:
case 80:
case 90:
count=count+6;break;
case 40:
case 50:

case 60:count=count+5;break;
case 70:count=count+7;break;


}
n=n%10;


}
if(n>=100 && n<=999)
{
int r=(n/100)*100;
System.out.println(r);
count=count+7;

n=n%100;

}

}

System.out.println("count= "+count);

}

}

