import java.util.Scanner;
class leap
{
public static void main(String[ ] args)
{
System.out.println("enter year");
Scanner S=new Scanner(System.in);
int a=S.nextInt();
if(a%4==0&&a%100!=0)
{
System.out.println("leap year");
}
else if(a%400==0)
{
System.out.println("leap year");
}
else
System.out.println("not a leap year");
}
}