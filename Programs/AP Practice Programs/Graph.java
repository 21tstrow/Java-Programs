import java.lang.Math;
public class Graph 
{
  private static int[][] coordinates;
  private static String output = "";
  
  public Graph(int numP){
    coordinates = new int[numP][2];
    for (int i = 0; i < numP; i++){
      coordinates[i][0] = i;
    }
  }
  /*
  public static void graphLine(String equation){
    test = false
    for (int i = 0; i < equation.length(); i++){
      if equation.charAt()
    }
  }
  */
  
  public static String graphTest(){
    output = "";
    int temp = 0;
    String[][] characters = new String[coordinates.length][40];
    for (int i = 0; i < coordinates.length; i++){
      coordinates[i][1] = coordinates[i][0] * 2;
      for (int c = 0; c < coordinates[i][1] + 20; c++){
        if (c == 20)
          characters[coordinates[i][0]][c] = "---";
        else
          characters[coordinates[i][0]][c] = "   ";
      }
      for (int c = coordinates[i][1] + 21; c < 40; c++){
        if (c == 20)
          characters[coordinates[i][0]][c] = "---";
        else
          characters[coordinates[i][0]][c] = "   ";
      }
      characters[coordinates[i][0]][coordinates[i][1] + 20] = " o ";
    }
    for (int row = 0; row < characters.length; row++){
      for (int col = 0; col < characters[0].length; col++){
        output += characters[row][col];
      }
      output += "\n";
    }
    return output;
  }
  
}