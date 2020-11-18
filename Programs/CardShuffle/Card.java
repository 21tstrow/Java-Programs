public class Card
{
  private String suit;
  private int value;
  public Card(int num, String suited){
    suit = suited;
    value = num;
  }
  
  public String toString(){
    if (value < 11){
      return value + " of " + suit;
    }
    else{
      return getFace(value) + " of " + suit;
    }
  }

  private static String getFace(int val){
    if (val == 11){
      return "Jack";
    }
    else if (val == 12){
      return "Queen";
    }
    else if (val == 13){
      return "King";
    }
    else{
      return "Ace";
    }
  }
  
}