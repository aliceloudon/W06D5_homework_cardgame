import cardgame.*;

public class Runner {

  public static void main(String[] args) {
    Game game = new Game("Blackjack");
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    
    game.addPlayer(player1);
    game.addPlayer(player2);

    // player.addCard;

    game.shuffleCards();
    game.dealCards();


  }

}