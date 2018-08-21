import java.util.Scanner;
class star
{
public static void main(String[ ] args)
{
System.out.println("enter no. of rows");
Scanner S=new Scanner(System.in);
int a=S.nextInt();
for(int i=1;i<=a;i++)
{
  for(int j=1;j<=i;j++)
    {
      System.out.print("*");
    }
  System.out.println();
}
}
}
