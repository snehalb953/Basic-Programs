import java.util.Scanner;
class BigSmall
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number");
     int  a=sc.nextInt();
     /*System.out.println("enter second  number");*/
     int b=sc.nextInt();
     /*System.out.println("enter third number");*/
     int  c=sc.nextInt();
     /*System.out.println("enter fourth number");*/
     int  d=sc.nextInt();

       int biggest=a;
       if(b>biggest)
          biggest=b;  
       if(c>biggest)
          biggest=c; 
       if(d>biggest)
          biggest=d;   
         System.out.println("biggest number:"+biggest);


       int smallest=a;

       if(b<smallest)
          smallest=b; 
       if(c<smallest)
          smallest=c; 
       if(d<smallest)
          smallest=d; 
         System.out.println("smallest number:"+smallest);   
                                                                                                                                                                                                    }
}
