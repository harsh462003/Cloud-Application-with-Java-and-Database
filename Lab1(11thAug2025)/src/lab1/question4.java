package lab1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("enter a string value");
        String msg= sc.next();
        System.out.println("Received data is:"+msg);

        char[] s=msg.toCharArray();
        Arrays.sort(s);

        String finalmsg=new String(s);
        System.out.println(finalmsg);
    }
}
