package org.example;

//---------------
// Main functions
//---------------

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        // Uppgift 1
        String result1 = concatenateStrings("Hello, ", "world!");
        System.out.println("Uppgift 1: " + result1);

        System.out.println("---");

        // Uppgift 2

        String myText = "Java-programmering";
        int length = getStringLength(myText);

        System.out.println("Uppgift 2: Längden på '"+ myText + "' är " + length + " tecken.");

        System.out.println("---");

        // Uppgift 3
        String originalText = "programmering";
        String reversedText = reverseString(originalText);

        System.out.println("Uppgift 3: Den urpsrungliga strängen är " + originalText);
        System.out.println("Uppgift 3: Strängen baklänges är '" + reversedText + "'");

        System.out.println("---");

        // Uppgift 4
        String sampleText = "programmering";
        char characterToCount = 'r';
        int occurences = countCharacterOccurrences(sampleText, characterToCount);

        System.out.println("Uppgift 4: Antalet gånger tecknet '"
                + characterToCount + "' förekommer i '" + sampleText + "' är: " + occurences);

        System.out.println("---");

        // Uppgift 5
        String originalCasteText = "Hej på dig, programmerare!";
        String upperCasteText = toUpperCase(originalCasteText);

        System.out.println("Uppgift 5: Den ursprungliga strängen är: " + originalCasteText);
        System.out.println("Uppgift 5: Strängen i versaler är: " + upperCasteText);

        System.out.println("---");

        // Uppgift 6
        String originalCaseText2 = "DETTA ÄR EN TESTSTRÄNG.";
        String lowerCaseText = toLowerCase(originalCaseText2);

        System.out.println("Uppgift 6: Den ursprungliga strängen är: " + originalCaseText2);
        System.out.println("Uppgift 6: Strängen i gemener är: " + lowerCaseText);

        System.out.println("---");

        // Uppgift 7
        String textA = "hejsan";
        String textB = "hejsan";
        String textC = "hej då";

        boolean comparison1 = areStringsEqual(textA, textB);
        boolean comparison2 = areStringsEqual(textA, textC);

        System.out.println("Uppgift 7: Jämför '" + textA + "' och '" + textB + "'. De är lika: " + comparison1);
        System.out.println("Uppgift 7: Jämför '" + textA + "' och '" + textC + "'. De är lika: " + comparison2);

        System.out.println("---");

        // Uppgift 8
        String textForTask8 = "Stora och små bokstäver";
        String lowerCaseResult = toLowerCase(textForTask8);
        System.out.println("Uppgift 8: Ursprunglig sträng: '" + textForTask8 + "'");
        System.out.println("Uppgift 8: Sträng i små bostäver: '" + lowerCaseResult + "'");

        System.out.println("---");

        // Uppgift 9
        String textForTask9 = "Är Det EnkelT?";
        String upperCaseResult = toUpperCase(textForTask9);
        System.out.println("Uppgift 9: Ursprunglig sträng: '" + textForTask9 + "'");
        System.out.println("Uppgift 9: Sträng i stora bokstäver: '"  + upperCaseResult + "'");

        System.out.println("---");

        // Uppgift 10
        String palindrome1 = "anna";
        String palindrome2 = "racecar";
        String notPalindrome = "programmering";

        System.out.println("Uppgift 10: Är '" + palindrome1 + "' en palindrom? " + isPalindrome(palindrome1));
        System.out.println("Uppgift 10: Är '" + palindrome2 + "' en palindrom? " + isPalindrome(palindrome2));
        System.out.println("Uppgift 10: Är '" + notPalindrome + "' en palindrom? " + isPalindrome(notPalindrome));

        System.out.println("---");

        // Uppgift 11
        String sentence1 = "Detta är en testmening.";
        String sentence2 = "Ett ord.";
        String emptySentence = "";

        int wordCount1 = countWords(sentence1);
        int wordCount2 = countWords(sentence2);
        int wordCount3 = countWords(emptySentence);

        System.out.println("Uppgift 11: Antalet ord i '" + sentence1 + "' är: " + wordCount1);
        System.out.println("Uppgift 11: Antalet ord i '" + sentence2 + "' är: " + wordCount2);
        System.out.println("Uppgift 11: Antalet ord i en tom sträng är: " + wordCount3);

        System.out.println("---");

        // Uppgift 12
        String  originalSentence = "Detta är en test mening";
        String reversedSentence = reverseWords(originalSentence);

        System.out.println("Uppgift 12: Ursprunglig mening: '" + originalSentence + "'");
        System.out.println("Uppgift 12: Meningen med omvända ord: '" + reversedSentence + "'");

        System.out.println("---");

        // Uppgift 13
        String mainString = "Java är ett programmeringsspråk.";
        String subString1 = "programmeringsspråk";
        String subString2 = "C++";

        boolean contains1 = containsString(mainString, subString1);
        boolean contains2 = containsString(mainString, subString2);

        System.out.println("Uppgift 13: Innehåller '" + mainString + "' strängen '" + subString1 + "'? " + contains1);
        System.out.println("Uppgift 13: Innehåller '" + mainString + "' strängen '" + subString2 + "'? " + contains2);

        System.out.println("---");

        // Uppgift 14
        String originalPhrase = "Ett enkelt exempel.";
        char oldChar = 'e';
        char newChar = 'o';
        String replacedPhrase = replaceCharacter(originalPhrase, oldChar, newChar);

        System.out.println("Uppgift 14: Ursprunglig fras: '" + originalPhrase + "'");
        System.out.println("Uppgift 14: Fras med ersatta tecken: '" + replacedPhrase + "'");

        System.out.println("---");

        // Uppgift 15
        String sentenceWithSpaces = "Denna mening har mellanslag.";
        String sentenceWithoutSpaces = removeSpaces(sentenceWithSpaces);

        System.out.println("Uppgift 15: Ursprunglig fras: '" + sentenceWithSpaces + "'");
        System.out.println("Uppgift 15: Sträng utan mellanslag: '" + sentenceWithoutSpaces + "'");

        System.out.println("---");

        // Ippgift 16
        String originalPhrase2 = "detta är en testmening.";
        String capitalizedPhrase = capitalizeWords(originalPhrase2);

        System.out.println("Uppgift 16: Ursprunglig fras: '" + originalPhrase2 + "'");
        System.out.println("Uppgift 16: Fras med versala första bokstäver: '" + capitalizedPhrase + "'");

        System.out.println("---");

        // Uppgift 17
        String email1 = "test@example.com";
        String email2 = "invalid-email";
        String email3 = "name.surname@sub.domain.co.uk";
        String email4 = "@nodot.com";

        System.out.println("Uppgift 17: Är '" + email1 + "' en giltig e-post? " + isValidEmail(email1));
        System.out.println("Uppgift 17: Är '" + email2 + "' en giltig e-post? " + isValidEmail(email2));
        System.out.println("Uppgift 17: Är '" + email3 + "' en giltig e-post? " + isValidEmail(email3));
        System.out.println("Uppgift 17: Är '" + email4 + "' en giltig e-post? " + isValidEmail(email4));

        System.out.println("---");

        // Uppgift 18
        String originalText18 = "hej";
        String doubledText = doubleCharacters(originalText18);
        System.out.println("Uppgift 18: Ursprunglig sträng: '" + originalText18 + "'");
        System.out.println("Uppgift 18: Sträng med dubblerade tecken: '" + doubledText + "'");

        System.out.println("---");

        // Uppgift 19
        String word1 = "listen";
        String word2 = "silent";
        String word3 = "hello";
        String word4 = "world";

        System.out.println("Uppgift 19: Är '" + word1 + "' och '" + word2 + "' anagram? " + areAnagrams(word1, word2));
        System.out.println("Uppgift 19: Är '" + word3 + "' och '" + word4 + "' anagram? " + areAnagrams(word3, word4));
        System.out.println("Uppgift 19: Är 'tacos' och 'costa' anagram? " + areAnagrams("Tacos", "costa"));

        System.out.println("---");

        // Uppgift 20
        String originalSentence20 = "Detta är en testmening.";
        String codedSentence = replaceWithCode(originalSentence20);

        System.out.println("Uppgift 20: Ursprunglig mening: '" + originalSentence20 + "'");
        System.out.println("Uppgift 20: Meningen i kodspråk: '" + codedSentence + "'");

        System.out.println("---");

        // Uppgift 21
        String originalSentence21 = "programmering är kul";
        String swappedSentence = swapFirstAndLast(originalSentence21);
        System.out.println("Uppgift 21: Ursprunglig mening: '" + originalSentence21 + "'");
        System.out.println("Uppgift 21: Meningen med bytta bokstäver: '" + swappedSentence + "'");

        System.out.println("---");

        // Uppgift 22
        String originalText22 = "Java";
        String asciiString = convertToAscii(originalText22);
        System.out.println("Uppgift 22: Ursprunglig sträng: '" + originalText22 + "'");
        System.out.println("Uppgift 22: Sträng med ASCII-värden: '" + asciiString + "'");

        System.out.println("---");

        // Uppgift 23
        String originalText23 = "Detta är en testmening.";
        String replacedText = replaceVowelsWithStars(originalText23);
        System.out.println("Uppgift 23: Ursprunglig sträng: '" + originalText23 + "'");
        System.out.println("Uppgift 23: Sträng med ersatta vokaler: '" + replacedText + "'");

        System.out.println("---");

        // Uppgift 24
        String isbn10_valid = "0-306-40615-2";
        String isbn10_invalid = "0-306-40615-X";
        String isbn13_valid = "978-0-306-40615-7";
        String isbn13_invalid = "978-0-306-40615-8";
        System.out.println("Uppgift 24: Är '" + isbn10_valid + "' en giltig ISBN? " + isValidIsbn(isbn10_valid));
        System.out.println("Uppgift 24: Är '" + isbn10_invalid + "' en giltig ISBN? " + isValidIsbn(isbn10_invalid));
        System.out.println("Uppgift 24: Är '" + isbn13_valid + "' en giltig ISBN? " + isValidIsbn(isbn13_valid));
        System.out.println("Uppgift 24: Är '" + isbn13_invalid + "' en giltig ISBN? " + isValidIsbn(isbn13_invalid));

        System.out.println("---");

        // Uppgift 25
        String text25 = "programmering";
        Map<Character, Integer> frequency = countCharacterFrequency(text25);
        System.out.println("Uppgift 25: Teckenfrekvens för '" + text25 + "'");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("'" + entry.getKey() + " - " + entry.getValue() + " gånger");
        }

        System.out.println("---");

        // Uppgift 26
        String validIp = "192.168.1.1";
        String invalidIp1 = "256.100.200.300"; // Siffror för höga
        String invalidIp2 = "123.45.67"; // För få oktetter
        String invalidIp3 = "123.45.67.89.10"; // För många oktetter

        System.out.println("Uppgift 26: Är '" + validIp + "' en giltig IP? " + isValidIpAddress(validIp));
        System.out.println("Uppgift 26: Är '" + invalidIp1 + "' en giltig IP? " + isValidIpAddress(invalidIp1));
        System.out.println("Uppgift 26: Är '" + invalidIp2 + "' en giltig IP? " + isValidIpAddress(invalidIp2));
        System.out.println("Uppgift 26: Är '" + invalidIp3 + "' en giltig IP? " + isValidIpAddress(invalidIp3));

        System.out.println("---");

        // Uppgift 27
        String text27 = "Min katt heter Lisa och är söt.";
        String replacedConsonantsText = replaceConsonantsWithNextVowel(text27);
        System.out.println("Uppgift 27: Ursprunglig sträng: '" + text27 + "'");
        System.out.println("Uppgift 27: Sträng med ersatta konsonanter: '" + replacedConsonantsText + "'");

        System.out.println("---");

        // Uppgift 28
        String text28 = "programmering";
        String uniqueCharactersText = removeDuplicates(text28);
        System.out.println("Uppgift 28: Ursprunglig sträng: '" + text28 + "'");
        System.out.println("Uppgift 28: Sträng utan dubbla tecken: '" + uniqueCharactersText + "'");
    }

    //----------
    // Metoderna
    //----------

    // Hello, world
    public static String concatenateStrings(String str1, String str2){
        return str1 + str2;
    }

    // Räkna tecken
    public static int getStringLength(String text) {
        // returnering av text
        return text.length();
    }

    // Vänd på texten
    public static String reverseString(String text) {
        //Skapa ett StringBuilder-objekt från den inkommande strängen
        StringBuilder sb = new StringBuilder(text);

        // Vänd på innehåller i StringBuilder-objektet
        sb.reverse();

        // Konvertera tillbaka till en String och returnera
        return sb.toString();
    }

    // Sök efter tecken
    public static int countCharacterOccurrences(String text, char characterToFind){
        // Skapa räknare och initiera den till 0
        int count = 0;

        // Loopa genom varje tecken i en sträng
        for (int i = 0; i < text.length(); i++) {
            // Jämför varje tecken med tecknet vi letar efter
            if (text.charAt(i) == characterToFind) {
                // Öka räknaren om tecknet matchar
                count++;
            }
        }

        // Returnera det totala antalet
        return count;
    }

    // Uppercase
    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }

    // LowerCase
    public static String toLowerCase(String text) {
        return text.toLowerCase();
    }

    // Jämförelse
    public static boolean areStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    // Palindrom
    public static boolean isPalindrome(String text) {
        String cleanedText = text.toLowerCase();
        String reversedText = reverseString(cleanedText);
        return cleanedText.equals(reversedText);
    }

    // Count words
    public static int countWords(String text) {
        // Om strängen är tom eller null, returnera 0
        if (text == null || text.isEmpty()) {
            return 0;
        }

        // Dela upp strängen i en array av ord med mellanslag som avgränsare
        String[] words = text.split(" ");

        // Returnera antalet element i arrayen
        return words.length;
    }

    public static String reverseWords(String sentence) {
        // Dela upp meningen i en array av ord
        String[] words = sentence.split(" ");

        // Skapa en StringBuilder för att bygga upp den nya strängen
        StringBuilder reverseSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence.append(words[i]);

            // Lägg till ett mellanslag mellan orden, men inte efter det sista
            if (i > 0) {
                reverseSentence.append(" ");
            }
        }
        // Returnera den nya strängen
        return reverseSentence.toString();
    }

    // Sträng-kontroll
    public static boolean containsString(String text, String substring) {
        return text.contains(substring);
    }

    // Replace Character
    public static String replaceCharacter(String text, char oldChar, char newChar) {
        return text.replace(oldChar, newChar);
    }

    // Remove Spaces
    public static String removeSpaces(String text) {
        return text.replaceAll(" ", "");
    }

    // Capitalize Words
    public static String capitalizeWords(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Gör första bokstaven till versal och resten gemen
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        // Ta bort sista blanksteget innan vi returnerar strängen
        return result.toString().trim();
    }

    // Giltig email
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        // Ett enkelt reguljärt uttryck för att validera en e-postadress.
        // Det finns mer komplexa och exakta mönster, men detta är en bra början.
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    // Dubbla karaktärer
    public static String doubleCharacters(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder doubledText = new StringBuilder();

        for (char c: text.toCharArray()) {
            doubledText.append(c).append(c);
        }

        return doubledText.toString();
    }

    // Anagram
    public static boolean areAnagrams(String str1, String str2) {
        // Kontrollera om strängarna är null
        if (str1 == null || str2 == null) {
            return false;
        }

        // Kontrollera om strängarna har samma längd. Om inte, är de inte anagram.
        if (str1.length() != str2.length()) {
            return false;
        }

        // Konvertera strängarna till gemener för att ignorera skiftlägen
        String cleanStr1 = str1.toLowerCase();
        String cleanStr2 = str2.toLowerCase();

        // Konvertera strängarna till tecken-arrayer
        char[] charArray1 = cleanStr1.toCharArray();
        char[] charArray2 = cleanStr2.toCharArray();

        // Sortera arrayerna
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Jämför de sorterade arrayerna
        return Arrays.equals(charArray1, charArray2);
    }

    // Replace With Code
    public static String replaceWithCode(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        // Dela upp strängen i ord
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        // Loopa igenom varje ord och ersätt det
        for (String word : words) {
            if (!word.isEmpty()) {
                // Ersätt ordet med dess längd som en sträng
                result.append(word.length()).append(" ");
            }
        }

        // Ta bort sista blanksteget
        return result.toString().trim();
    }

    // Swap First and Last
    public static String swapFirstAndLast(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 1) {
                result.append(word).append(" ");
            } else {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() -1);

                result.append(last).append(middle).append(first).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String convertToAscii(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            int asciiValue = (int) character;
            result.append(asciiValue).append(" ");
        }

        return result.toString().trim();
    }

    // Replace Vowel With Stars
    public static String replaceVowelsWithStars(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String vowels = "aeiouyåäöAEIOUYÅÄÖ";

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (vowels.indexOf(character) != -1) {
                result.append('*');
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    // Valid ISBN
    public static boolean isValidIsbn(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            return false;
        }

        // Ta bort alla bindestreck och mellanslag
        String cleanedIsbn = isbn.replace("-", "").replace(" ", "");

        //Validera ISBN-10
        if (cleanedIsbn.length() == 10) {
            int sum =0;
            for (int i = 0; i < 9; i++) {
                char c =  cleanedIsbn.charAt(i);
                if (!Character.isDigit(c)) {
                    return false;
                }
                int digit = Character.getNumericValue(c);
                sum += (10 - 1) * digit;
            }

            char lastChar = cleanedIsbn.charAt(9);
            if (Character.isDigit(lastChar)) {
                sum += Character.getNumericValue(lastChar);
            } else if (lastChar == 'x' || lastChar == 'X') {
                sum += 10;
            } else {
                return false;
            }
            return (sum % 11 == 0);
        }

        // Validera ISBN-13
        if (cleanedIsbn.length() == 13) {
            int sum = 0;
            for (int i = 0; i < 12; i++) {
                char c = cleanedIsbn.charAt(i);
                if (!Character.isDigit(c)) {
                    return false;
                }
                int digit = Character.getNumericValue(c);
                if (i % 2 == 0) {
                    sum += digit;
                } else {
                    sum += digit * 3;
                }
            }

            char lastChar = cleanedIsbn.charAt(12);
            if (!Character.isDigit(lastChar)) {
                return false;
            }
            int lastDigit = Character.getNumericValue(lastChar);

            return ((sum + lastDigit) % 10 == 0);
        }

        // Returnera om längden inte är 10 eller 13
        return false;
    }

    // Hashmap (nej, inte 420)
    public static Map<Character, Integer> countCharacterFrequency(String text) {
        if (text == null || text.isEmpty()) {
            return new HashMap<>();
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char character : text.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        return frequencyMap;
    }

    // Valid Ip-adress
    public static boolean isValidIpAddress(String ipAdress) {
        if (ipAdress == null || ipAdress.isEmpty()) {
            return false;
        }

        // Reguljärt uttryck för att matcha en IPv4-adress
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAdress);

        return matcher.matches();
    }

    // Replace Consonants
    public static String replaceConsonantsWithNextVowel(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String vowels = "aeiouyåäö";
        String allVowels = vowels + vowels.toUpperCase();

        for (char c : text.toCharArray()) {
            if (allVowels.indexOf(c) != -1) {
                // Om det är en vokal, lägg till den som den är
                result.append(c);
            } else if (Character.isLetter(c)) {
                // Om det är en konsonant, hitta nästa vokal
                char lowerCaseChar = Character.toLowerCase(c);
                int vowelIndex = 0;
                char nextVowel = ' ';

                // Vi hittar en näst-bäst matchning (nästa vokal)
                if (lowerCaseChar >= 'a' && lowerCaseChar < 'e') {
                    nextVowel = (Character.isUpperCase(c)) ? 'E' : 'e';
                } else if (lowerCaseChar >= 'e' && lowerCaseChar < 'i') {
                    nextVowel = (Character.isUpperCase(c)) ? 'I' : 'i';
                } else if (lowerCaseChar >= 'i' && lowerCaseChar < 'o') {
                    nextVowel = (Character.isUpperCase(c)) ? 'O' : 'o';
                } else if (lowerCaseChar >= 'o' && lowerCaseChar < 'u') {
                    nextVowel = (Character.isUpperCase(c)) ? 'U' : 'u';
                } else if (lowerCaseChar >= 'u' && lowerCaseChar < 'y') {
                    nextVowel = (Character.isUpperCase(c)) ? 'Y' : 'y';
                } else if (lowerCaseChar >= 'y' && lowerCaseChar < 'å') {
                    nextVowel = (Character.isUpperCase(c)) ? 'Å' : 'å';
                } else if (lowerCaseChar >= 'å' && lowerCaseChar < 'ä') {
                    nextVowel = (Character.isUpperCase(c)) ? 'Ä' : 'ä';
                } else if (lowerCaseChar >= 'ä' && lowerCaseChar < 'ö') {
                    nextVowel = (Character.isUpperCase(c)) ? 'Ö' : 'ö';
                } else {
                    nextVowel = (Character.isUpperCase(c)) ? 'A' : 'a';
                }
                result.append(nextVowel);
            } else {
                // Om det inte är en bokstav, lägg till det som det är, t ex en siffra
                result.append(c);
            }
        }

        return result.toString();
    }

    // Remove duplicates
    public static String removeDuplicates(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        HashSet<Character> seenCharacters = new HashSet<>();

        for (char character : text.toCharArray()) {
            if (seenCharacters.add(character)) {
                // 'add' returnerar true om tecknet lades till, cvs om det är unikt
                result.append(character);
            }
        }

        return result.toString();
    }

    // Sortera alfabetiskt
    public static String sortWordsAlphabetically(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
    }
}