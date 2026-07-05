import java.util.Scanner;
class NotPrime
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt(); 
     int pd=0;
     do{
        int r=n%10;
         if(r==2 || r==3 || r==5 ||r==7)
            pd++; 
         n=n/10;
       }while(n!=0);
     System.out.println("not prime digits in the number "+pd);
        }
}

