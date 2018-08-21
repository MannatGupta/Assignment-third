import java.util.Scanner;
class palindrome
{
public static void main(String[ ] args)
{
System.out.println("enter number:");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int temp=n;
int rev=0;
while(n>0)
{
int rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
if(rev==temp)
{
System.out.println(temp+ "  " +"is Palindrome number");
}
else
System.out.println(temp+ " " +"is not Palindrome number");
}
}