package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackjackGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Deck deck = new Deck();

    public static void main(String[] args) {
        System.out.println("Välkommen till Textbaserad Blackjack!");
        System.out.println("-------------------------------------");

        int playerBankroll = 1000;
        boolean playAgain = true; // FIXAT: Startar loopen korrekt

        while (playAgain && playerBankroll > 0) {
            playerBankroll = playRound(playerBankroll);

            if (playerBankroll > 0) {
                System.out.print("Vill du spela igen? (ja/nej) ");
                String playAgainChoice = scanner.next();
                if (!playAgainChoice.equalsIgnoreCase("ja")) {
                    playAgain = false;
                }
            } else {
                playAgain = false;
            }
        }

        System.out.println("Tack för att du spelade! Din bankrulle slutade på " + playerBankroll + " kr.");
        scanner.close();
    }

    private static int playRound(int playerBankroll) {
        deck.shuffle();

        int playerBet = getPlayerBet(playerBankroll);
        if (playerBet == 0) {
            return playerBankroll;
        }

        Hand playerHand = new Hand();
        Hand dealerHand = new Hand(); // FIXAT: Typo i variabelnamn
        dealInitialCards(playerHand, dealerHand);

        printInitialHands(playerHand, dealerHand);

        List<Hand> playerHands = new ArrayList<>();
        playerHands.add(playerHand);

        if (playerHand.getCards().get(0).getRank() == playerHand.getCards().get(1).getRank()) {
            playerBankroll = handleSplitChoice(playerHands, playerBet, playerBankroll);
        }

        for (int i = 0; i < playerHands.size(); i++) {
            playPlayerTurn(playerHands.get(i), i + 1);
        }

        playDealerTurn(dealerHand);

        System.out.println("\n---------------------------------");
        System.out.println("Spelet är slut! Vinnare utses...");

        for (int i = 0; i < playerHands.size(); i++) {
            playerBankroll = determineWinner(playerHands.get(i), dealerHand, playerBet, playerBankroll, i + 1);
        }

        System.out.println("\nDin nya bankrulle: " + playerBankroll + " kr.");
        return playerBankroll;
    }

    private static int getPlayerBet(int playerBankroll) {
        int playerBet;
        while (true) {
            System.out.println("Din bankrulle: " + playerBankroll + " kr.");
            System.out.print("Vänligen lägg din satsning: ");
            try {
                playerBet = scanner.nextInt();
                if (playerBet > playerBankroll || playerBet <= 0) {
                    System.out.println("Ogiltig satsning, vänligen satsa ett belopp mellan 1 och " + playerBankroll + ".");
                } else {
                    return playerBet;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ogiltig inmatning. Vänligen skriv en siffra.");
                scanner.next();
            }
        }
    }

    private static void dealInitialCards(Hand playerHand, Hand dealerHand) {
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
    }

    private static void printInitialHands(Hand playerHand, Hand dealerHand) {
        System.out.println("\nDealerns hand:");
        System.out.println(dealerHand.getHandString(false));
        System.out.println("Poäng: ??");

        System.out.println("\nDin hand:");
        System.out.println(playerHand.getHandString(true));
        System.out.println("Poäng: " + playerHand.getValue());
    }

    private static int handleSplitChoice(List<Hand> playerHands, int playerBet, int playerBankroll) {
        System.out.println("Du har ett par! Vill du splitta din hand? (ja/nej)");
        String splitChoice = scanner.next();

        if (splitChoice.equalsIgnoreCase("ja")) {
            if (playerBet * 2 > playerBankroll) {
                System.out.println("Du har inte tillräckligt med pengar för att splitta. Fortsätter med en hand.");
            } else {
                Hand playerHand2 = new Hand(); // FIXAT: Korrekt variabelnamn
                playerHand2.addCard(playerHands.get(0).removeCard());

                playerHands.get(0).addCard(deck.dealCard());
                playerHand2.addCard(deck.dealCard());

                playerHands.add(playerHand2);
                System.out.println("Du väljer att splitta. Din bankrulle minskar med " + playerBet + " kr.");
                playerBankroll -= playerBet;
            }
        }
        return playerBankroll;
    }

    private static void playPlayerTurn(Hand hand, int handNumber) {
        if (hand.getValue() == 21 && hand.getCards().size() == 2) {
            System.out.println("Blackjack! Din hand #" + handNumber + " har 21!");
            return;
        }

        System.out.println("Din hand #" + handNumber + ":");
        System.out.println(hand.getHandString(true));
        System.out.println("Poäng: " + hand.getValue());

        while (true) {
            System.out.print("Ditt val (dra/stanna): "); // FIXAT: Lade till en ')'
            String playerChoice = scanner.next();

            if (playerChoice.equalsIgnoreCase("dra")) {
                hand.addCard(deck.dealCard());
                System.out.println("\nDin hand #" + handNumber + ":");
                System.out.println(hand.getHandString(true));
                System.out.println("Poäng: " + hand.getValue());

                if (hand.getValue() > 21) {
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

    private static void playDealerTurn(Hand dealerHand) {
        System.out.println("\n-----------------------------------------");
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
            System.out.println("Dealern blev tjock! Hen har " + dealerHand.getValue() + " Poäng.");
        }
    }

    private static int determineWinner(Hand playerHand, Hand dealerHand, int playerBet, int playerBankroll, int handNumber) {
        System.out.println("\nHand #" + handNumber + ":");
        System.out.println("Din poäng: " + playerHand.getValue());
        System.out.println("Dealerns poäng: " + dealerHand.getValue());

        if (playerHand.getValue() > 21) {
            System.out.println("Du blev tjock! Du förlorar " + playerBet + " kr.");
            playerBankroll -= playerBet;
        } else if (dealerHand.getValue() > 21) {
            System.out.println("Dealern blev tjock! Du vinner " + playerBet + " kr!");
            playerBankroll += playerBet;
        } else if (playerHand.getValue() > dealerHand.getValue()) {
            if (playerHand.getValue() == 21 && playerHand.getCards().size() == 2) {
                System.out.println("Blackjack! Du vinner " + (playerBet * 1.5) + " kr!");
                playerBankroll += (playerBet * 1.5); // FIXAT: Adderar vinsten istället för att subtrahera
            } else {
                System.out.println("Du vinner " + playerBet + " kr!");
                playerBankroll += playerBet;
            }
        } else if (dealerHand.getValue() > playerHand.getValue()) {
            System.out.println("Dealern vinner. Du förlorar " + playerBet + " kr.");
            playerBankroll -= playerBet;
        } else {
            System.out.println("Oavgjort! Ingen vinner eller förlorar.");
        }
        return playerBankroll;
    }
}