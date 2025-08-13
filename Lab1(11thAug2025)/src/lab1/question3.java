package lab1;

public class question3 {
    public static void main(String[] args) {
        //take n number of arguments from the command line
        int size= args.length;
        //printing the numbers
        for(int i=0;i<size;i++)
        {
            System.out.println(args[i]);
//            System.out.println("\n");
        }
        //finding the sum
        int sum=0;
        for (int i=0;i<size;i++)
        {
            int a=Integer.parseInt(args[i]);
            sum=sum+a;
        }
        System.out.println("\n"+sum);
        assert(sum==55);
    }
}
