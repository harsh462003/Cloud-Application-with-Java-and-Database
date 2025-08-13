package lab1;

public class question5 {
    public static void main(String[] args)
    {
        String s=args[0];
        String rev=new StringBuilder(s).reverse().toString();
        if(s.equals(rev))
        {
            System.out.println(s+" is a palindrome");
        }
        else
        {
            System.out.println(s+" is a not a palindrome");
        }
    }
}
