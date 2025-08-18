// Question 1 in the assignment , find the duplicate value of an array of integer values
//this will print all the repeating number and the index for the same
import java.util.Scanner;

public class question2 {
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
        printarray(arr,n);
        checkduplicate(arr,n);
    }

    public static void printarray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void checkduplicate(int[] arr,int n)
    {
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("The element "+arr[i]+" is repeating in index "+i+" and "+j);
                    flag=1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("No repeating elements");
            return;
        }

    }
}
