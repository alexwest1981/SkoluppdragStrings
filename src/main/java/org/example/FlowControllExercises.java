package org.example;

import java.util.Scanner;
import java.util.Random;

public class FlowControllExercises {

    public static void main(String[] args) {

        // Skapa Scanner-objektet
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scanner startad...");
        System.out.println("---");

        // If-satser: Övning 1
        System.out.println("If-sats Övning 1");
        int number1 = 15;
        int number2 = 25;
        if (number1 > number2) {
            System.out.println("Det största talet är: " + number1);
        }
        if (number2 > number1) {
            System.out.println("Det största talet är: " + number2);
        }
        if (number1 == number2) {
            System.out.println("Talen är lika: " + number1);
        }

        System.out.println("---");

        // If-satser: Övning 2
        System.out.println("If-sats Övning 2");
        System.out.print("Ange ett heltal: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " är ett jämnt tal.");
        }
        if (number % 2 != 0) {
            System.out.println(number + " är ett udda tal.");
        }

        System.out.println("---");

        // If-satser: Övning 3
        System.out.println("If-sats Övning 3");
        System.out.print("Ange ett heltal för att kontrollera om det är positivt, negativt eller noll: ");
        long number3 = scanner.nextLong();

        if (number3 > 0) {
            System.out.println(number3 + " är ett positivt tal.");
        }

        if (number3 < 0) {
            System.out.println(number3 + " är ett negativt tal.");
        }

        if (number3 == 0) {
            System.out.println(number3 + " är noll.");
        }

        System.out.println("---");

        // If-satser: Övning 4
        System.out.println("If-sats Övning 4");
        System.out.print("Ange det första heltalet: ");
        int number4 = scanner.nextInt();

        System.out.print("Ange det andra heltalet: ");
        int number5 = scanner.nextInt();

        if (number4 == number5) {
            System.out.println("Talen är lika.");
        }

        if (number4 != number5) {
            System.out.println("Talen är inte lika.");
        }

        System.out.println("---");

        // If-satser: Övning 5
        System.out.println("If-sats Övning 5");
        System.out.print("Ange din ålder: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Du är myndig.");
        }

        if (age < 18) {
            System.out.println("Du är inte myndig.");
        }

        System.out.println("---");

        // If-else: Övning 1
        System.out.println("If-else Övning 1");
        System.out.print("Ange ett heltal för att se om det är positivt eller negativt: ");
        int number6 = scanner.nextInt();

        if (number6 >= 0) {
            System.out.println(number6 + " är ett positivt tal.");
        } else {
            System.out.println(number6 + " är ett negativt tal.");
        }

        System.out.println("---");

        // If-else: Övning 2
        System.out.println("If-else Övning 2");
        System.out.print("Ange det första heltalet: ");
        int number7 = scanner.nextInt();

        System.out.print("Ange det andra heltalet: ");
        int number8 = scanner.nextInt();

        if (number7 > number8) {
            System.out.println("Det största talet är: " + number7);
        } else if (number8 > number7) {
            System.out.println("Det största talet är: " + number8);
        } else {
            System.out.println("Talen är lika.");
        }

        System.out.println("---");

        // If-else: Övning 3
        System.out.println("If-else Övning 3");
        System.out.print("Ange ett heltal för att se om det är jämnt eller udda: ");
        int number9 = scanner.nextInt();

        if (number9 % 2 == 0) {
            System.out.println(number9 + " är ett jämnt tal.");
        } else {
            System.out.println(number9 + " är ett udda tal.");
        }

        System.out.println("---");

        // If-else: Övning 4
        System.out.println("If-else Övning 4");
        System.out.print("Ange ett heltal för att se om det är delbart med 5: ");
        int number10 = scanner.nextInt();

        if (number10 % 5 == 0) {
            System.out.println(number10 + " är delbart med 5.");
        } else {
            System.out.println(number10 + " är inte delbart med 5.");
        }

        System.out.println("---");

        // If-else: Övning 5
        System.out.println("If-else Övning 5");
        System.out.print("Ange det första talet: ");
        int number11 = scanner.nextInt();

        System.out.print("Ange det andra talet: ");
        int number12 = scanner.nextInt();

        if (number11 == number12) {
            System.out.println("Grattis!");
        } else {
            System.out.println("Försök igen.");
        }

        System.out.println("---");

        // While-loopar: Övning 1
        System.out.println("While-loopar Övning 1");
        System.out.println("Räknar med en while-loop:");

        int count = 1; // 1. En startpunkt
        while (count <= 10) { // 2. Villkor: Fortsätt så länge count är mindre än eller lika med 10
            System.out.println(count);
            count++; // 3. Uppdatering: Öka count med 1 i varje varv
        }

        System.out.println("---");

        // While-loopar: Övning 2
        System.out.println("While-loopar Övning 2");
        System.out.println("Beräknar summan av de första 100 naturliga talen...");

        int count2 = 1;
        int sum = 0;

        while (count2 <= 100) {
            sum += count2;
            count2++;
        }

        System.out.println("Summan av de första 100 naturliga talen är: " + sum);

        System.out.println("---");

        // While-loopar: Övning 3
        System.out.println("While-loopar Övning 3");
        System.out.println("Letar efter det minsta talet som är delbart med både 3 och 5...");

        int num = 1;
        while (true) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Det minsta talet som är delbart med både 3 och 5 är: " + num);
                break; // Avsluta loopen
            }
            num++;
        }

        System.out.println("---");

        // While-loopar: Övning 4
        System.out.println("While-loopar Övning 4");
        System.out.print("Ange hur många termer av Fibonacci-sekvensen du vill se: ");
        long n = scanner.nextLong();

        long firstTerm = 0;
        long secondTerm = 1;
        long count4 = 1;

        System.out.println("Fibonacci-sekvensen:");

        while (count4 <= n) {
            System.out.print(firstTerm + " ");

            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count4++;
        }
        System.out.println(); // Skriver ut en tom rad

        System.out.println("---");

        // Do-while-loopar: Övning 1
        System.out.println("Do-While-loopar Övning 1");
        System.out.println("Lösenordskontroll med en do-while-loop (pssst... det är hemligt):");

        String correctPassword = "hemligt";
        String passwordInput;

        do {
            System.out.print("Ange lösenord: ");
            passwordInput = scanner.next();
        } while (!passwordInput.equals(correctPassword));

        System.out.println("Lösenordet är korrekt! Välkommen.");

        System.out.println("---");

        // Do-while-loopar: Övning 2
        System.out.println("Do-While-loopar Övning 2");
        System.out.println("Tärningskast med do-while-loop:");

        Random random = new Random();
        String userInput;

        do {
            int dieRoll = random.nextInt(6) + 1;
            System.out.println("Du slog en " + dieRoll);

            System.out.print("Vill du kasta igen? (j/n): ");
            userInput = scanner.next();
        } while (userInput.equalsIgnoreCase("j"));

        System.out.println("Tack för att du spelade!");

        System.out.println("---");

        // For-loopar: Övning 1
        System.out.println("For-loopar Övning 1");
        System.out.println("Primtal upp till 100:");

        for (int num1 = 2; num1 <= 100; num1++) {
            boolean isPrime = true;

            for (int i = 2; i <= num1 / 2; i++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num1);
            }
        }

        System.out.println("---");

        // For-loopar: Övning 2
        System.out.println("For-loopar Övning 2");
        System.out.print("Ange vilket tal du vill se multiplikationstabellen för: ");
        long multiplicationNumber = scanner.nextLong();

        System.out.println("Multiplikationstabell för " + multiplicationNumber + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicationNumber + " x " + i + " = " + (multiplicationNumber * i));
        }

        System.out.println("---");

        // For-loopar: Övning 3
        System.out.println("For-loopar Övning 3");
        System.out.print("Ange ett heltal (n) för att beräkna summan av de första n talen: ");
        int n3 = scanner.nextInt();

        int sumForLoop = 0;

        for (int i = 1; i <= n3; i++) {
            sumForLoop += i;
        }

        System.out.println("Summan av de första " + n3 + " talen är: " + sumForLoop);

        System.out.println("---");

        // For-loopar: Övning 4
        System.out.println("For-loopar Övning 4");
        System.out.println("Skapar en stjärntriangel:");

        for (int row = 1; row <= 5; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // Stäng alla scanners
        scanner.close();
    }
}
