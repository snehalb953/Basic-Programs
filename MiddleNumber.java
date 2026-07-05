class MiddleNumber
{
  public static void main(String[] args)
    {
      int a=40;
      int b=20;
      int c=30;
        int max=(a>b && a>c)?a:(b>c)?b:c; 
        int min=(a<b && a<c)?a:(b<c)?b:c;
          int mid=(a+b+c)-(max+min);
         System.out.println(mid);
   }
}
     