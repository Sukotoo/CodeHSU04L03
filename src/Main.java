import java.util.*;
public class Main {
    /*
        Use the following methods:
            .length()
            .substring(start,finish)
            .substring(start) goes to the end
            .indexOf(someString)
            .equals(otherString)
     */
    public static void main(String[] args) {
        System.out.println(VowelCount("This is a string."));
        System.out.println("Correct output: 4");
        
        System.out.println(VowelRemover("Remove all of the vowels."));
        System.out.println("Correct output: Rmv ll f th vwls");
        
        System.out.println("\n" + ContainsSubstring("Sentence","ten"));
        System.out.println("Correct output: true");
        
        System.out.println(ReverseString("ABCDEF"));
        System.out.println("Correct output: FEDCBA");
        
        System.out.println(PalindromeChecker("level"));
        System.out.println("Correct output: true");
    }

    /**
     * Count the vowels in the input string regardless of case
     * @param input String
     * @return vowel count int
     */
    public static int VowelCount(String input){
        String lowerCaseInput = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            String letter = lowerCaseInput.substring(i, i + 1);
            switch (letter) {
                case "a" -> count++;
                case "e" -> count++;
                case "i" -> count++;
                case "o" -> count++;
                case "u" -> count++;
            }
        }
        return count;
    }

    /**
     * Returns a string with all vowels removed regardless of case
     * @param input String
     * @return String with no vowels
     */
    public static String VowelRemover(String input){
        String original = input;
        String newString = input.replaceAll("[aeiouAEIOU]", "");
        return newString;
    }

    /**
     * Determine if a substring target is contained in a given string
     * @param input - Given string
     * @param target - String being looked for
     * @return true if target found, false otherwise
     */
    public static boolean ContainsSubstring(String input, String target){
        for (int i = 0; i <= input.length() - target.length(); i++)
        {
            String newString = input.substring(i, i + target.length());
            if (newString.equals(target))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Reverses a given string
     * @param input String
     * @return reversed input String
     */
    public static String ReverseString(String input){
        char[] characters = new char[input.length()];
        int counter = 0;
        for (int i = input.length() - 1; i >= 0; i--)
        {
            characters[counter] = input.charAt(i);
            counter++;

        }

        return charArrayToString(characters);
    }

    /**
     * Determines if a given string is palindrome
     * @param input String
     * @return true if given string is a palindrome, false otherwise
     */
    public static boolean PalindromeChecker(String input){

        return input.equals(ReverseString(input));
    }

    public static String charArrayToString(char[] array)
    {
        String newString = new String(array);
        return newString;
    }
}
