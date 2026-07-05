import java.util.Scanner;
class year
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number");
     int  yr=sc.nextInt();

     if(yr%4==0 && yr%100!=0 || yr%400==0)
      System.out.println("leap year");
     else
      System.out.println("not leap year");
  }
}






/*
class year
{
  public static void main(String[] args)
   {
    int yr=2013;
     if(yr%4==0 && yr%100!=0 || yr%400==0)
      System.out.println("leap year");
     else
      System.out.println("not leap year");
  }
}
*/