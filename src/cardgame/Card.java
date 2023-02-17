package cardgame;

/**
 * Starter code for the Card class. To be used in Week 4.
 *
 * @author dancye, 2019
 * @modified AAKASH PRAJAPATI Feb 2023
 * @modified AAKASH PRAJAPATI 2023
 *4. one OO principle that allowed you to reuse your initial Card code and 
 * modify it to create an UNO deck COHESION - A class should only represent one logical entity.
 * 5.one principle of the code that will allow your Card class to be reused or 
 * in another application LOOSE COUPLING - It demonstrates the dependency.
 */
public class Card {

    public enum Suit {
        RED, BLUE,YELLOW,GREEN
    };

    public enum Value {
        ZERO, ONE ,TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, DRAWTWO, DRAWFOUR, WILDCARD, REVERSE
    };
    
    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
