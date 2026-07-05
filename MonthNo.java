import java.util.Scanner;
class MonthNo
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter month number");
     int num=sc.nextInt();
       if(num>=1 && num<=12)
          System.out.println("valid");
       else
          System.out.println("invalid");
    }
}
