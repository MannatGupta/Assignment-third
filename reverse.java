import java.util.Scanner;
class reverse
{
public static void main(String[ ] args)
{
System.out.println("enter number:");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int rev=0;
int temp=n;
while(n!=0)
{
int rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
System.out.println("Reverse of"+" " +temp +" "+"is" +" "+rev); 
}
}