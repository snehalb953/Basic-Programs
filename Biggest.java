import java.util.Scanner;
class Biggest
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int big=isBiggest(a,b,c);
     System.out.println("Biggest among 3 numbers is:"+big);
    }
static int isBiggest(int a,int b,int c)
  {
    int biggest=a;
    if(b > biggest)
        biggest=b;
    if(c > biggest)
        biggest=c;
   return biggest;
   }
  
}
