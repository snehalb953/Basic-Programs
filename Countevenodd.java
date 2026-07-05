import java.util.Scanner;
class Countevenodd
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt(); 
     int ec=0,oc=0;
     do{
        int r=n%10;
         if(r%2==0)
          ec++;
         else
          oc++;       
         n=n/10;
       }while(n!=0);
       System.out.println("sum of even"+ec);
       System.out.println("sum of odd"+oc);


   }
}

