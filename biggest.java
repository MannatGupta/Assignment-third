import java.util.Scanner;
class biggest
{
public static void main(String[ ] args)
{
System.out.println("enter three numbers:");
Scanner S=new Scanner(System.in);
int a=S.nextInt();
int b=S.nextInt();
int c=S.nextInt();
if(a>b && a>c)
{
System.out.println(a +" " +"is biggest among all numbers");
}
else if(b>a && b>c)
{
System.out.println(b +" " +"is biggest among all numbers");
}
else
System.out.println(c +" " +"is biggest among all numbers");
}
}