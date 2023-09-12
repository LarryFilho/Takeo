import java.util.Scanner;

public class Blackjack
{
   // execute application
	
	
	
   public static void main(String[] args)
   {
	   boolean resposta2 = true;
	   
	  Scanner input = new Scanner (System.in);
	   
	  int total = 0;
	   
      DeckOfCards myDeckOfCards = new DeckOfCards();
      //myDeckOfCards.shuffle(); // place Cards in random order
      
      // print all 52 Cards in the order in which they are dealt
      for (int i = 1; i <= 2; i++)
      {
         // deal and display a Card
         System.out.printf("%-19s", myDeckOfCards.dealCard());
         int carta = myDeckOfCards.retValue();
         if(carta == 11) {
        	 if(carta + total > 21) {
        		 total++;
        	 }else {
        		 total = 11 + total;
        	 }
         }else {
             total = carta + total;
         }

         
      } 
      
      System.out.printf("%n%d", total);
      
      if(total == 21) {
    	  System.out.printf("Blackjack!!!%n Voce ganhou");
      }
    
	      do {
		    if(total < 21) {
		    	System.out.printf("%nDeseja continuar? : ");
			    int resposta = input.nextInt();
			    resposta2 = Continua(resposta);
		          
		       	if(resposta2 == true) {
		       		System.out.printf("%-19s", myDeckOfCards.dealCard());
		            total = myDeckOfCards.retValue() + total;
		            System.out.printf("%d", total);
		       	  }
	    	  }
	      }while(total > 21 || resposta2 == true );
	      
	     System.out.printf("aqui");
	    if(total <=21) {
	    	System.out.printf("Voce ganhou");
	    }else {
	    	System.out.printf("Voce perdeu");
	    }
   }      
   
   
   static private boolean Continua(int resposta) {
	   if(resposta == 1) {
		   return true;
	   }
	   return false;
   }
   
} // end class DeckOfCardsTest
