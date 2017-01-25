package ginzberg.casino;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ryangross on 1/25/17.
 */
public abstract class CardGame extends Game {
    protected CardDeck cardDeck = new CardDeck();
    protected ArrayList<Card> userHand = new ArrayList<Card>();
    protected ArrayList<Card> dealerHand = new ArrayList<Card>();

    public CardGame(CardDeck aCardDeck, ArrayList<Card> aUserHand, ArrayList<Card> aDealerHand) {
        this.cardDeck = aCardDeck;
        this.userHand = aUserHand;
        this.dealerHand = aDealerHand;
    }

    public CardGame(CardDeck aCardDeck, ArrayList<Card> aUserHand) {
        this.cardDeck = aCardDeck;
        this.userHand = aUserHand;
    }

    // Setter & Shuffler
    public void initializeDeck() {
        this.cardDeck.shuffle();
    }

    // Getter
    public ArrayList<Card> getUserHand() {
        return this.userHand;
    }

    public void dealCard(ArrayList<Card> aHand) {
        aHand.add(this.cardDeck.getNextCard());
    }

    public double calculateScore() {
        return 0.0;
    }

    // Tentative. Does it need a Scanner?
    public String getUserChoice() {
        return "";
    }


}