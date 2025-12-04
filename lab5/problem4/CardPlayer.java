package lab5.problem4;

import java.util.ArrayList;

public class CardPlayer
{
   private ArrayList<Card> list;
   
   public CardPlayer()
   {
      list = new ArrayList<>();
   }

   public void getCard(Card card)
   {
      list.add(card);
   }
   
   public void showCards()
   {
      for (Card card : list)
         System.out.println(card);
   }
}
