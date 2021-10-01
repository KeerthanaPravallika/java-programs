import java.util.Scanner;
public class prime
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n;
        boolean prime = true;
        System.out.print("Enter a number : ");
        n = scan.nextInt();
        for(int i=2 ; i <= n/2 ; i++)
        {
            if(n%i == 0)
            {
                prime = false;
                break;
            }           
        }
        if(prime)
        {
            System.out.println("it's prime");
        }
        else
        {
            System.out.println("it's not prime");
        }
        scan.close();
    }
}
