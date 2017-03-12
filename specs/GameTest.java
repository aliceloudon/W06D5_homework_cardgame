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
  public void deckHas52Cards(){
    Card card = game.getRandomCard().toString;
    System.out.println(card);
    assertEquals(52, game.countCards());
  }

}