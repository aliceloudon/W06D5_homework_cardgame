package cardgame;
import java.util.*;

public class Player {
  private String name;
  private ArrayList<Card> hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public void addCard(Card card) {
    hand.add(card);
  }

  public int countCards() {
    return hand.size();
  }

  public void printHand(){
    for (Card card : hand)
      System.out.println(card.getCardValue() + " of " + card.getCardSuit());
  }

  public void getValue(){
    for (Card card : hand)
      System.out.println(card.getCardValue().getCardValue());
  }

}