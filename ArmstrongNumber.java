import java.util.Scanner;
public class ArmstrongNumber
{
    public static void main(String args[])
    {
        int num,i,tmp,d,sumOfCubes=0;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        tmp = num;
        while(num!=0)
        {
            d = num%10;
            sumOfCubes = sumOfCubes + (d*d*d);
            num = num/10;
        }
        if(tmp == sumOfCubes)
            System.out.println("It is a Armstrong Number");
        else
            System.out.println("It is not a Armstrong Number");
       
    }
}



