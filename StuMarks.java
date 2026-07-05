class StuMarks
{
   public static void main(String[] args)
     {
       int P=30;
       int C=50;
       int M=55;
       int B=60;
          if(P<35 || C<35 || M<35 || B<35)
               System.out.println("Fail");
          else
               System.out.println("Pass");
    }
}

/*

       OR


class StuMarks
{
   public static void main(String[] args)
     {
       int P=40;
       int C=50;
       int M=55;
       int B=60;
          if(P>=35 && C>=35 && M>=35 && B>=35)
               System.out.println("Pass");
          else
               System.out.println("Fail");
    }
}*/