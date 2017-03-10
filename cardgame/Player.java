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

}