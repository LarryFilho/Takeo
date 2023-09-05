public class Card 
{
   private final String face; // face of card ("Ace", "Deuce", ...)
   private final String suit; // suit of card ("Hearts", "Diamonds", ...)
   public final int value;

   // two-argument constructor initializes card's face and suit
   public Card(String face, String suit,int value)
   {
      this.face = face;
      this.suit = suit; 
      this.value = value;
   } 

   // return String representation of Card
   public String toString() 
   { 
      return face + " of " + suit ;
   } 
} // end class Card