public class Blackjack
{
   // execute application
	
   public static void main(String[] args)
   {
	   
	  int total;
	   
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order
      
      // print all 52 Cards in the order in which they are dealt
      for (int i = 1; i <= 2; i++)
      {
         // deal and display a Card
         System.out.printf("%-19s", myDeckOfCards.dealCard());
         total = myDeckOfCards.retValue();
 
		 if (i % 4 == 0) // output a newline after every fourth card
		    System.out.println();
      } 
      
   } 
} // end class DeckOfCardsTest
