class swap
{
  public static void main(String[] args)
    {
      int a=10;
      int b=20;
System.out.println("before swapping"+a+" "+b);

        a=a+b;
        b=a-b;
        a=b-a;
        System.out.println("before swapping"+a+" "+b);
          System.out.println("After swapping"+a+" "+b);
    }
}