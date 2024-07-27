import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Generate
{
    private int numberOfCharacters, numOfSpecialCharacters, numberOfCapitalLetters, numberOfLowerCaseLetters;
    private Random rand;
    private boolean specialCharacters, hasNumbers;
    private String password = "";
    private char[] uppercaseAlphabet = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private char[] lowercaseAlphabet = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    private char[] specialSymbolsArray = {
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=',
        '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/'
    };
    private char[] numbersArray = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    public Generate(int numberOfCapitalLetters, boolean hasSpecialCharacters, boolean hasNumbers, int numberOfCharacters)
    {
        this.numberOfCharacters = numberOfCharacters;
        this.numOfSpecialCharacters = hasSpecialCharacters ? numberOfCharacters / 3 : 0;
        this.numberOfCapitalLetters = numberOfCapitalLetters;
        this.numberOfLowerCaseLetters = numberOfCharacters - numberOfCapitalLetters - numOfSpecialCharacters;
        if (hasNumbers)
        {
            this.numberOfLowerCaseLetters -= numberOfCharacters / 6;
        }
        rand = new Random();
    }

    public String generatePassword()
    {
        ArrayList<Character> passwordChars = new ArrayList<>();
        
        for (int i = 0; i < numberOfCapitalLetters; i++)
        {
            passwordChars.add(uppercaseAlphabet[rand.nextInt(26)]);
        }
        
        for (int i = 0; i < numberOfLowerCaseLetters; i++)
        {
            passwordChars.add(lowercaseAlphabet[rand.nextInt(26)]);
        }
        
        if (specialCharacters)
        {
            for (int i = 0; i < numOfSpecialCharacters; i++)
            {
                passwordChars.add(specialSymbolsArray[rand.nextInt(30)]);
            }
        }
        
        if (hasNumbers)
        {
            for (int i = 0; i < numberOfCharacters / 6; i++)
            {
                passwordChars.add(numbersArray[rand.nextInt(10)]);
            }
        }
        
        Collections.shuffle(passwordChars);
    
        for (char c : passwordChars)
        {
            password += c;
        }
        return password;
    }
}
