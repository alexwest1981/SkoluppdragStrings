package org.example;

import java.util.Scanner;

public class VariablerKonstanter {

    public static void main(String[] args) {

        // Test av lättare uppgift 1
        int number = 10;
        System.out.println("Lättare uppgift 1: Variabeln number har värdet: " + number);

        System.out.println("---");

        // Test av lättare uppgift 2
        double pi = 3.14;
        System.out.println("Lättare uppgift 2: Variabeln pi har värdet: " + pi);

        System.out.println("---");

        // Test av lättare uppgift 3
        String text = "Java är kul";
        System.out.println("Lättare uppgift 3: Variabeln text har värdet: " + text);

        System.out.println("---");

        // Test av lättare uppgift 4
        int number1 = 15;
        int number2 = 25;
        int sum = number1 + number2;
        System.out.println("Lättare uppgift 4: Summan av " + number1 + " och " + number2 + " är: " + sum);

        System.out.println("---");

        // Test av lättare uppgift 5
        final double GRAVITY = 9.81;
        double mass = 5.0;
        double force = mass * GRAVITY;
        System.out.println("Lättare uppgift 5: Kraften är: " + force + " Newton");

        System.out.println("---");

        // Test av lättare uppgift 6
        boolean isJavaFun = true;
        System.out.println("Lättare uppgift 6: Variabeln isJavaFun har värdet: " + isJavaFun);

        System.out.println("---");

        // Test av lättare uppgift 7
        char firstLetter = 'A';
        System.out.println("Lättare uppgift 7: Variabeln firstLetter har värdet: " + firstLetter);

        System.out.println("---");

        // Test av lättare uppgift 8
        String firstName = "Johan";
        String lastName = "Svensson";
        String fullName = firstName + " " + lastName;
        System.out.println("Lättare uppgift 8: Den fullständiga strängen är: " + fullName);

        System.out.println("---");

        // Test av lättare uppgift 9
        int count = 5;
        System.out.println("Lättare uppgift 9: Variabeln count har ursprungligt värde: " + count);
        count++; // Ökar värdet med 1
        System.out.println("Lättare uppgift 9: Variabeln count har nu värdet: " + count);

        System.out.println("---");

        // Test av lättare uppgift 10
        final String COMPANY_NAME = "Wigellkoncernen";
        System.out.println("Lättare uppgift 10: Företagsnamnet är: " + COMPANY_NAME);

        System.out.println("---");

        // Test av lättare uppgift 11
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lättare uppgift 11: Ange ett heltal: ");
        int userInput = scanner.nextInt();
        System.out.println("Lättare uppgift 11: Du angav: " + userInput);
        scanner.close();

        System.out.println("---");

        // Test av lättare uppgift 12
        double randomNumber = Math.random();
        System.out.println("Lättare uppgift 12: Det slumpmässiga värdet är: " + randomNumber);

        System.out.println("---");

        // Test av lättare uppgift 13
        final int HUNDRED = 100;
        int value = 500;
        double result = (double) value / HUNDRED;
        System.out.println("Lättare uppgift 13: Resultatet av divisionen är: " + result);

        System.out.println("---");

        // Test av lättare uppgift 14
        int numberToConvert = 42;
        String convertedString = String.valueOf(numberToConvert);
        System.out.println("Lättare uppgift 14: Den konverterade strängen är: " + convertedString);

        System.out.println("---");

        // Test av lättare uppgift 15
        int a = 10;
        int b = 20;
        boolean areEqual = (a == b);
        System.out.println("Lättare uppgift 15: Är a och b lika? " + areEqual);

        System.out.println("---");

        // Test av lättare uppgift 16
        char randomLetter = (char) ('a' + Math.random() * 26);
        System.out.println("Lättare uppgift 16: Det slumpmässiga tecknet är: " + randomLetter);

        System.out.println("---");

        // Test av lättare uppgift 17
        String name = "Karl";
        String greeting = "Hej, " + name + "!";
        System.out.println("Lättare uppgift 17: Strängen är: " + greeting);

        System.out.println("---");

        // Test av lättare uppgift 18
        int originalValue = 20;
        int newValue = originalValue - 5;
        System.out.println("Lättare uppgift 18: Det nya värdet är: " + newValue);

        System.out.println("---");

        // Test av lättare uppgift 19
        final double FACTOR = 3.0;
        int originalNumber = 7;
        double product = originalNumber * FACTOR;
        System.out.println("Lättare uppgift 19: Resultatet av multiplikationen är: " + product);

        System.out.println("---");

        // Test av lättare uppgift 20
        String word1 = "Hej";
        String word2 = new String("Hej");

        boolean usingEqualsMethod = word1.equals(word2);

        System.out.println("Lättare uppgift 20: Jämför '" + word1 + "' och '" + word2 + "'.");
        System.out.println("Lättare uppgift 20: Är strängarna lika? (med .equals()) " + usingEqualsMethod);

        System.out.println("---");

        // Test av lättare uppgift 21
        char originalChar = 'B';
        char newChar = originalChar;
        newChar = 'C';

        System.out.println("Lättare uppgift 21: Originalvärde: " + originalChar);
        System.out.println("Lättare uppgift 21: Nya värdet: " + newChar);

        System.out.println("---");

        // Test av lättare uppgift 22
        String originalCase = "JAVA ÄR KUL";
        String lowerCase = originalCase.toLowerCase();
        System.out.println("Lättare uppgift 22: Originalsträng: " + originalCase);
        System.out.println("Lättare uppgift 22: Sträng med gemener: " + lowerCase);

        System.out.println("---");

        // Test av lättare uppgift 23
        int numberForTask23 = 10;
        int doubledNumber = numberForTask23 * 2;
        System.out.println("Lättare uppgift 23: Det dubblade värdet är: " + doubledNumber);

        System.out.println("---");

        // Test av lättare uppgift 24
        final String LANGUAGE = "Java";
        String description = LANGUAGE + " är ett kraftfullt programmeringsspråk.";
        System.out.println("Lättare uppgift 24: Den nya strängen är: " + description);

        System.out.println("---");

        // Test av lättare uppgift 25
        int num1 = 10;
        int num2 = 15;
        int num3 = 20;
        boolean comparisonResult = (num1 < num2 && num2 < num3);
        System.out.println("Lättare uppgift 25: Är villkoret uppfyllt? " + comparisonResult);

        System.out.println("---");

        // Test av lättare uppgift 26
        char originalChar26 = 'a';
        char swappedChar26;

        if (Character.isLowerCase(originalChar26)) {
            swappedChar26 = Character.toUpperCase(originalChar26);
        } else {
            swappedChar26 = Character.toLowerCase(originalChar26);
        }

        System.out.println("Lättare uppgift 26: Originaltecken: " + originalChar26);
        System.out.println("Lättare uppgift 26: Skiftläge bytt: " + swappedChar26);

        System.out.println("---");

        // Test av lättare uppgift 27
        String part1 = "Hej";
        String part2 = "världen";
        String completeSentence = part1 + " " + part2;
        System.out.println("Lättare uppgift 27: Den nya strängen är: " + completeSentence);

        System.out.println("---");

        // Test av lättare uppgift 28
        int number28 = 10;
        int remainder28 = number28 % 3;
        System.out.println("Lättare uppgift 28: Resten av 10 / 3 är: " + remainder28);

        System.out.println("---");

        // Test av lättare uppgift 29
        final int NUMBER_TO_ADD = 7;
        int currentNumber = 13;
        int newNumber = currentNumber + NUMBER_TO_ADD;
        System.out.println("Lättare uppgift 29: Det nya värdet är: " + newNumber);

        System.out.println("---");

        // Test av lättare uppgift 30
        int x = 50;
        int y = 50;
        boolean areTheSame = (x == y);
        System.out.println("Lättare uppgift 30: Är x och y lika? " + areTheSame);
    }
}
