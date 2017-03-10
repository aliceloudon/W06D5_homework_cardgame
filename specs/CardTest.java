package specs;
import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(SuitType.HEARTS, ValueType.JACK);
  }

  @Test
  public void canGetSuit(){
    assertEquals(SuitType.HEARTS, card.getSuit());
  }

  @Test
  public void canGetValue(){
    assertEquals(ValueType.JACK, card.getValue());
  }

}