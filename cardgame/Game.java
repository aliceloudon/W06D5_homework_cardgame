package cardgame;
import java.util.*;

public class Game {
  private String name;
  private ArrayList<Player> players;
  private ArrayList<Card> deck;

  public Game(String name) {
    this.name = name;
    this.players = new ArrayList<Player>();
    this.deck = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public void addPlayer(Player player) {
    players.add(player);
    System.out.println("player added");
  }

  public int countPlayers() {
    return players.size();
  }

  public void addCard(Card card) {
    deck.add(card);
  }

  public void addCardsToDeck(Card card) {
    for (int i=0; i<13; i++) {
      CardValue value = CardValue.values()[i];
    for (int j=0; j<4; j++) {
      Card cardWithProperties = new Card(value, CardSuit.values()[j]);
    deck.add(cardWithProperties);
      }
    }
  }

  // Here (above) we are iterating through all of our CardValues and CardSuits in order to match them up with each other. (CardValue.values and CardSuit.values)

  public int countCards() {
    return deck.size();
  }

}















// public void shuffleCards() {
//   System.out.println("Shuffling cards!");
// }

// public void dealCards() {
//   System.out.println("Dealing cards!");
// }

// public ArrayList<Card> getDeck() {
//   return this.deck;
// }

// public Card getRandomCard() {
//   Collections.shuffle(this.deck);
//   return this.deck.get(0);
// }



// Iterator cardIterator = deck.iterator();
// while (cardIterator.hasNext()) {
//   Card randomCard = cardIterator.next();
//   System.out.println(randomCard.getValue() + " of " + randomCard.getSuit());
// }


// .ordinal --> Use for position the enum is in