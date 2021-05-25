import java.util.Scanner;
public class MissingNumber
{
    public static void main(String args[])
    {
        int num,i,sumt=0,sumo=0;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int []arr = new int[num];
        System.out.println("Enter the elements : ");
        for(i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            sumt+=arr[i];
            sumo+=i;
        }
        sumo += i;
        System.out.println(sumo-sumt);
       
    }
}

