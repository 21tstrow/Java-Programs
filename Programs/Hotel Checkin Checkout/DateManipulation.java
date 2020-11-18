public class DateManipulation{

  public static int getMonthFromStr(String month){
    if (month.equals("january"))
      return 0;
    else if (month.equals("february"))
      return 1;
    else if (month.equals("march"))
      return 2;
    else if (month.equals("april"))
      return 3;
    else if (month.equals("may"))
      return 4;
    else if (month.equals("june"))
      return 5;
    else if (month.equals("july"))
      return 6;
    else if (month.equals("august"))
      return 7;
    else if (month.equals("september"))
      return 8;
    else if (month.equals("october"))
      return 9;
    else if (month.equals("november"))
      return 10;
    else if (month.equals("december"))
      return 11;
    else
      return -1;
  }
  
  
  
}