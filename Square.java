class Square
{
  public static void main(String[] args)
    {
     double area1=calArea(2.5,2.4);
     double area2=calArea(2.4,2.3);
     double area3=calArea(2.6,2.7);
     
     double area=(area1+area2+area3)/3;
     System.out.println("Area of Square "+area);
    }
   public static double calArea(double length,double breadth)
    {
   
       double area=length*breadth;
        return area;

     }
}

