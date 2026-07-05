import java.util.Scanner;
class CountDigit
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     int sum=0;
     int count=0;
     do{
        int r=n%10;
        sum=sum+r;
         n=n/10;
       }while(n!=0);
       System.out.println(sum);
        

   }
}

