package org.example;

import java.util.Collections;
import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        // Arrayövning 1
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Arrayövning 1: Summan av elementen i arrayen är: " + sum);

        System.out.println("---");

        // Arrayövning 2
        double[] decimals = {3.5, 7.2, 1.8, 9.1, 50.0};
        double sumOfDecimals = 0.0;

        for (double decimal : decimals) {
            sumOfDecimals += decimal;
        }

        double average = sumOfDecimals / decimals.length;

        System.out.println("Arrayövning 2: Medelvärdet av talen är: " + average);

        System.out.println("---");

        // Arrayövning 3
        String[] fruits = {"Banan", "Äpple", "Apelsin", "Mango", "Kiwi", "Citron", "Päron", "Ananas"};

        System.out.println("Arrayövning 3: Original: " + Arrays.toString(fruits));

        Arrays.sort(fruits);

        System.out.println("Arrayövning 3: Sorterad: " + Arrays.toString(fruits));

        System.out.println("---");

        // Arrayövning 4
        int[] numbers4 = {15, 7, 22, 9, 3, 45, 1, 38, 11, 29, 6, 50};

        int minNumber = numbers4[0];
        int maxNumber = numbers4[0];

        for (int i = 1; i < numbers4.length; i++) {
            if (numbers4[i] > maxNumber) {
                maxNumber = numbers4[i];
            }
            if (numbers4[i] < minNumber) {
                minNumber = numbers4[i];
            }
        }

        System.out.println("Arrayövning 4: Största talet är: " + maxNumber);
        System.out.println("Arrayövning 4: Minsta talet är: " + minNumber);

        System.out.println("---");

        // Arrayövning 5
        int[] numbers5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int oddCount = 0;

        for (int number : numbers5) {
            if (number % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("Arrayövning 5: Antalet udda tal är: " + oddCount);

        System.out.println("---");

        // Arrayövning 6
        int[] numbers6 = {1, 3, 5, 6, 8, 9, 11, 12, 15, 18, 20, 21, 22, 24, 25, 27, 28, 30, 31, 33};
        int sumDivisibleBy3 = 0;

        for (int number : numbers6) {
            if (number % 3 == 0) {
                sumDivisibleBy3 += number;
            }
        }

        System.out.println("Arrayövning 6: Summan av talen som är delbara med 3 är: " + sumDivisibleBy3);

        System.out.println("---");

        // Arrayövning 7
        String[] strings7 = {"Java", "Python", "C++", "C#", "JavaScript", "Swift"};
        String targetString = "Java";
        boolean found = false;

        for (String programmingLanguage : strings7) {
            if (programmingLanguage.equals(targetString)) {
                found = true;
                break; // Vi kan sluta söka när vi hittar den!
            }
        }

        if (found) {
            System.out.println("Arrayövning 7: Strängen '" + targetString + "' hittades i arrayen.");
        } else {
            System.out.println("Arrayövning 7: Strängen '" + targetString + "' hittades inte i arrayen.");
        }

        System.out.println("---");

        // Arrayövning 8
        int[] originalArray8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversedArray8 = new int[originalArray8.length];

        for (int i = 0; i < originalArray8.length; i++) {
            reversedArray8[originalArray8.length - 1 - i] = originalArray8[i];
        }

        System.out.println("Arrayövning 8: Ursprunglig array: " + Arrays.toString(originalArray8));
        System.out.println("Arrayövning 8: Omvänd array: " + Arrays.toString(reversedArray8));

        System.out.println("---");

        // Arrayövning 9
        int[] numbers9 = {20, 55, 10, 80, 45, 90, 30, 60, 100, 5, 75, 40, 15, 65, 95, 25, 35, 70, 85, 5, 12, 18, 48, 51, 62};
        double sumGreaterThan50 = 0;
        int countGreaterThan50 = 0;

        for (int number : numbers9) {
            if (number > 50) {
                sumGreaterThan50 += number;
                countGreaterThan50++;
            }
        }

        double average9 = 0;
        if (countGreaterThan50 > 0) {
            average9 = sumGreaterThan50 / countGreaterThan50;
        }

        System.out.println("Arrayövning 9: Medelvärdet av talen större än 50 är: " + average);

        System.out.println("---");

        // Arrayövning 10
        int[] numbers10 = {10, -5, 2, -1, 8, -3, 15, -7, 0, 12, -4, 9, 20, -2, 11, -6, 1, -8, 13, -9, 14, -10, 16, -11, 17, -12, 19, -13, 22, -14};
        long productOfNegatives = 1;

        for (int number : numbers10) {
            if (number < 0) {
                productOfNegatives *= number;
            }
        }

        System.out.println("Arrayövning 10: Produkten av de negativa talen är: " + productOfNegatives);

        System.out.println("---");

        // Arrayövning 11
        int[] numbers11 = {5, -2, 3, 0, 4, -1, 6};
        int productOfPositives = 1;

        for (int number : numbers11) {
            if (number > 0) {
                productOfPositives *= number;
            }
        }

        System.out.println("Arrayövning 11: Produkten av de positiva talen är: " + productOfPositives);

        System.out.println("---");

        // Arrayövning 12
        int[] array12a = {1, 2, 3, 4, 5};
        int[] array12b = {6, 7, 8, 9, 10};

        int[] mergedArray = new int[array12a.length + array12b.length];

        // Kopiera första arrayen till den nya
        for (int i = 0; i < array12a.length; i++) {
            mergedArray[i] = array12a[i];
        }

        // Kopiera andra arrayen till den nya
        for (int i = 0; i < array12b.length; i++) {
            mergedArray[array12a.length + i] = array12b[i];
        }

        System.out.println("Arrayövning 12: Första arrayen: " + Arrays.toString(array12a));
        System.out.println("Arrayövning 12: Andra arrayen: " + Arrays.toString(array12b));
        System.out.println("Arrayövning 12: Sammanslagen array: " + Arrays.toString(mergedArray));

        System.out.println("---");

        // Arrayövning 13
        int[] numbers13 = {15, 8, 2, 25, 10, 5, 30, 18, 7};

        int minIndex = 0;
        int maxIndex = 0;

        // Hitta index för det minsta och största talet
        for (int i = 1; i < numbers13.length; i++) {
            if (numbers13[i] < numbers13[minIndex]) {
                minIndex = i;
            }
            if (numbers13[i] > numbers13[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Arrayövning 13: Original: " + Arrays.toString(numbers13));

        // Byt plats på elementen med hjälp av en temporär variabel
        int temp = numbers13[minIndex];
        numbers13[minIndex] = numbers13[maxIndex];
        numbers13[maxIndex] = temp;

        System.out.println("Arrayövning 13: Efter byte: " + Arrays.toString(numbers13));

        System.out.println("---");

        // Arrayövning 14
        String[] strings14 = {"katt", "hund", "lejon", "tiger", "björn", "zebra", "apa", "häst"};

        System.out.println("Arrayövning 14:");
        for (String animal : strings14) {
            String reversed = new StringBuilder(animal).reverse().toString();
            System.out.println("Original: " + animal + ", Omvänd: " + reversed);
        }

        System.out.println("---");

        // Arrayövning 15
        int[] numbers15 = {5, 2, 8, 1, 9, 3, 7, 4, 6, 10};

        System.out.println("Arrayövning 15: Original: " + Arrays.toString(numbers15));
        Arrays.sort(numbers15);
        System.out.println("Arrayövning 15: Sorterad: " + Arrays.toString(numbers15));

        // Hitta de två mittersta talen
        int middleIndex1 = numbers15.length / 2 - 1;
        int middleIndex2 = numbers15.length / 2;

        // Räkna ut medelvärdet av de två mittersta talen
        double median = (double) (numbers15[middleIndex1] + numbers15[middleIndex2]) / 2;

        System.out.println("Arrayövning 15: Mediantalet är: " + median);

        System.out.println("---");

        // Arrayövning 16
        int[] numbers16 = {5, 12, 17, 8, 21, 15, 6, 23, 10, 19, 4, 30, 2, 13, 11};
        int sumOddAndGreaterThan10 = 0;

        for (int number : numbers16) {
            if (number > 10 && number % 2 != 0) {
                sumOddAndGreaterThan10 += number;
            }
        }

        System.out.println("Arrayövning 16: Summan av udda tal större än 10 är: " + sumOddAndGreaterThan10);

        System.out.println("---");

        // Arrayövning 17
        String[] strings17 = {"kort", "medium", "lång", "väldigt lång", "en", "superlång sträng", "kortare", "liten", "medel", "extralång", "längst", "enormt stor"};
        String longestString = strings17[0];

        for (String currentString : strings17) {
            if (currentString.length() > longestString.length()) {
                longestString = currentString;
            }
        }

        System.out.println("Arrayövning 17: Den längsta strängen är: '" + longestString + "'");

        System.out.println("---");

        System.out.println("---");

        // Arrayövning 18
        int[] numbers18 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int primeCount = 0;

        for (int number : numbers18) {
            if (isPrime(number)) {
                primeCount++;
            }
        }

        System.out.println("Arrayövning 18: Antalet primtal i arrayen är: " + primeCount);

        System.out.println("---");

        // Arrayövning 19
        int[] numbers19 = {5, 12, 17, 8, 21, 15, 6, 23, 10, 19, 4, 30, 2, 13, 11, 24, 9, 28, 7, 26, 1, 14, 29, 27, 25};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers19) {
            if (number > largest) {
                secondLargest = largest; // Det gamla största blir nu det näst största
                largest = number; // Det nya talet blir det största
            } else if (number > secondLargest && number < largest) {
                secondLargest = number; // Uppdatera bara det näst största
            }
        }

        int difference = largest - secondLargest;

        System.out.println("Arrayövning 19: Det största talet är " + largest + ".");
        System.out.println("Arrayövning 19: Det näst största talet är " + secondLargest + ".");
        System.out.println("Arrayövning 19: Skillnaden mellan dem är: " + difference);

        System.out.println("---");

        // Arrayövning 20
        int[] numbers20 = {15, 7, 30, 11, 45, 12, 5, 20, 60, 25, 9, 3, 10, 4, 18, 55, 33, 75, 2, 21, 50, 6, 22, 90, 1, 40, 48, 100, 120, 35};
        int sumDivisibleBy3And5 = 0;

        for (int number : numbers20) {
            if (number % 3 == 0 && number % 5 == 0) {
                sumDivisibleBy3And5 += number;
            }
        }

        System.out.println("Arrayövning 20: Summan av talen som är delbara med både 3 och 5 är: " + sumDivisibleBy3And5);

        System.out.println("---");

        // Arrayövning 21
        String[] strings21 = {"Apelsin", "Banan", "Äpple", "Ananas", "Avocado", "mango"};
        int countStartingWithA = 0;

        for (String fruit : strings21) {
            if (fruit.toLowerCase().startsWith("a")) {
                countStartingWithA++;
            }
        }

        System.out.println("Arrayövning 21: Antalet strängar som börjar med 'A' är: " + countStartingWithA);

        System.out.println("---");

        // Arrayövning 22
        int[] numbers22 = {-1, 5, -3, 8, -2, 10, -4, 0, 6, -7};
        long productOfNegatives22 = 1;

        for (int number : numbers22) {
            if (number < 0) {
                productOfNegatives22 *= number;
            }
        }

        System.out.println("Arrayövning 22: Produkten av de negativa talen är: " + productOfNegatives22);

        System.out.println("---");

        // Arrayövning 23
        String[] strings23 = {"Banan", "Äpple", "Apelsin", "Mango", "Kiwi", "Citron", "Päron", "Ananas"};

        System.out.println("Arrayövning 23: Original: " + Arrays.toString(strings23));

        Arrays.sort(strings23, Collections.reverseOrder());

        System.out.println("Arrayövning 23: Omvänt sorterad: " + Arrays.toString(strings23));

        System.out.println("---");

        // Arrayövning 24
        int[] numbers24 = {10, 30, 15, 5, 40, 22, 18, 50, 2, 28, 1, 23, 35, 17, 45};
        double sumLessThan25 = 0;
        int countLessThan25 = 0;

        for (int number : numbers24) {
            if (number < 25) {
                sumLessThan25 += number;
                countLessThan25++;
            }
        }

        double average24 = 0;
        if (countLessThan25 > 0) {
            average24 = sumLessThan25 / countLessThan25;
        }

        System.out.println("Arrayövning 24: Medelvärdet av tal mindre än 25 är: " + average24);

        System.out.println("---");

        // Arrayövning 25
        int[] numbers25 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        System.out.println("Arrayövning 25: Original: " + Arrays.toString(numbers25));

        for (int i = 0; i < numbers25.length - 1; i += 2) {
            // Använd en temporär variabel för att byta plats
            int temp25 = numbers25[i];
            numbers25[i] = numbers25[i + 1];
            numbers25[i + 1] = temp25;
        }

        System.out.println("Arrayövning 25: Efter byte: " + Arrays.toString(numbers25));

        System.out.println("---");

        // Arrayövning 26
        String[] strings26 = {"stor", "lång", "enorm", "liten", "väldigt kort", "normal", "micro"};
        String shortestString = strings26[0];

        for (String currentString : strings26) {
            if (currentString.length() < shortestString.length()) {
                shortestString = currentString;
            }
        }

        System.out.println("Arrayövning 26: Den kortaste strängen är: '" + shortestString + "'");

        System.out.println("---");

        // Arrayövning 27
        int[] numbers27 = {4, 8, 12, 1, 16, 20, 24, 5, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, 80, 84, 88};
        int sumDivisibleBy4 = 0;

        for (int number : numbers27) {
            if (number % 4 == 0) {
                sumDivisibleBy4 += number;
            }
        }

        System.out.println("Arrayövning 27: Summan av talen som är delbara med 4 är: " + sumDivisibleBy4);

        System.out.println("---");

        // Arrayövning 28
        String[] strings28 = {"Python", "C++", "Java-utveckling", "C#", "JavaScript", "programmera", "java", "Swift", "webbprogrammering", "Java_kod"};
        String targetWord = "Java";
        boolean containsWord = false;

        for (String programmingLanguage : strings28) {
            if (programmingLanguage.toLowerCase().contains(targetWord.toLowerCase())) {
                containsWord = true;
                break; // Sluta leta när vi hittar ordet
            }
        }

        if (containsWord) {
            System.out.println("Arrayövning 28: Åtminstone en sträng innehåller ordet '" + targetWord + "'.");
        } else {
            System.out.println("Arrayövning 28: Ingen sträng innehåller ordet '" + targetWord + "'.");
        }

        System.out.println("---");

        // Arrayövning 29
        int[] numbers29 = {1, 15, 9, 2, 20, 5, 10, 8, 3};
        long productLessThan10 = 1;

        for (int number : numbers29) {
            if (number < 10) {
                productLessThan10 *= number;
            }
        }

        System.out.println("Arrayövning 29: Produkten av talen mindre än 10 är: " + productLessThan10);

        System.out.println("---");

        // Arrayövning 30
        int[] numbers30 = {10, 35, 15, 5, 40, 22, 18, 50, 2, 28, 31, 23, 35, 17, 45, 1, 60, 20, 55, 29};
        double sumGreaterThan30 = 0;
        int countGreaterThan30 = 0;

        for (int number : numbers30) {
            if (number > 30) {
                sumGreaterThan30 += number;
                countGreaterThan30++;
            }
        }

        double average30 = 0;
        if (countGreaterThan30 > 0) {
            average30 = sumGreaterThan30 / countGreaterThan30;
        }

        System.out.println("Arrayövning 30: Medelvärdet av tal större än 30 är: " + average30);

        System.out.println("---");

        // Arrayövning 31
        String[] strings31 = {"hej", "på", "dig", "jag", "heter", "Gemini", "och", "är", "en", "AI"};
        int totalLength = 0;

        for (String word : strings31) {
            totalLength += word.length();
        }

        System.out.println("Arrayövning 31: Den totala längden av alla strängar är: " + totalLength);

        System.out.println("---");

        // Arrayövning 32
        int[] numbers32 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sumEvenIndices = 0;

        for (int i = 0; i < numbers32.length; i++) {
            if (i % 2 == 0) {
                sumEvenIndices += numbers32[i];
            }
        }

        System.out.println("Arrayövning 32: Summan av talen på jämna index är: " + sumEvenIndices);

        System.out.println("---");

        // Arrayövning 33
        String[] strings33 = {"Detta är ett test", "Testa på nytt", "Test", "Exempel", "Enkelt", "ett TEST", "Test_driven", "programmering", "testa", "Testa igen"};
        String targetWord33 = "test";
        int countWithTest = 0;

        for (String text : strings33) {
            if (text.toLowerCase().contains(targetWord33.toLowerCase())) {
                countWithTest++;
            }
        }

        System.out.println("Arrayövning 33: Antalet strängar som innehåller ordet '" + targetWord33 + "' är: " + countWithTest);

        // Arrayövning 34
        String[] strings34 = {"bil", "cykel", "lastbil", "tåg", "buss", "motorcykel", "flygplan", "båt", "moped", "traktor"};
        int countLongerThan5 = 0;

        for (String word : strings34) {
            if (word.length() > 5) {
                countLongerThan5++;
            }
        }

        System.out.println("Arrayövning 34: Antalet strängar med fler än 5 tecken är: " + countLongerThan5);

        System.out.println("---");

        // Arrayövning 35
        String[] strings35 = {"ett", "två", "tre", "fyra", "fem", "sex", "sju", "åtta", "nio", "tio"};
        int countEvenLength = 0;

        for (String word : strings35) {
            if (word.length() % 2 == 0) {
                countEvenLength++;
            }
        }

        System.out.println("Arrayövning 35: Antalet strängar med ett jämnt antal tecken är: " + countEvenLength);

        // Arrayövning 36
        int[] numbers36 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOddIndices = 0;

        for (int i = 0; i < numbers36.length; i++) {
            if (i % 2 != 0) { // Kontrollera om indexet är udda
                sumOddIndices += numbers36[i];
            }
        }

        System.out.println("Arrayövning 36: Summan av talen på udda index är: " + sumOddIndices);

        System.out.println("---");

        // Arrayövning 37
        int[] numbers37 = {10, -5, 2, -1, 8, -3, 15, -7, 0, -4};

        // Första pass: Räkna antalet negativa tal
        int negativeCount = 0;
        for (int number : numbers37) {
            if (number < 0) {
                negativeCount++;
            }
        }

        // Skapa den nya arrayen med exakt rätt storlek
        int[] negativeNumbers = new int[negativeCount];
        int negativeIndex = 0;

        // Andra pass: Kopiera över de negativa talen
        for (int number : numbers37) {
            if (number < 0) {
                negativeNumbers[negativeIndex] = number;
                negativeIndex++;
            }
        }

        System.out.println("Arrayövning 37: Ursprunglig array: " + Arrays.toString(numbers37));
        System.out.println("Arrayövning 37: Negativa tal: " + Arrays.toString(negativeNumbers));

        System.out.println("---");

        // Arrayövning 38
        String[] strings38 = {"ett", "två", "tre", "fyra", "fem", "sex", "sju", "åtta", "nio", "tio"};
        int countOddLength = 0;

        for (String word : strings38) {
            if (word.length() % 2 != 0) {
                countOddLength++;
            }
        }

        System.out.println("Arrayövning 38: Antalet strängar med ett udda antal tecken är: " + countOddLength);

        System.out.println("---");

        // Arrayövning 39
        int[] numbers39 = {45, 60, 110, 75, 50, 99, 105, 88, 30, 90};
        int sumBetween50And100 = 0;

        for (int number : numbers39) {
            if (number > 50 && number < 100) {
                sumBetween50And100 += number;
            }
        }

        System.out.println("Arrayövning 39: Summan av talen mellan 50 och 100 är: " + sumBetween50And100);

        System.out.println("---");

        // Arrayövning 40
        String[] strings40 = {"enkel", "svår", "Java", "programmering", "test", "exempel", "array", "hej", "program", "med"};
        int countWithE = 0;

        for (String word : strings40) {
            if (word.toLowerCase().contains("e")) {
                countWithE++;
            }
        }

        System.out.println("Arrayövning 40: Antalet strängar som innehåller bokstaven 'e' är: " + countWithE);

        System.out.println("---");

        // Arrayövning 41
        String[] strings41 = {"en", "två", "tre", "fyra", "fem", "sex", "sju", "åtta", "nio", "tio"};
        int totalLengthOfOddStrings = 0;

        for (String word : strings41) {
            if (word.length() % 2 != 0) {
                totalLengthOfOddStrings += word.length();
            }
        }

        System.out.println("Arrayövning 41: Den totala längden av strängar med udda antal tecken är: " + totalLengthOfOddStrings);

        System.out.println("---");

        // Arrayövning 42
        String[] strings42a = {"röd", "blå", "grön", "gul", "orange", "lila"};
        String[] strings42b = {"vit", "svart", "grå", "brun", "rosa", "turkos"};

        String[] mergedStrings = new String[strings42a.length + strings42b.length];

        // Kopiera första arrayen till den nya
        for (int i = 0; i < strings42a.length; i++) {
            mergedStrings[i] = strings42a[i];
        }

        // Kopiera andra arrayen till den nya
        for (int i = 0; i < strings42b.length; i++) {
            mergedStrings[strings42a.length + i] = strings42b[i];
        }

        System.out.println("Arrayövning 42: Sammanslagen array: " + Arrays.toString(mergedStrings));

        System.out.println("---");

        // Arrayövning 43
        int[] numbers43 = {1, 6, 12, 8, 4, 9, 2, 7, 11, 3, 5, 10, 8, 6};
        long product = 1;

        for (int number : numbers43) {
            if (number > 5 && number < 10) {
                product *= number;
            }
        }

        System.out.println("Arrayövning 43: Produkten av talen mellan 5 och 10 är: " + product);

        System.out.println("---");

        // Arrayövning 44
        String[] strings44 = {"programmering", "Java", "algoritm", "data", "system", "flyt", "rytm", "Python", "kod"};
        boolean allContainVowel = true;
        String vowels = "aeiouyåäö";

        for (String word : strings44) {
            boolean currentWordHasVowel = false;
            for (char vowel : vowels.toCharArray()) {
                if (word.toLowerCase().indexOf(vowel) != -1) {
                    currentWordHasVowel = true;
                    break;
                }
            }
            if (!currentWordHasVowel) {
                allContainVowel = false;
                break;
            }
        }

        if (allContainVowel) {
            System.out.println("Arrayövning 44: Ja, alla strängar innehåller minst en vokal.");
        } else {
            System.out.println("Arrayövning 44: Nej, minst en sträng saknar en vokal.");
        }

        System.out.println("---");

        // Arrayövning 45
        int[] numbers45 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sumOfPrimes = 0;

        for (int number : numbers45) {
            if (isPrime(number)) {
                sumOfPrimes += number;
            }
        }

        System.out.println("Arrayövning 45: Summan av primtalen i arrayen är: " + sumOfPrimes);

        System.out.println("---");

        // Arrayövning 46
        int[] numbers46 = {30, 55, 10, 60, 45, 75, 20, 50, 90, 48, 85};
        double sumGreaterThanOrEqual50 = 0;
        int countGreaterThanOrEqual50 = 0;

        for (int number : numbers46) {
            if (number >= 50) {
                sumGreaterThanOrEqual50 += number;
                countGreaterThanOrEqual50++;
            }
        }

        double average46 = 0;
        if (countGreaterThanOrEqual50 > 0) {
            average46 = sumGreaterThanOrEqual50 / countGreaterThanOrEqual50;
        }

        System.out.println("Arrayövning 46: Medelvärdet av tal större än eller lika med 50 är: " + average46);

        System.out.println("---");

        // Arrayövning 47
        int[] numbers47 = {10, 5, 12, 1, 8, 3, 15, 2, 18, 9, 20, 4, 13, 6, 17, 7, 16, 11};

        // Hitta index för de två största talen
        int max1Index = 0;
        int max2Index = 0;
        for (int i = 0; i < numbers47.length; i++) {
            if (numbers47[i] > numbers47[max1Index]) {
                max2Index = max1Index;
                max1Index = i;
            } else if (numbers47[i] > numbers47[max2Index] && i != max1Index) {
                max2Index = i;
            }
        }

        // Hitta index för de två minsta talen
        int min1Index = 0;
        int min2Index = 0;
        for (int i = 0; i < numbers47.length; i++) {
            if (numbers47[i] < numbers47[min1Index]) {
                min2Index = min1Index;
                min1Index = i;
            } else if (numbers47[i] < numbers47[min2Index] && i != min1Index) {
                min2Index = i;
            }
        }

        System.out.println("Arrayövning 47: Original: " + Arrays.toString(numbers47));

        // Utför de två bytena
        int temp1 = numbers47[max1Index];
        numbers47[max1Index] = numbers47[min1Index];
        numbers47[min1Index] = temp1;

        int temp2 = numbers47[max2Index];
        numbers47[max2Index] = numbers47[min2Index];
        numbers47[min2Index] = temp2;

        System.out.println("Arrayövning 47: Efter byte: " + Arrays.toString(numbers47));

        System.out.println("---");

        // Arrayövning 48
        int[] numbers48 = {-1, 5, -3, -8, 2, -11, 15, -7, 6, -9, 0, -13, 10, -17, 4, -15};
        int sumOddAndNegative = 0;

        for (int number : numbers48) {
            if (number % 2 != 0 && number < 0) {
                sumOddAndNegative += number;
            }
        }

        System.out.println("Arrayövning 48: Summan av de udda och negativa talen är: " + sumOddAndNegative);

        // Arrayövning 49
        int[] numbers49 = {1, 6, 12, 4, 18, 5, 24, 7, 30, 8, 36, 9, 42, 10, 48, 11, 54, 12, 60, 13, 66, 14, 72, 15};
        long product49 = 1;

        for (int number : numbers49) {
            if (number % 2 == 0 && number % 3 == 0) {
                product49 *= number;
            }
        }

        System.out.println("Arrayövning 49: Produkten av talen som är delbara med både 2 och 3 är: " + product49);

        System.out.println("---");

        // Arrayövning 50
        String[] strings50 = {"Java", "Hej", "programmering", "databas", "kod", "exempel", "rytm", "bil", "med", "funktion"};
        int countWithThreeVowels = 0;

        for (String word : strings50) {
            int vowelCount = countVowels(word);
            if (vowelCount == 3) {
                countWithThreeVowels++;
            }
        }

        System.out.println("Arrayövning 50: Antalet strängar med exakt tre vokaler är: " + countWithThreeVowels);
    }

    // Metoderna

    // Hjälpmetod för att kontrollera om ett tal är primtal
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hjälpmetod för att räkna vokaler i en sträng
    public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouyåäö";
        String lowerCaseString = s.toLowerCase();

        for (int i = 0; i < lowerCaseString.length(); i++) {
            char ch = lowerCaseString.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}