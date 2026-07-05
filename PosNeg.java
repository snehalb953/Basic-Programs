import java.util.Scanner;
class PosNeg
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number");
     int  x=sc.nextInt();

     if(x>0)
      System.out.println("Positive Number");
     else
      System.out.println("Negative Number");
  }
}
