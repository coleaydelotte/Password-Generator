import java.util.Random;
import java.util.Map;
public class Generate
{
    private Random rand;
    private boolean specialCharacters, numbers;
    private int numOfCapitals;
    private char[] alphabet = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private char[] lowerCaseAlphabet = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    private char[] specialSymbolsArray = {
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=',
        '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/'
    };

    public Generate(int numberOfCapitalLetters, boolean hasSpecialCharacters, boolean hasNumbers)
    {
        this.numOfCapitals = numberOfCapitalLetters;
        this.specialCharacters = hasSpecialCharacters;
        this.numbers = hasNumbers;
    }

    public String generatePassword()
    {
        for(char ch : specialSymbolsArray)
        {
            System.out.println(ch);
        }
        return "";
    }
}
