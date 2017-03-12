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

  public ArrayList<Card> getDeck() {
    return this.deck;
  }

  public void printString(){
    for (Card card : deck)
      System.out.println(card.getCardValue() + " of " + card.getCardSuit());
  }

  public void getRandomCard() {
    Collections.shuffle(this.deck);
    Card randomCard = this.deck.get(0);
    System.out.println(randomCard.getCardValue() + " of " + randomCard.getCardSuit());
  }

  public void getRandomCardAndRemoveItFromDeck() {
    Collections.shuffle(this.deck);
    Card randomCard = this.deck.get(0);
    this.deck.remove(randomCard);
  }

  public void dealRandomCardToPlayer(Player player){
    Collections.shuffle(this.deck);
    Card randomCard = this.deck.get(0);
    this.deck.remove(randomCard);
    System.out.println(randomCard.getCardValue() + " of " + randomCard.getCardSuit());
    players.add(player);
    player.addCard(randomCard);
  }

// QUESTION: I am repeating myself here... but if I don't explixitly write out the method to get a random card, I no longer have the variable 'randomCard' to add to the player.

  public void determineWinner(){
    
  }

}



// public void shuffleCards() {
//   System.out.println("Shuffling cards!");
// }

// public void dealCards() {
//   System.out.println("Dealing cards!");
// }

// Iterator cardIterator = deck.iterator();
// while (cardIterator.hasNext()) {
//   Card randomCard = cardIterator.next();
//   System.out.println(randomCard.getValue() + " of " + randomCard.getSuit());
// }


// .ordinal --> Use for position the enum is in