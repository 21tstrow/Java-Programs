public class CardGame
{
  public static void main(String[] args){
   //Card a = new Card(12, "Hearts");
   //System.out.println(a);
   StandardDeck deck = new StandardDeck();
   System.out.println(deck);
   deck.shuffle();
   System.out.println(deck);
  }

}