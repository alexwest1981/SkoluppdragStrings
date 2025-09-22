package org.example;

import java.util.Scanner;

public class BlackjackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till Textbaserad Blackjack!");
        System.out.println("-------------------------------------");

        // 1. Skapa och blanda kortleken
        Deck deck = new Deck();
        deck.shuffle();

        // 2. Skapa spelarens och dealerns händer
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();

        // 3. Dela ut de första två korten
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        // Visa händerna
        System.out.println("\nDealerns hand:");
        System.out.println(dealerHand.getHandString(false));
        System.out.println("Poäng: ??");

        System.out.println("\nDin hand:");
        System.out.println(playerHand.getHandString(true));
        System.out.println("Poäng: " + playerHand.getValue());

        // Spelarens tur
        System.out.println("\n------------------------------------");
        System.out.println("Din tur. Välj 'dra' eller 'stanna'.");

// Kolla för direkt Blackjack
        if (playerHand.getValue() == 21) {
            System.out.println("Blackjack! Du har 21!");
        } else {
            // Loop för spelarens tur
            while (true) {
                System.out.print("Ditt val: ");
                String playerChoice = scanner.next();

                if (playerChoice.equalsIgnoreCase("dra")) {
                    playerHand.addCard(deck.dealCard());
                    System.out.println("\nDin hand:");
                    System.out.println(playerHand.getHandString(true));
                    System.out.println("Poäng: " + playerHand.getValue());

                    if (playerHand.getValue() > 21) {
                        System.out.println("Du blev tjock (Bust)! Din poäng är över 21.");
                        break;
                    }

                } else if (playerChoice.equalsIgnoreCase("stanna")) { // Korrekt placering för 'stanna'
                    System.out.println("Du stannar.");
                    break;

                } else { // Korrekt placering för ogiltigt val
                    System.out.println("Ogiltigt val. Vänligen skriv 'dra' eller 'stanna'.");
                }
            }
        }

        // Dealerns tur
        if (playerHand.getValue() <= 21) {
            System.out.println("\n------------------------------------");
            System.out.println("Dealerns tur.");

            System.out.println("Dealerns hand:");
            System.out.println(dealerHand.getHandString(true));
            System.out.println("Poäng: " + dealerHand.getValue());

            while (dealerHand.getValue() <= 16) {
                System.out.println("Dealerns poäng är " + dealerHand.getValue() + ", drar ett kort...");
                dealerHand.addCard(deck.dealCard());

                System.out.println("\nDealerns hand:");
                System.out.println(dealerHand.getHandString(true));
                System.out.println("Poäng: " + dealerHand.getValue());
            }

            if (dealerHand.getValue() > 21) {
                System.out.println("Dealern blev tjock! Hen har " + dealerHand.getValue() + " poäng.");
            }
        }

        // Utsedd vinnare
        System.out.println("\n---------------------------------");
        System.out.println("Spelet är slut!");

        int playerValue = playerHand.getValue();
        int dealerValue = dealerHand.getValue();

        if (playerValue > 21) {
            System.out.println("Du blev tjock! Dealern vinner.");
        } else if (dealerValue > 21) {
            System.out.println("Dealern blev tjock! Du vinner!");
        } else if (playerValue > dealerValue) {
            System.out.println("Du har " + playerValue + " och dealern har " + dealerValue + ". Du vinner!");
        } else if (dealerValue > playerValue) {
            System.out.println("Du har " + playerValue + " och dealern har " + dealerValue + ". Dealern vinner.");
        } else {
            System.out.println("Du och dealern har samma poäng (" + playerValue + "). Oavgjort!");
        }
    }
}
