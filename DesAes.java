import java.util.Scanner;
class DesAes
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int  a=sc.nextInt();
     int  b=sc.nextInt();
     int  c=sc.nextInt();
        int max=(a>b && a>c)?a:(b>c)?b:c; 
        int min=(a<b && a<c)?a:(b<c)?b:c;
          int mid=(a+b+c)-(max+min);
     System.out.println("ascending order:"+a+" "+b+" "+c);
     System.out.println("Descending order:"+c+" "+b+" "+a);
   }
}