//question 2 in the assignment finding the kth largest and smalled element


import java.util.Scanner;

public class question3 {
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

        System.out.println("enter kth ?");
        int k=sc.nextInt();
        sort(arr,n);
        System.out.println("kth Smallest element: " + arr[k - 1]);
        System.out.println("kth Largest element: " + arr[n - k]);
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
