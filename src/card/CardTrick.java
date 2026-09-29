/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner text = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(1, 14));
            c.setSuit(Card.SUITS[random.nextInt(0, 4)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("enter a value (1-13)");
        int val = num.nextInt();
        System.out.println("enter a suit (Hearts, Diamonds, Spades, Clubs)");
        String suit = text.nextLine();
        
        Card user = new Card();
        user.setValue(val);
        user.setSuit(suit);
        
        if(user.getSuit().equals("not") || user.getValue() == -1){
            System.out.println("non valid card entered try again");
        }
        else {
            boolean found = false;
            System.out.println("the contents of the magic hand are");
            for(Card c: magicHand){
                System.out.println(c);
                if(user.Equals(c))
                    found = true;
            }
            if(found)
                System.out.println("Your card is in the hand");
            else
                System.out.println("Your card is not in the hand");
        }
        
        // add one luckcard hard code 2,clubs
        
    }
    
}
