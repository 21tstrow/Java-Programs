import java.util.ArrayList;
public class Fib{
  private ArrayList<Integer> seq = new ArrayList<Integer>();
  
  public Fib(int numIt, int numStart){
    seq.add(0);
    seq.add(numStart);
    for (int i = 1; i < numIt; i++){
      seq.add(seq.get(seq.size() - 1) + seq.get(seq.size() - 2));
    }
  }
  
  public String toString(){
  String dfinal = "[";
  for (int i = 1; i < seq.size() - 1; i++){
    dfinal += seq.get(i) + ", ";
    }
  dfinal += seq.get(seq.size() - 1) + "]";
  return dfinal;
  }
}