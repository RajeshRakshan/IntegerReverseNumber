import java.util.Scanner;

public class ReverseNumber
{
             public static void main(String[] args)
             {
 int b,count=0,c=0;
 System.out.println("Enter the value to be reverse       between -2147483648 to 2147483647");
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 System.out.println(a);
 b=a;
 while(b>0)
 {
 c=c*10+b%10;
 b=b/10;
 }

System.out.println(c);
             }
}