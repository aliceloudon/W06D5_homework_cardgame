import cardgame.*;

public class Runner {

  public static void main(String[] args) {
    Game game = new Game("Highest Card Wins");
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    Card card = new Card(CardValue.QUEEN, CardSuit.DIAMONDS); 
    
    game.addPlayer(player1);
    System.out.println("Added Player 1");

    game.addPlayer(player2);
    System.out.println("Added Player 2");

    System.out.println("There are currently " + game.countPlayers() + " players in this game.");

    game.addCardsToDeck(card);
    System.out.println("There are currently " + game.countCards() + " cards in the deck.");

    

  }

}