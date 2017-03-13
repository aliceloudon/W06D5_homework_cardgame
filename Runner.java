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

    System.out.println("There are " + game.countPlayers() + " players in the game.");

    game.addCardsToDeck(card);
    System.out.println("There are " + game.countCards() + " cards in the deck.");

    System.out.println("Player 1 has been dealt the ");
    game.dealRandomCardToPlayer(player1);
    player1.printHand();

    System.out.println("Player 2 has been dealt the ");
    game.dealRandomCardToPlayer(player2);
    player2.printHand();

    System.out.println("There are now " + game.countCards() + " cards in the deck.");    

    player1.getValue();
    player2.getValue();

  }

}