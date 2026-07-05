import java.util.Scanner;
class MonthDays
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter month days");
     int days=sc.nextInt();

       if(days==1 || days==3 || days==5 || days==7 || days==8 || days==10 || days==12)
          System.out.println("31 days");

       else if(days==4 || days==6|| days==9 || days==11)
          System.out.println("30 days");

       else if(days==2)
         System.out.println("28/29 days");

       else
        System.out.println("invalid");

    }
}
