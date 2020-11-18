public class Runner{
  
  public static void main(String[] args){
    int[][] mat = {{3,4,5},{5,6,7}};
    printInt2d(mat);
    System.out.println();
    printInt2d(Reverse2dArray.revInt(mat));
    System.out.println();
    printInt2d(mat);
    
      
  }

  public static void printInt2d(int[][] array){
    for (int r = 0; r < array.length; r++){
      for (int c = 0; c < array[r].length; c++){
        System.out.print(array[r][c] + " ");
      }
      System.out.print('\n');
    }
  }
  
  
}