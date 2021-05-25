import java.util.Scanner;
public class MaximumSubArraySum
{
    public static void main(String args[])
    {
        int num,i,meh = 0,msf = Integer.MIN_VALUE;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int []arr = new int[num];
        System.out.println("Enter the elements : ");
        for(i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i = 0;i<arr.length;i++)
        {
            meh = meh + arr[i];
            if(meh < arr[i])
                meh = arr[i];
            if(meh > msf)
                msf = meh;
        }
        System.out.println(msf);
       
    }
}
