import java.util.ArrayList;
public class Room
{
  private int numPerson;
  private int numBath;
  private static int[][] dates;
  
  public Room(int numPers, int numBat){
    numPerson = numPers;
    numBath = numBat;
    dates = CreateDates.newDateRange();
  }
  public int getNumPerson(){
    return numPerson;
  }
  public int getNumBath(){
    return numBath;
  }

  public static int[] book(String mon, int[] days){
    int month = DateManipulation.getMonthFromStr(mon);
    
    int[] returnVal;
    ArrayList<Integer> datesFailed = new ArrayList<Integer>();
    
    for (int i = 0; i < days.length; i++){
      if (dates[month][days[i] - 1] == -1){
        datesFailed.add(days[i]);
      }
    }
    
    if (datesFailed.size() >= 1){
      returnVal = new int[datesFailed.size() + 1];
      returnVal[0] = -1;
      for (int i = 1; i <= datesFailed.size(); i++){
        returnVal[i] = datesFailed.get(i - 1);
      }
      return returnVal;
    }
    
    for (int i = 0; i < days.length; i++){
      dates[month][days[i] - 1] = -1;
    }
    
    
    returnVal = new int[1];
    returnVal[0] = 1;
    return returnVal;
    
  }
  
  
  
  
  //public void bookRoom(){}

}