package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards;

    // En konstant för det dolda kortets utseende
    private static final String HIDDEN_CARD =
            "┌───────┐\n" +
                    "│ Dolt  │\n" +
                    "│ kort  │\n" +
                    "└───────┘";

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
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

    /*public String getHandString(boolean showAllCards) {
        // En temporär lista för de kort som ska visas
        List<String[]> cardLines = new ArrayList<>();

        if (!showAllCards) {
            // Lägg till linjerna för det dolda kortet
            cardLines.add(HIDDEN_CARD.split("\n"));
            // Lägg till linjerna för dealerns andra kort
            cardLines.add(cards.get(1).toString().split("\n"));
        } else {
            // Lägg till linjerna för alla kort på handen
            for (Card card : cards) {
                cardLines.add(card.toString().split("\n"));
            }
        }

        StringBuilder handString = new StringBuilder();
        int maxLines = 4; // Varje kort har 4 rader

        // Loopa för varje rad (från 0 till 3)
        for (int i = 0; i < maxLines; i++) {
            // Loopa för varje kort som ska visas
            for (String[] lines : cardLines) {
                handString.append(lines[i]).append(" ");
            }
            handString.append("\n");
        }
        return handString.toString();
    }*/

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