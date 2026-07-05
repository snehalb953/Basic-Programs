class month
{
   public static void main(String[] args)
    {
      String month= "feb";
       int yr=2024;
      switch(month)
       {
           case "jan":
           case "mar":
           case "may":
           case "jul":
           case "aug":
           case "oct":
           case "dec":System.out.println("31");
                    break;
           
           case "apr":
           case "jun":
           case "sep":
           case "nov":System.out.println("30");
                    break;
           case "feb":{if(yr%4==0 && yr%100!=0 || yr%400==0)
                              System.out.println("29 days");
                            else
                               System.out.println("28 days");
                          }

                    break;

           default:System.out.println("invalid");
       }
    }
}
