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
import java.util.Random;
import java.util.ArrayList;

public class DeckOne{
    private ArrayList<CardClass> cards;

    public DeckOne(){
        cards = new ArrayList<CardClass>();

        for(int a =0; a<=3; a++){
            for(int b =0; b<=12;b++){
                cards.add(new CardClass(a,b));
            }
        }  
    }

    public CardClass drawRandomCard(){
        Random generator = new Random();
        int index = generator.nextInt(cards.size());
        return cards.remove(index);
    }

    public String reMainderCards(){
        String result = "Remaining cards in deck: " + cards;

        return result;

    }    
}
