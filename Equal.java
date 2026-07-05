import java.util.Scanner;
class Equal
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number");
     int  a=sc.nextInt();
     int  b=sc.nextInt();


     if(a==b)
      System.out.println("2 integers are equal");
     else
      System.out.println("2 integers are not equal");
  }
}
