package model;

public class Player {
    private final String name;
    private final Hand hand;

    public Player(String name) {
        super();
        this.name = name;
        hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void addCardToHand(PlayingCard pc){
        hand.addCard(pc);
    }

    public PlayingCard getCard(int index){
        return hand.getCard(index);
    }

    public PlayingCard removeCard(){
        return hand.removeCard();
    }

    @Override
    public String toString() {
        return name;
    }
}
