import java.util.Scanner;
class armstrong
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt(); 
      int t=n;
      int sum=0;
      do{
          int r=n%10;
          n=n/10;
          sum=sum+r*r*r;

        }while(n!=0);
     if(sum==t)
      System.out.println("arm Strong");
     else
      System.out.println("not arm Strong");
    }
}
