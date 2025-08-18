// MENU DRIVEN QUESTION , THAT HAS 3 OPTIONS , RIGHT ANGLED TRIANGLE , REVERSED RIGHT ANGLED TRIANGLE AND PYRAMID
//Values taken from the user
// this is the 5th question in the assignment
//passward has to be changed to * when typed(not completed)
import java.io.Console;
import java.util.Scanner;
import java.util.Stack;

public class question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        if (console == null) {
            System.out.println("Console is not available. Run the program in a terminal or command prompt.");
            return;
        }
        int choice=0;
        String u,p;
        System.out.println("Enter the username:");
        u=sc.next();

        System.out.print("Enter the password: ");
        p = readPasswordMasked();

        if(verifyuser(u,p)==false)
        {
            System.out.println("Invalid credentials");
            return;
        }
        else
        {
            System.out.println("Login successfull:");
            do {
                System.out.println("MENU");
                System.out.println("1.RIGHT ANGLED TRIANGLE");
                System.out.println("2.REVERSED RIGHT ANGLED TRIANGLE");
                System.out.println("3.PYRAMID number");
                System.out.println("4.PYRAMID pattern *");
                System.out.println("5.EXIT");

                System.out.println("Enter the choice:");
                choice=sc.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("enter the size of the triangle:");
                        int row=0;
                        row=sc.nextInt();
                        printrightangledtriangle(row);
                        break;


                    case 2:
                        System.out.println("enter the size of the triangle:");
                        int row1=0;
                        row1=sc.nextInt();
                        printreveresedrightangledtriangle(row1);
                        break;


                    case 3:
                        System.out.println("enter the size of the triangle:");
                        int row2=0;
                        row2=sc.nextInt();
                        printpyramid(row2);

                        break;

                    case 4:
                        System.out.println("enter the size of the triangle:");
                        int row3=0;
                        row3=sc.nextInt();
                        printpyramid1(row3);
                        break;

                    case 5:
                        System.out.println("Exiting the menu");
                        break;

                    default:
                        System.out.println("INVALID CHOICE::::::");
                }



            }while(choice !=5);
        }
    }
    public static String readPasswordMasked() {
        try {
            StringBuilder password = new StringBuilder();
            java.io.Console console = System.console();
            if (console != null) {
                // Terminal environment
                return new String(console.readPassword());
            }

            // IDE fallback
            java.io.InputStream in = System.in;
            while (true) {
                int ch = in.read();
                if (ch == '\n' || ch == '\r') {
                    System.out.println(); // move to next line
                    break;
                } else if (ch == 127 || ch == 8) { // handle backspace
                    if (password.length() > 0) {
                        password.setLength(password.length() - 1);
                        System.out.print("\b \b");
                    }
                } else {
                    password.append((char) ch);
                    System.out.print("*");
                }
            }
            return password.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static void printrightangledtriangle(int row)
    {
        System.out.println("\nRight angled triangle printing\n");
        int count=1;
        for(int i=0;i<row;i++)
        {
            for(int j=row-i-1;j<row;j++)
            {
                System.out.print((count++)+" ");
            }
            System.out.println();
        }
    }

    public static void printreveresedrightangledtriangle(int row)
    {
        System.out.println("\nReveresed Right angled triangle printing\n");
        int count=1;
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d", count++);//%3d will make it print the number in 3 character space
            }
            System.out.println();
        }
    }

    public static void printpyramid(int row)
    {
        System.out.println("\nPyramid printing\n");
        int count=1;
        for (int i = 1; i <= row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print((count++)+" ");
            }
            System.out.println();
        }

    }

    public static void printpyramid1(int row)
    {
        System.out.println("\nPyramid printing\n");
        int count=1;
        for (int i = 1; i <= row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static boolean verifyuser(String u , String p)
    {
        String[] user={"msis","user","student"};
        String[] passward={"msis","name","hello"};
        for (int i = 0; i < user.length; i++) {
            if (user[i].equals(u)) {
                if (passward[i].equals(p)) {
                    return true; // username and password match at same index
                } else {
                    return false; // username found, but password doesn't match
                }
            }
        }
        return false;
    }
}
