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

  public int countCards() {
    return deck.size();
  }

  public void shuffleCards() {
    
    System.out.println("Shuffling cards!");
  }

  public void dealCards() {
    System.out.println("Dealing cards!");
  }

}



// .ordinal --> Use for position the enum is in