//question 3 in the assignment , where i have to bring all the positive numbers to the right and all the negative numbers to the left


import java.util.Scanner;

public class question4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        sort(arr,n);

        System.out.println("The array element:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }

    }
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
