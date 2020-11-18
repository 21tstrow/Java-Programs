import java.lang.Math;
public class Reverse2dArray
{

  public static int[][] revInt(int[][] initArray){
    int[][] newArray = new int[initArray.length][initArray[0].length];
    for (int r = initArray.length - 1; r >= 0; r--){
      for (int c = initArray[r].length - 1; c >= 0; c--){
        //System.out.println(r + " " + c + "\t" + (r - (initArray.length - 1)) + " " + (c - (initArray[r].length - 1)));
        newArray[Math.abs(r - (initArray.length - 1))][Math.abs(c - (initArray[r].length - 1))] = initArray[r][c];
      }
    }
    initArray = newArray;
    return initArray;
  }
  


}