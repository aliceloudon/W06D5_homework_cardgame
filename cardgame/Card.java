package cardgame;

public class Card {

  private CardValue value;
  private CardSuit suit;

  public Card(CardValue value, CardSuit suit) { 
    this.value = value;
    this.suit = suit;
  }

  public CardValue getCardValue(){
    return this.value;
  }

  public CardSuit getCardSuit(){
    return this.suit;
  }

}