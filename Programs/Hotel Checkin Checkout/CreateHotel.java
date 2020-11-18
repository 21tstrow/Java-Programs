import java.lang.Math;
import java.util.ArrayList;
public class CreateHotel
{
  public static ArrayList<Room> create(){
  
    ArrayList<Room> rooms = new ArrayList<Room>();
    for (int i=0;i<200;i++){
      int choice = (int) (Math.random() * 5);
      if (choice == 1){
        rooms.add(new Room(1,1));
      }else if (choice == 2){
        rooms.add(new Room(2,1));
      }else if (choice == 3){
        rooms.add(new Room(4,2));
      }else if (choice == 4){
        rooms.add(new Suite(2,1,false,true,false));
      }else if (choice == 0){
        rooms.add(new Suite(6,2,true, false, true));
      }
    }
    return rooms;
  
  }
  
  
  
  
  
  
  
  
  
}