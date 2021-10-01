import java.util.Scanner;

public class arm_num 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n, sum=0;
        System.out.print("enter any number : ");
        n = scan.nextInt();

        int m=n;

        while(n > 0)
        {
            sum += Math.pow(n%10, 3);
            n /= 10;
        }
        if(m == sum)
        {
            System.out.println(m+ " is an armstrong number.");
        }
        else
        {
            System.out.println(m+ "is not an armstrong number.");
        }
        scan.close();

    }
}
