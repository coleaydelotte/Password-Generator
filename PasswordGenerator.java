
public class PasswordGenerator
{
    public static void main(String[] args)
    {
        Generate gen = new Generate(10, true, true, 30);
        String password = gen.generatePassword();
        System.out.println(password);
    }
}