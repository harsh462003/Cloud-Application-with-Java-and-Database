package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class question6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("enter a string value");
        String msg= sc.next();
        System.out.println("Received data is:"+msg);
        int count=0;
        char[] s=msg.toCharArray();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
            {
                count++;
            }
        }
        System.out.println("\n"+count);
    }
}

