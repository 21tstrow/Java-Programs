import java.util.ArrayList;
public class Main
{
  public static void main(String[] args){
    /*
    Room test = new Room(2,2);
    int[] datesBooking = {1,2,3,4,5,6};
    
    int[] results = test.book("january", datesBooking);
    Interpreter.bookingResults(results);
    
    datesBooking[0] = 12;
    datesBooking[3] = 13;
    datesBooking[4] = 14;
    results = test.book("january", datesBooking);
    Interpreter.bookingResults(results);
    */
    
    Hotel test = new Hotel(CreateHotel.create());
    ArrayList<Room> test1 = test.getAvailability(4,1);
    ArrayList<Room> test2 = test.getAvailability(2,2);
    ArrayList<Room> test3 = test.getAvailability(4,2,true, false, true);
    ArrayList<Room> test4 = test.getAvailability(1,1);
    ArrayList<Room> test5 = test.getAvailability(2,1,false, true, false);
    
    
    System.out.println(getAvailCheck(test.getRooms()) + "\n");
    
    System.out.println(getAvailCheck(test1) + "\n");
    System.out.println(getAvailCheck(test2) + "\n");
    System.out.println(getAvailCheck(test3) + "\n");
    System.out.println(getAvailCheck(test4) + "\n");
    System.out.println(getAvailCheck(test5) + "\n");
    
  } 
  
  
  public static int getAvailCheck(ArrayList<Room> rooms){
    int count = 0;
    for (Room r : rooms){
      count += 1;
    }
    return count;
  }
  
  
  
}