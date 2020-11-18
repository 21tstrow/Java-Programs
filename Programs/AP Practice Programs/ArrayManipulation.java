import java.util.ArrayList;
public class ArrayManipulation {
  private static int[] nums = {3,5,6,3,6,8,7,3,2,1,2,6,4};
  
  public static void orderHighLow(){
  ArrayList<Integer> newNums = new ArrayList<Integer>();
  boolean found = false;
  
  for (int i=1; i < nums.length; i++){
    for (int c=0; c < newNums.size(); c++){
      if (nums[i] > newNums.get(c)){
        newNums.add(c, nums[i]);
        System.out.println(nums[i]);
        found = true;
      }
    }
    if (!found)
      newNums.add(nums[i]);
    found = false;
  }
  for (int i=0; i < newNums.size(); i++){
   System.out.print(newNums.get(i) + ", ");
  }
  System.out.print("ay");
  }
  
  
  public static void main(String[] str){
    orderHighLow();
  }
  
}