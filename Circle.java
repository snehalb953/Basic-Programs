class Circle
{
  public static void main(String[] args)
    {
     double area1=calArea(2.5);
     double area2=calArea(2.4);
     double area3=calArea(2.6);
     
     double area=(area1+area2+area3)/3;
     System.out.println("Area of Circle "+area);


    }
   public static double calArea(double radius)
    {
   
       double area=3.14*radius*radius;
        return area;

     }
}

