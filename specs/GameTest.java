package specs;
import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class GameTest {

  Game game;
  Player player;
  Card card;
  
  @Before 
  public void before(){
    game = new Game("Blackjack");
    player = new Player("Player 1");
    card = new Card(CardValue.QUEEN, CardSuit.DIAMONDS); 
  }

  @Test
  public void canGetName(){
    assertEquals("Blackjack", game.getName());
  }

  @Test
  public void playersCollectionStartsEmpty(){
    assertEquals(0, game.countPlayers());
  }

  @Test
  public void canAddPlayer(){
    game.addPlayer(player);
    assertEquals(1, game.countPlayers());
  }

  @Test
  public void deckStartsEmpty(){
    assertEquals(0, game.countCards());
  }

  @Test
  public void canAdd52CardsToDeck(){
    game.addCardsToDeck(card);
    System.out.println(game.countCards());
    System.out.println(game.getDeck());
    System.out.println(game.getRandomCard());
    assertEquals(52, game.countCards());
  }

  @Test
  public void canSeeCards(){
    game.addCardsToDeck(card);
    game.printDeck();
    assertEquals(52, game.countCards());
  }

}