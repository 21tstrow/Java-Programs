public class Interpreter
{
  public static void bookingResults(int[] results){
    if (results.length == 1){
      System.out.println("Your booking was successful.\nEnjoy your stay!");
      return;
    }
    
    System.out.print("We're sorry, but the room is already booked for a portion of your requested stay.\nThe conflicting dates are: ");
    for (int i = 1; i < results.length - 1; i++){
      String ending = "th";
      if (results[i] == 1)
        ending = "st";
      if (results[i] == 2)
        ending = "nd";
      if (results[i] == 3)
        ending = "rd";
      System.out.print("the " + results[i] + ending + ", ");
    }
    if (results[results.length - 1] <= 3){
      String ending = "th";
      if (results[results.length - 1] == 1)
        ending = "st";
      if (results[results.length - 1] == 2)
        ending = "nd";
      if (results[results.length - 1] == 3)
        ending = "rd";
      System.out.print("and the " + results[results.length - 1] + ending + ".");
    }else{
      System.out.print("and the " + results[results.length - 1] + "th.");
      }
    
    
  }





}