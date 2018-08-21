import java.util.Scanner;
class prime
{
public static void main(String[ ] args)
{
System.out.println("enter number:");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int flag=0;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
 flag=1;
 break;
}
}
if(flag==0)
{
System.out.println(n+ " " +"is prime.");
}
else
System.out.println(n+" "+"is not prime.");
}
}