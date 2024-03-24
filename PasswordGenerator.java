public class PasswordGenerator
{
    public static void main(String[] args)
    {
        Generate gen = new Generate(0, false, false);
        String i = gen.generatePassword();
        System.out.println(i);
    }
}