package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.List;

public class AdvancedExercisesVariables {

    public static void main(String[] args) {
        System.out.println("---");

        // Test av Avancerad uppgift 1
        String sentence = "Detta är en testmening.";
        int wordCount = countWords(sentence);
        System.out.println("Avancerad uppgift 1: Antal ord i strängen är: " + wordCount);

        String emptySentence = "    ";
        int emptyCount = countWords(emptySentence);
        System.out.println("Avancerad uppgift 1: Antal ord i strängen är: " + emptyCount);

        System.out.println("---");

        // Test av Avancerad uppgift 2
        String originalString2 = "Java";
        String doubledString = doubleCharacters(originalString2);
        System.out.println("Avancerad uppgift 2: Ursprunglig sträng: '" + originalString2 + "'");
        System.out.println("Avancerad uppgift 2: Dubblerad sträng: '" + doubledString + "'");

        System.out.println("---");

        // Test av Avancerad uppgift 3
        String originalString3 = "Hello";
        String reversedString = reverseString(originalString3);
        System.out.println("Avancerad uppgift 3: Ursprunglig sträng: '" + originalString3 + "'");
        System.out.println("Avancerad uppgift 3: Omvänd sträng: '" + reversedString + "'");

        System.out.println("---");

        // Test av Avancerad uppgift 4
        String string1_4 = "listen";
        String string2_4 = "silent";
        boolean areTheyAnagrams = areAnagrams(string1_4, string2_4);
        System.out.println("Avancerad uppgift 4: Är '" + string1_4 + "' och '" + string2_4 + "' anagram? " + areTheyAnagrams);

        String string3_4 = "hello";
        String string4_4 = "world";
        boolean areTheyNotAnagrams = areAnagrams(string3_4, string4_4);
        System.out.println("Avancerad uppgift 4: Är '" + string3_4 + "' och '" + string4_4 + "' anagram? " + areTheyNotAnagrams);

        System.out.println("---");

        // Test av Avancerad uppgift 5
        String sentence5 = "Programmering är en mycket rolig sysselsättning, men ordet nationalencyklopedin är ett väldigt långt ord.";
        String longestWord = findLongestWord(sentence5);
        System.out.println("Avancerad uppgift 5: Det längsta ordet är: '" + longestWord + "'");

        System.out.println("---");

        // Test av Avancerad uppgift 6
        String testString1 = "Taco Cat";
        boolean result1 = isPalindrome(testString1);
        System.out.println("Avancerad uppgift 6: Är '" + testString1 + "' ett palindrom? " + result1);

        String testString2 = "Hello World";
        boolean result2 = isPalindrome(testString2);
        System.out.println("Avancerad uppgift 6: Är '" + testString2 + "' ett palindrom? " + result2);

        System.out.println("---");

        // Test av Avancerad uppgift 7
        String testString7a = "abcdefg";
        boolean isUnique = hasAllUniqueCharacters(testString7a);
        System.out.println("Avancerad uppgift 7: Har '" + testString7a + "' unika tecken? " + isUnique);

        String testString7b = "hello";
        boolean isNotUnique = hasAllUniqueCharacters(testString7b);
        System.out.println("Avancerad uppgift 7: Har '" + testString7b + "' unika tecken? " + isNotUnique);

        System.out.println("---");

        // Test av Avancerad uppgift 8
        String testString8 = "Hello, world!";
        char testChar8 = 'o';
        int occurrenceCount = countOccurrences(testString8, testChar8);
        System.out.println("Avancerad uppgift 8: Antalet förekomster av '" + testChar8 + "' är: " + occurrenceCount);

        String testString8b = "Banana";
        char testChar8b = 'a';
        int occurrenceCount2 = countOccurrences(testString8b, testChar8b);
        System.out.println("Avancerad uppgift 8: Antalet förekomster av '" + testChar8b + "' är: " + occurrenceCount2);

        System.out.println("---");

        // Test av Avancerad uppgift 9
        String testString9 = "Detta  är en mening med    många mellanslag.";
        String noSpacesString = removeSpaces(testString9);
        System.out.println("Avancerad uppgift 9: Originalsträng: '" + testString9 + "'");
        System.out.println("Avancerad uppgift 9: Sträng utan mellanslag: '" + noSpacesString + "'");
        System.out.println("---");

        // Test av Avancerad uppgift 10
        String testString10 = "Programmering är roligt!";
        int vowelCount = countVowels(testString10);
        System.out.println("Programmering är roligt!");
        System.out.println("Avancerad uppgift 10: Antalet vokaler i strängen är: " + vowelCount);

        System.out.println("---");

        // Test av Avancerad uppgift 11
        String testString11a = "taco cat";
        boolean isPalindrome11a = isPalindromePhrase(testString11a);
        System.out.println("Avancerad uppgift 11: Är '" + testString11a + "' en palindromsats? " + isPalindrome11a);

        String testString11b = "A man, a plan, a canal: Panama";
        boolean isPalindrome11b = isPalindromePhrase(testString11b);
        System.out.println("Avancerad uppgift 11: Är '" + testString11b + "' en palindromsats? " + isPalindrome11b);

        System.out.println("---");

        // Test av Avancerad uppgift 12
        String testString12 = "Detta är en testmening.";
        String reversedWordsString = reverseWordsInString(testString12);
        System.out.println("Avancerad uppgift 12: Ursprunglig sträng: '" + testString12 + "'");
        System.out.println("Avancerad uppgift 12: Sträng med omvända ord: '" + reversedWordsString + "'");

        System.out.println("---");

        // Test av Avancerad uppgift 13
        String testString13 = "Detta är en testmening.";
        String reversedOrderString = reverseWordOrder(testString13);
        System.out.println("Avancerad uppgift 13: Ursprunglig sträng: '" + testString13 + "'");
        System.out.println("Avancerad uppgift 13: Sträng med omvänd ordning: '" + reversedOrderString + "'");

        System.out.println("---");

        // Test av Avancerad uppgift 14
        String testString14a = "The quick brown fox jumps over the lazy dog";
        boolean isPangramResult = isPangram(testString14a);
        System.out.println("Avancerad uppgift 14: Är '" + testString14a + "' en pangram? " + isPangramResult);

        String testString14b = "The quick brown fox jumps over the lazy cat";
        boolean isNotPangramResult = isPangram(testString14b);
        System.out.println("Avancerad uppgift 14: Är '" + testString14b + "' en pangram? " + isNotPangramResult);

        System.out.println("---");

        // Test av Avancerad uppgift 15
        String testString15 = "Hej på dig!";
        String rotatedSentence = rotateWords(testString15);
        System.out.println("Avancerad uppgift 15: Ursprunglig sträng: '" + testString15 + "'");
        System.out.println("Avancerad uppgift 15: Roterad sträng: '" + rotatedSentence + "'");


        // Uppgift 10 är nästintill identisk med uppgift 16, så jag hoppar vidare till 17

        System.out.println("---");

        // Test av Avancerad uppgift 17
        String testString17a = "((a + b) * c)";
        boolean isBalanced = areParenthesesBalanced(testString17a);
        System.out.println("Avancerad uppgift 17: Är '" + testString17a + "' balanserad? " + isBalanced);

        String testString17b = "((a + b)) * c)";
        boolean isNotBalanced = areParenthesesBalanced(testString17b);
        System.out.println("Avancerad uppgift 17: Är '" + testString17b + "' balanserad? " + isNotBalanced);

        System.out.println("---");

        // Test av Avancerad uppgift 18
        String testString18 = "Detta är en testmening.";
        String shuffledSentence = shuffleWords(testString18);
        System.out.println("Avancerad uppgift 18: Ursprunglig sträng: '" + testString18 + "'");
        System.out.println("Avancerad uppgift 18: Slumpmässig ordning: '" + shuffledSentence + "'");
    }


    // Metoderna

    // Avancerad uppgift 1
    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    // Avancera uppgift 2
    public static String doubleCharacters(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        StringBuilder doubledText = new StringBuilder();
        for (char c : text.toCharArray()) {
            doubledText.append(c).append(c);
        }

        return doubledText.toString();
    }

    // Avancerad uppgift 3
    public static String reverseString(String text) {
        if (text == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    // Avancerad uppgift 4
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    // Avancerad uppgift 5
    public static String findLongestWord(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        String[] words = text.trim().split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // Avancerad uppgift 6
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedText = new StringBuilder(cleanText).reverse().toString();

        return cleanText.equals(reversedText);
    }

    // Avancerad uppgift 7
    public static boolean hasAllUniqueCharacters(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : text.toLowerCase().toCharArray()) {
            if (!uniqueChars.add(c)) {
                return false;
            }
        }

        return true;
    }

    // Avancerad uppgift 8
    public static int countOccurrences(String text, char character) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int count = 0;
        char lowerCaseChar = Character.toLowerCase(character);
        String lowerCaseText = text.toLowerCase();

        for (int i = 0; i < lowerCaseText.length(); i++) {
            if (lowerCaseText.charAt(i) == lowerCaseChar) {
                count++;
            }
        }
        return count;
    }

    // Avancerad uppgift 9
    public static String removeSpaces(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("\\s", "");
    }

    // Avancerad uppgift 10
    public static int countVowels(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int count = 0;
        String lowerCaseText = text.toLowerCase();

        for (int i = 0; i < lowerCaseText.length(); i++) {
            char ch = lowerCaseText.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' || ch == 'å' || ch == 'ä' || ch == 'ö') {
                count++;
            }
        }
        return count;
    }

    // Avancerad uppgift 11
    public static boolean isPalindromePhrase(String text) {
        if (text == null) {
            return false;
        }

        String lowerCaseText = text.toLowerCase();
        String reversedText = new StringBuilder(lowerCaseText).reverse().toString();

        return lowerCaseText.equals(reversedText);
    }

    // Avancerad uppgift 12
    public static String reverseWordsInString(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        String[] words = text.trim().split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    // Avancerad uppgift 13
    public static String reverseWordOrder(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        String[] words = text.trim().split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    // Avancerad uppgift 14
    public static boolean isPangram(String text) {
        if (text == null || text.length() <26) {
            return false;
        }

        boolean[] alphabet = new boolean[26];
        String lowerCaseText = text.toLowerCase();

        for (int i = 0; i < lowerCaseText.length(); i++) {
            char ch = lowerCaseText.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean letterFound : alphabet) {
            if (!letterFound) {
                return false;
            }
        }
        return true;
    }

    // Avancerad uppgift 15 - huvudmetod
    public static String rotateWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        String[] words = text.trim().split("\\s+");
        StringBuilder rotatedSentence = new StringBuilder();

        for (String word : words) {
            String rotatedWord = rotateSingleWord(word);
            rotatedSentence.append(rotatedWord).append(" ");
        }

        return rotatedSentence.toString().trim();
    }

    // Hjälpmetod för att rotera ett enskilt ord
    private static String rotateSingleWord(String word) {
        if (word.length() <= 1) {
            return word;
        }

        char lastChar = word.charAt(word.length() - 1);
        String restOfWord = word.substring(0, word.length() - 1);

        return lastChar + restOfWord;
    }

    // Avancerad uppgift 17
    public static boolean areParenthesesBalanced(String text) {
        if (text == null) {
            return true;
        }

        int count = 0;
        for (char ch : text.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    // Avancerad uppgift 18
    public static String shuffleWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        List<String> words = Arrays.asList(text.trim().split("\\s+"));
        Collections.shuffle(words);

        StringBuilder shuffledSentence = new StringBuilder();
        for (String word : words) {
            shuffledSentence.append(word).append(" ");
        }

        return shuffledSentence.toString().trim();
    }
}
