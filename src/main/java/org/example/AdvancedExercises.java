package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdvancedExercises {

    public static void main(String[] args) {
        // Test av avancerad uppgift 1
        String originalSentence = "Detta är en testmening.";
        String reversedWordsSentence = reverseWordsInPlace(originalSentence);
        System.out.println("Avancerad uppgift 1: Ursprunglig mening: '" + originalSentence + "'");
        System.out.println("Avancerad uppgift 1: Meningen med omvända ord: '" + reversedWordsSentence + "'");

        System.out.println("---");

        // Test av avancerad uppgift 2
        String originalText2 = "Java programmering är kul";
        String rotatedText2 = rotateWordsRight(originalText2);
        System.out.println("Avancerad uppgift 2: Ursprunglig text: '" + originalText2 + "'");
        System.out.println("Avancerad uppgift 2: Roterad text: '" + rotatedText2 + "'");

        System.out.println("---");

        // Test av avancerad uppgift 3
        String originalText3 = "Java programmering är kul";
        String rotatedText3 = rotateWordsLeft(originalText3);
        System.out.println("Avancerad uppgift 3: Ursprunglig text: '" + originalText3 + "'");
        System.out.println("Avancerad uppgift 3: Roterad text: '" + rotatedText3 + "'");

        System.out.println("---");

        // Test av avancerad uppgift 4
        String originalText4 = "programmering";
        String alternatingCaseText = alternateCase(originalText4);
        System.out.println("Avancerad uppgift 4: Ursprunglig text: '" + originalText4 + "'");
        System.out.println("Avancerad uppgift 4: Text med växelvis storlek: '" + alternatingCaseText + "'");

        System.out.println("---");

        // Test av avancerad uppgift 5
        String originalText5 = "Java är ett programmeringsspråk";
        String sortedByLengthDescText = sortWordsByLengthDescending(originalText5);
        System.out.println("Avancerad uppgift 5: Ursprunglig text: '" + originalText5 + "'");
        System.out.println("Avancerad uppgift 5: Sorterad text (fallande): '" + sortedByLengthDescText + "'");

        System.out.println("---");

        // Test av avancerad uppgift 6
        String originalText6 = "programmering är kul i Java";
        String sortedByVowelsText = sortWordsByVowelCount(originalText6);
        System.out.println("Avancerad uppgift 6: Ursprunglig text: '" + originalText6 + "'");
        System.out.println("Avancerad uppgift 6: Text sorterad efter vokaler: '" + sortedByVowelsText + "'");

        System.out.println("---");

        // Test av avancerad uppgift 7
        String originalText7 = "abc xyz";
        String shiftedText = replaceWithNextAsciiChar(originalText7);
        System.out.println("Avancerad uppgift 7: Ursprunglig text: '" + originalText7 + "'");
        System.out.println("Avancerad uppgift 7: Text med skiftade tecken: '" + shiftedText + "'");

        System.out.println("---");

        // Test av avancerad uppgift 8
        String originalText8 = "Hej på dig";
        String binaryText = convertWordsToBinary(originalText8);
        System.out.println("Avancerad uppgift 8: Ursprunglig text: '" + originalText8 + "'");
        System.out.println("Avancerad uppgift 8: Text i binär form: '" + binaryText + "'");

        System.out.println("---");

        // Test av avancerad uppgift 9
        String originalText9 = "Hej, på dig. abcxyz!";
        int shift = 3;
        String encryptedText = caesarCipher(originalText9, shift);
        System.out.println("Avancerad uppgift 9: Ursprunglig text: '" + originalText9 + "'");
        System.out.println("Avancerad uppgift 9: Krypterad text: '" + encryptedText + "'");

        System.out.println("---");

        // Test av avancerad uppgift 10
        String palindrome1_correct = "Ni talar bra latin";
        String palindrome2_correct = "Sirap i Paris";
        String notAPalindrome_correct = "Detta är inte ett palindrom.";

        System.out.println("Avancerad uppgift 10: Är '" + palindrome1_correct + "' ett palindrom? " + isPalindromeIgnoreSpecialChars(palindrome1_correct));
        System.out.println("Avancerad uppgift 10: Är '" + palindrome2_correct + "' ett palindrom? " + isPalindromeIgnoreSpecialChars(palindrome2_correct));
        System.out.println("Avancerad uppgift 10: Är '" + notAPalindrome_correct + "' ett palindrom? " + isPalindromeIgnoreSpecialChars(notAPalindrome_correct));

        System.out.println("---");

        // Test av uppgift 11
        String originalText11 = "Detta är en testmening som har en testmening";
        String uniqueWordsText = getUniqueWords(originalText11);
        System.out.println("Uppgift 11: Ursprunglig text: '" + originalText11 + "'");
        System.out.println("Uppgift 11: Text med unika ord: '" + uniqueWordsText + "'");

        System.out.println("---");

        // Test av uppgift 12
        String originalText12 = "Java är kul";
        String mirroredText = mirrorWords(originalText12);
        System.out.println("Uppgift 12: Ursprunglig text: '" + originalText12 + "'");
        System.out.println("Uppgift 12: Text med spegelvända ord: '" + mirroredText + "'");

        System.out.println("---");

        // Test av uppgift 13
        String uniqueText = "ABCDEFG";
        String duplicateText = "Hallå där";

        System.out.println("Uppgift 13: Har '" + uniqueText + "' unika bokstäver? " + areAllLettersUnique(uniqueText));
        System.out.println("Uppgift 13: Har '" + duplicateText + "' unika bokstäver? " + areAllLettersUnique(duplicateText));

        System.out.println("---");

        // Test av uppgift 14
        String originalText14 = "detta är en test test test test";
        String frequencyText = replaceWordsWithFrequency(originalText14);
        System.out.println("Uppgift 14: Ursprunglig text: '" + originalText14 + "'");
        System.out.println("Uppgift 14: Frekvensbaserad text: '" + frequencyText + "'");

        System.out.println("---");

        // Test av uppgift 15
        String originalText15 = "Pig latin är ett lekfullt språk som yellow-y. Eat omelet";
        String pigLatinText = toPigLatin(originalText15);
        System.out.println("Uppgift 15: Ursprunglig text: '" + originalText15 + "'");
        System.out.println("Uppgift 15: Pig Latin-text: '" + pigLatinText + "'");

        System.out.println("---");

        // Test av uppgift 16
        String originalText16 = "Hej på dig!";
        String rovarspraketText = toRovarspraket(originalText16);
        System.out.println("Uppgift 16: Ursprunglig text: '" + originalText16 + "'");
        System.out.println("Uppgift 16: Rövarspråket-text: '" + rovarspraketText + "'");

        System.out.println("---");

        // Test av uppgift 17 (med garanterat korrekt testfall)
        String pangram1 = "abcdefghijklmnopqrstuvwxyzåäö";
        String notAPangram = "Detta är ingen pangramtext.";

        System.out.println("Uppgift 17: Är '" + pangram1 + "' ett pangram? " + isPangram(pangram1));
        System.out.println("Uppgift 17: Är '" + notAPangram + "' ett pangram? " + isPangram(notAPangram));

        System.out.println("---");

        // Test av uppgift 18
        String originalText18 = "Hej!";
        String hexText = toHexadecimal(originalText18);
        System.out.println("Uppgift 18: Ursprunglig text: '" + originalText18 + "'");
        System.out.println("Uppgift 18: Hexadecimal text: '" + hexText + "'");

        System.out.println("---");

        // Test av uppgift 19
        String originalText19 = "Detta är en testmening.";
        String randomSortedText = sortWordsRandomly(originalText19);
        System.out.println("Uppgift 19: Ursprunglig text: '" + originalText19 + "'");
        System.out.println("Uppgift 19: Slumpmässigt sorterad text: '" + randomSortedText + "'");

        System.out.println("---");

        // Test av uppgift 20
        String originalText20 = "Detta är ett hemligt meddelande.";
        String encodedText = encodeText(originalText20);
        System.out.println("Uppgift 20: Ursprunglig text: '" + originalText20 + "'");
        System.out.println("Uppgift 20: Kodad text: '" + encodedText + "'");

    }

    // Avancerad uppgift 1
    public static String reverseWordsInPlace(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }

    // Avancerad uppgift 2
    public static String rotateWordsRight(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char lastChar = word.charAt(word.length() - 1);
                String restOfWord = word.substring(0, word.length() - 1);
                result.append(lastChar).append(restOfWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    // Avancerad uppgift 3
    public static String rotateWordsLeft(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                String restOfWord = word.substring(1);
                result.append(restOfWord).append(firstChar).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    // Avancerad uppgift 4
    public static String alternateCase(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(currentChar));
            } else {
                result.append(Character.toLowerCase(currentChar));
            }
        }
        return result.toString();
    }

    // Avancerad uppgift 5
    public static String sortWordsByLengthDescending(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    // Avancerad uppgift 6
    public static String sortWordsByVowelCount(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        Arrays.sort(words, (a, b) -> {
            int vowelsA = countVowels(a);
            int vowelsB = countVowels(b);
            return Integer.compare(vowelsA, vowelsB);
        });

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    private static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouyåäöAEIOUYÅÄÖ";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Avancerad uppgift 7
    public static String replaceWithNextAsciiChar(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            result.append((char) (c + 1));
        }
        return result.toString();
    }

    // Avancerad uppgift 8
    public static String convertWordsToBinary(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder binaryWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                String binary = Integer.toBinaryString(c);
                binaryWord.append(binary);
            }
            result.append(binaryWord.toString());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    // Avancerad uppgift 9
    public static String caesarCipher(String text, int shift) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                if (Character.isUpperCase(character)) {
                    char ch = (char)(((int)character + shift - 65) % 26 + 65);
                    result.append(ch);
                } else {
                    char ch = (char)(((int)character + shift - 97) % 26 + 97);
                    result.append(ch);
                }
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    // Avancerad uppgift 10
    public static boolean isPalindromeIgnoreSpecialChars(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        String cleanedText = text.replaceAll("[^a-zA-ZåäöÅÄÖ]", "").toLowerCase();

        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Avancerad uppgift 11
    public static String getUniqueWords(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        StringBuilder result = new StringBuilder();
        for (String word : uniqueWords) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    // Avancerad uppgift 12
    public static String mirrorWords(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder mirroredWord = new StringBuilder(word);
            mirroredWord.reverse();
            result.append(mirroredWord).append(" ");
        }
        return result.toString().trim();
    }

    // Avancerad uppgift 13
    public static boolean areAllLettersUnique(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        Set<Character> seenLetters = new HashSet<>();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerCaseChar = Character.toLowerCase(c);
                if (!seenLetters.add(lowerCaseChar)) {
                    // Returnera false om bokstaven redan finns i mängden
                    return false;
                }
            }
        }
        return true;
    }

    // Avancerad uppgift 14
    public static String replaceWordsWithFrequency(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(wordFrequency.get(word)).append(" ");
        }

        return result.toString().trim();
    }

    // Avancerad uppgift 15
    public static String toPigLatin(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        StringBuilder pigLatinSentence = new StringBuilder();

        for (String word : words) {
            pigLatinSentence.append(translateToPigLatin(word)).append(" ");
        }
        return pigLatinSentence.toString().trim();
    }

    private static String translateToPigLatin(String word) {
        String vowels = "aeiouyåäöAEIOUYÅÄÖ";

        // Hitta index för första vokalen, inklusive 'y'
        int firstVowelIndex = -1;
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                firstVowelIndex = i;
                break;
            }
        }

        // Om ordet börjar med en eller flera konsonanter
        if (firstVowelIndex > 0) {
            String consonantCluster = word.substring(0, firstVowelIndex);
            String restOfWord = word.substring(firstVowelIndex);
            return restOfWord + consonantCluster + "ay";
        }

        // Om ordet inte innehåller vokaler
        return word;
    }

    // Avancerad uppgift 16
    public static String toRovarspraket(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (isVowel(c)) {
                result.append(c);
            } else if (Character.isLetter(c)) {
                result.append(c).append('o').append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        String vowels = "aeiouyåäöAEIOUYÅÄÖ";
        return vowels.indexOf(c) != -1;
    }

    // Avancerad uppgift 17
    public static boolean isPangram(String text) {
        if (text == null || text.length() < 29) {
            return false;
        }

        String swedishAlphabet = "abcdefghijklmnopqrstuvwxyzåäö";
        Set<Character> uniqueLetters = new HashSet<>();

        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && swedishAlphabet.indexOf(c) != -1) {
                uniqueLetters.add(c);
            }
        }

        return uniqueLetters.size() == swedishAlphabet.length();
    }

    // Avancerad uppgift 18
    public static String toHexadecimal(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder hexString = new StringBuilder();
        for (char c : text.toCharArray()) {
            String hexValue = Integer.toHexString(c);
            hexString.append(hexValue).append(" ");
        }

        return hexString.toString().trim();
    }

    // Avancerad uppgift 19
    public static String sortWordsRandomly(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        List<String> words = Arrays.asList(text.split(" "));
        Collections.shuffle(words);

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    // Avancerad uppgift 20
    public static String encodeText(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        Map<String, String> codeLanguage = new HashMap<>();
        codeLanguage.put("detta", "alpha");
        codeLanguage.put("är", "bravo");
        codeLanguage.put("ett", "charlie");
        codeLanguage.put("hemligt", "delta");
        codeLanguage.put("meddelande", "echo");

        String[] words = text.split(" ");
        StringBuilder encodedText = new StringBuilder();

        for (String word : words) {
            String cleanWord = word.replaceAll("\\p{Punct}", "").toLowerCase();

            if (codeLanguage.containsKey(cleanWord)) {
                encodedText.append(codeLanguage.get(cleanWord)).append(" ");
            } else {
                encodedText.append(word).append(" ");
            }
        }

        return encodedText.toString().trim();
    }
}