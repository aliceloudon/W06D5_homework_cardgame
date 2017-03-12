package specs;
import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(CardValue.JACK, CardSuit.HEARTS);
  }

  @Test
  public void canGetSuit(){
    assertEquals(CardSuit.HEARTS, card.getCardSuit());
  }

  @Test
  public void canGetValue(){
    assertEquals(CardValue.JACK, card.getCardValue());
  }

}