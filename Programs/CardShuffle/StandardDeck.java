import java.util.ArrayList;
import java.lang.Math;
class StandardDeck
{
  private static ArrayList<Card> cards = new ArrayList<Card>();
  private String suit = "";
  public StandardDeck(){
    for (int i = 0; i < 4; i++){
      if (i == 0)
        suit = "Hearts";
      else if (i == 1)
        suit = "Diamonds";
      else if (i == 2)
        suit = "Clubs";
      else
        suit = "Spades";  
    for (int c = 2; c < 15; c++){
       cards.add(new Card(c, suit));
      }
    }
  }
  
  public String toString(){
    String returnString = "";
    for (Card c : cards){
      returnString += c + "\n";
    }
    return returnString;
  }
  
  
  public void shuffle(){
    ArrayList<Card> tempss = new ArrayList<Card>();
    for (int i = 52; i > 0; i--){
      int randomInt =(int) (i * Math.random());
      tempss.add(cards.get(randomInt));
      cards.remove(randomInt);
    }
    for (Card c: tempss){
      cards.add(c);
    }
  }
  
}