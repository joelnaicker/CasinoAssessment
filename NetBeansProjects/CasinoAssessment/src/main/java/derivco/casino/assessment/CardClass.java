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
public class CardClass{
    private int type, value;
    private String[] Type = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] Value = {"Ace", "King", "Queen", "Jack", "10","9", "8", "7", "6", "5", "4", "3", "2"};

    public CardClass(int types, int values){
        type = types; 
        value = values;
    }

    public String toString(){
        String getCard = Value[value] + " of " + Type[type];

        return getCard;
    }
    
    public int toValue(){
    	int cardVal = 0;
    	
    	switch(Value[value]) {
    	case "Ace" : 
    		cardVal=10;
    		break;
    	case  "King" :
    		cardVal=10;
    		break;
    	case "Queen" : 
    		cardVal=10;
    		break;
    	case  "Jack" :
    		cardVal=10;
    		break;
    	default : 
    		cardVal = Integer.parseInt(Value[value]);
    	}
    	
        return cardVal;
    }

}