package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackjackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till Textbaserad Blackjack!");
        System.out.println("-------------------------------------");

        int playerBankroll = 1000;
        boolean playAgain = true;

        while (playAgain && playerBankroll > 0) {
            System.out.println("\nDin bankrulle: " + playerBankroll + " kr.");

            int playerBet = 0;
            // Spelarens satsning
            while (true) {
                System.out.print("Vänligen lägg din satsning: ");
                try {
                    playerBet = scanner.nextInt();
                    if (playerBet > playerBankroll || playerBet <= 0) {
                        System.out.println("Ogiltig satsning. Vänligen satsa ett belopp mellan 1 och " + playerBankroll + ".");
                    } else {
                        break;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Ogiltig inmatning. Vänligen skriv in en siffra.");
                    scanner.next(); // Rensar scannern för att undvika en oändlig loop
                }
            }

            // Skapa och blanda kortleken
            Deck deck = new Deck();
            deck.shuffle();

            // Skapa spelarens och dealerns händer
            Hand playerHand = new Hand();
            Hand dealerHand = new Hand();

            // Dela ut de första två korten
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

            // 6. Spelarens tur
            List<Hand> playerHands = new ArrayList<>();
            playerHands.add(playerHand); // Börja med en hand

            if (playerHand.getCards().get(0).getRank() == playerHand.getCards().get(1).getRank()) {
                System.out.println("Du har ett par! Vill du splitta din hand? (ja/nej)");
                String splitChoice = scanner.next();

                if (splitChoice.equalsIgnoreCase("ja")) {
                    if (playerBet * 2 > playerBankroll) {
                        System.out.println("Du har inte tillräckligt med pengar för att splitta. Fortsätter med en hand.");
                    } else {
                        // Skapa en ny hand och flytta över ett kort
                        Hand playerHand2 = new Hand();
                        playerHand2.addCard(playerHand.removeCard());

                        // Dela ut ett nytt kort till varje hand
                        playerHand.addCard(deck.dealCard());
                        playerHand2.addCard(deck.dealCard());

                        // Lägg till den nya handen i listan
                        playerHands.add(playerHand2);
                        System.out.println("Du väljer att splitta. Din bankrulle minskar med " + playerBet + " kr.");
                        playerBankroll -= playerBet;
                    }
                }
            }

            // Spela varje hand individuellt
            System.out.println("\n------------------------------------");
            for (int i = 0; i < playerHands.size(); i++) {
                Hand currentHand = playerHands.get(i);

                if (playerHands.size() > 1) {
                    System.out.println("Spelar hand #" + (i + 1) + ":");
                }

                // Kolla för direkt Blackjack
                if (currentHand.getValue() == 21 && currentHand.getCards().size() == 2) {
                    System.out.println("Blackjack! Din hand #" + (i + 1) + " har 21!");
                } else {
                    System.out.println("Din hand:");
                    System.out.println(currentHand.getHandString(true));
                    System.out.println("Poäng: " + currentHand.getValue());

                    // Loop för spelarens tur
                    while (true) {
                        System.out.print("Ditt val (dra/stanna): ");
                        String playerChoice = scanner.next();

                        if (playerChoice.equalsIgnoreCase("dra")) {
                            currentHand.addCard(deck.dealCard());
                            System.out.println("\nDin hand:");
                            System.out.println(currentHand.getHandString(true));
                            System.out.println("Poäng: " + currentHand.getValue());

                            if (currentHand.getValue() > 21) {
                                System.out.println("Du blev tjock (Bust)! Din poäng är över 21.");
                                break;
                            }
                        } else if (playerChoice.equalsIgnoreCase("stanna")) {
                            System.out.println("Du stannar.");
                            break;
                        } else {
                            System.out.println("Ogiltigt val. Vänligen skriv 'dra' eller 'stanna'.");
                        }
                    }
                }
            }

            // Dealerns tur
            System.out.println("\n------------------------------------");
            System.out.println("Dealerns tur.");

            System.out.println("Dealerns hand:");
            System.out.println(dealerHand.getHandString(true));
            System.out.println("Poäng: " + dealerHand.getValue());

            if (dealerHand.getValue() <= 16 && playerHand.getValue() <= 21) {
                while (dealerHand.getValue() <= 16) {
                    System.out.println("Dealerns poäng är " + dealerHand.getValue() + ", drar ett kort...");
                    dealerHand.addCard(deck.dealCard());

                    System.out.println("\nDealerns hand:");
                    System.out.println(dealerHand.getHandString(true));
                    System.out.println("Poäng: " + dealerHand.getValue());
                }
            }

            if (dealerHand.getValue() > 21) {
                System.out.println("Dealern blev tjock! Hen har " + dealerHand.getValue() + " poäng.");
            }

            // Utsedd vinnare för varje hand
            System.out.println("\n---------------------------------");
            System.out.println("Spelet är slut! Vinnare utses...");
            int dealerValue = dealerHand.getValue();

            for (int i = 0; i < playerHands.size(); i++) {
                Hand currentHand = playerHands.get(i);
                int playerValue = currentHand.getValue();

                System.out.println("\nHand #" + (i + 1) + ":");
                System.out.println("Din poäng: " + playerValue);
                System.out.println("Dealerns poäng: " + dealerValue);

                if (playerValue > 21) {
                    System.out.println("Du blev tjock! Du förlorar " + playerBet + " kr.");
                    playerBankroll -= playerBet;
                } else if (dealerValue > 21) {
                    System.out.println("Dealern blev tjock! Du vinner " + playerBet + " kr!");
                    playerBankroll += playerBet;
                } else if (playerValue > dealerValue) {
                    if (playerValue == 21 && currentHand.getCards().size() == 2) {
                        System.out.println("Blackjack! Du vinner " + (playerBet * 1.5) + " kr!");
                        playerBankroll += (playerBet * 1.5);
                    } else {
                        System.out.println("Du vinner " + playerBet + " kr!");
                        playerBankroll += playerBet;
                    }
                } else if (dealerValue > playerValue) {
                    System.out.println("Dealern vinner. Du förlorar " + playerBet + " kr.");
                    playerBankroll -= playerBet;
                } else {
                    System.out.println("Oavgjort! Ingen vinner eller förlorar.");
                }
            }

            System.out.println("\nDin nya bankrulle: " + playerBankroll + " kr.");
            if (playerBankroll <= 0) {
                System.out.println("Din bankrulle är tom. Spelet är över.");
            } else {
                System.out.print("Vill du spela igen? (ja/nej) ");
                String playAgainChoice = scanner.next();
                if (!playAgainChoice.equalsIgnoreCase("ja")) {
                    playAgain = false;
                }
            }
        }
    }
}