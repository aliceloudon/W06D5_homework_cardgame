package specs;
import cardgame.*;
import static org.junit.Assert.*; 
import org.junit.*;

public class PlayerTest {
  
  Player player;
  Card card;
 
  @Before 
  public void before() {
    player = new Player("Player 1");
    card = new Card(SuitType.DIAMONDS, ValueType.QUEEN); 
  }

  @Test
  public void hasName(){
    assertEquals("Player 1", player.getName());
  }

  @Test
  public void handStartsEmpty(){
    assertEquals(0, player.countCards());
  }

  @Test
  public void canAddCardToHand(){
    player.addCard(card);
    assertEquals(1, player.countCards());
  }

}
