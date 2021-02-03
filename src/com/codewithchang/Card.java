package com.codewithchang;

public class Card {

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.value = value;
        this.suit = suit;
    }
    // Allows to print value and suit
    public String toString() {
        return this.suit.toString() + "-" + this.value.toString();
    }

    // Get value
    public Value getValue() {
        return this.value;
    }
}
