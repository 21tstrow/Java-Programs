import java.util.Scanner;
public class SequenceThingy {
  private static int count = 1;
  private static int n;
  public static void main(String[] str){
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    System.out.println("Hi");
  
    while (n != 1){
      count++;
      if (n%2 == 0)
        n = n/2;
      else
        n = n*3 + 1;
    }
    System.out.print(count);
  }
}