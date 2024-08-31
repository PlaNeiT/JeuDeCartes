package model;

public enum Suit {
    DIAMONDS(1,"Diamonds"),
    HEARTS(2,"Hearts"),
    SPADES(3,"Spades"),
    CLUBS(4,"Clubs");

    private final int value;
    private final String name;

    Suit(int value, String name) {
        this.value = value;
        this.name = name;

    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
