/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivco.casino.assessment;

/**
 *
 * @author NaickeJ4
 */
import java.util.Scanner;

public class CardGameMain {
    public static void main(String[] args){

    	Scanner scan = new Scanner(System.in);
        CardClass C;
        DeckOne deck = new DeckOne();
        int playerTot=0;
        int dealerTot=0;

        System.out.println("******Game Start: Player vs Dealer ****** \n  ");
        char ch ='Y';
        
        while((ch=='Y') && (playerTot<=21)) {
            C = deck.drawRandomCard();

        	System.out.println("Player Recieved : " + C.toString());
        	playerTot += C.toValue();
        	System.out.println("Player Total : " + playerTot);
        
        	if(playerTot>21)
        	break;
        
        	System.out.println("Do you want to recieve another card? Y or any key to pass");
        	ch  = scan.next().toUpperCase().charAt(0);
        
        	if(ch!='Y')
        	break;        
          }
        
        if (playerTot > 21) {
        	System.out.println();
        	System.out.println("************ Player Score Greater than 21  ************");
        	System.out.println("************ Player looses and Dealer Wins ************");
        }
        else {        	
        		while(dealerTot<17) {
        			C = deck.drawRandomCard();
        			System.out.println("Dealer Recieved : " + C.toString());
        			dealerTot += C.toValue();
        			System.out.println("Dealer Total : " + dealerTot);
             
        			if(dealerTot>21)
        				break;
        			}
        	}
        
        if(dealerTot>21) {
        	System.out.println();
        	System.out.println("************ Dealer Score : " + dealerTot+" ***********");
        	System.out.println("************ Player Score : " + playerTot+" ***********");
        	System.out.println("************ Player wins and Dealer looses ************");
        }else if (dealerTot>playerTot) {
        	System.out.println();
        	System.out.println();
        	System.out.println("************ Dealer Score : " + dealerTot+" ***********");
        	System.out.println("************ Player Score : " + playerTot+" ***********");
        	System.out.println("************ Player looses and Dealer Wins ************");
        }else if (playerTot==dealerTot)  {
        	System.out.println();
        	System.out.println();
        	System.out.println("************ Dealer Score : " + dealerTot+" ***********");
        	System.out.println("************ Player Score : " + playerTot+" ***********");
        	System.out.println("************ No Winners - Tie ************");
        }	

    	System.out.println();
        System.out.println("************ GAME OVER !!! ************");
    }

}