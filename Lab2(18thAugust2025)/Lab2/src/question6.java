//Assignement question 5 , print the Floyd's triangle
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for Floyd's Triangle: ");
        int row = sc.nextInt();
        Floydtriangle(row);
        System.out.println();
        Floydtriangle2(row);
    }
    public static void Floydtriangle(int row) {
        System.out.println("\nFloyd's Triangle:");
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void Floydtriangle2(int row) {
        System.out.println("Alternative Floyd's Triangle (0s and 1s):");
        int value = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((value % 2) + " ");
                value++;
            }
            System.out.println();
        }
    }
}

