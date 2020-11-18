/*
import java.util.ArrayList;
import java.lang.Math;

public class Deck{
  private ArrayList<Card> cards = new ArrayList<Card>();
  private ArrayList<Card> tempCards = (new StandardDeck()).getCards();
  private ArrayList<Integer> randomNums = new ArrayList<Integer>();
  private int randomNum = 0;
  
  public Deck(){
    cards = (new StandardDeck()).getCards();
  }
  
  
  private static void shuffle(){
   int tempSize = tempCards.size();
    for (int i = 0; i < tempSize; i++){
     randomNums.add(i);
   }
   for (int i = 0; i < tempCards.size(); i++){
     boolean flag = false;
     while (!(flag)){
       flag = shuffleCardNum();
     }
     tempCards.set(randomNum, cards.get(i));
   }
  }
  
   private static boolean shuffleCardNum(){
     randomNum = (int) (Math.random * 52);
     for (Integer i: randomNums){
       if (i.equals(i))
         return true;
     }
     return false;
   }
   
  
  public String toString(){
    String returnString = "";
    for (Card c : cards){
      returnString += c + "\n";
    }
    return returnString;
  }
  
  
}
*/