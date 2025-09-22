package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card removeCard() {
        return cards.remove(cards.size() - 1);
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getValue() {
        int value = 0;
        int aceCount = 0;

        for (Card card : cards) {
            value += card.getValue();
            if (card.getRank() == Card.Rank.ACE) {
                aceCount++;
            }
        }

        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }
        return value;
    }

    public String getHandString(boolean showAllCards) {
        StringBuilder handString = new StringBuilder();

        if (!showAllCards) {
            handString.append("[DOLT KORT]");
            handString.append(" ");
            handString.append(cards.get(1).toString());
        } else {
            for (Card card : cards) {
                handString.append(card.toString());
                handString.append(" ");
            }
        }
        return handString.toString();
    }
}