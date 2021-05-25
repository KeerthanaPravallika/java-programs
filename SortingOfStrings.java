import java.util.Scanner;
public class SortingOfStrings{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String tmp;
        int i,j,n;
        System.out.println("Enter the number of names you want to enter : ");
        n = scan.nextInt();
        String[] arr = new String[n];
        for(i=0;i<n;i++)
        {
            try
            {
                System.out.println("Enter the string "+(i+1)+" : ");
                arr[i] = scan.next();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(arr[j].compareTo(arr[j+1]) > 0)
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println("After sorting : ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}



