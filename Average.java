import java.util.Scanner;
class Average
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt(); 
     int sum=0,count=0;
     do{
        int r=n%10;
         sum=sum+r;
         count++;     
         n=n/10;
       }while(n!=0);
     System.out.println("sum of digits"+sum);
     System.out.println("count of digits"+count);
     System.out.println("Average of digits"+sum/count);
   }
}

