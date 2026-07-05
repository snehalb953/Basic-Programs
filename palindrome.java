import java.util.Scanner;
class palindrome
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt(); 
      int rev=0,t=n;
         do{
             int digit=n%10;
               rev=rev*10+digit;
               n=n/10;
           }while(n!=0);

       if(rev==t)
          System.out.println("palindrome");
       else
          System.out.println(" Not palindrome");

   
     }
}

