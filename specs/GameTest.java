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
    card = new Card(SuitType.DIAMONDS, ValueType.QUEEN); 
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
  public void canAddPlayerToGame(){
    game.addPlayer(player);
    assertEquals(1, game.countPlayers());
  }

  @Test
  public void canAddCardToGame(){
    game.addCard(card);
    assertEquals(1, game.countCards());
  }

}