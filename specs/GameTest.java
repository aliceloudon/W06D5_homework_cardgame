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
    assertEquals(52, game.countCards());
  }

  // @Test
  // public void canPrintDeckAsString(){
  //   game.addCardsToDeck(card);
  //   game.printString();
  //   assertEquals(52, game.countCards());
  // }

  // @Test
  // public void canGetRandomCard(){
  //   game.addCardsToDeck(card);
  //   game.getRandomCard();
  //   assertEquals(52, game.countCards());
  // }

  @Test
  public void canRemoveCardFromDeck(){
    game.addCardsToDeck(card);
    game.getRandomCardAndRemoveItFromDeck();
    assertEquals(51, game.countCards());
  }

  @Test
  public void canDealCardToPlayer(){
    game.addCardsToDeck(card);
    game.dealRandomCardToPlayer(player);
    assertEquals(1, player.countCards());
  }

}