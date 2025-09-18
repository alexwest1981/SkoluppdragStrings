package org.example;

//---------------
// Main functions
//---------------

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

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
}