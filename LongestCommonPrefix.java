import java.util.Scanner;

public class LongestCommonPrefix
{
	public static void main(String[] args) {
	    int n,i;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
		String strs[] = new String[n];
		for(i=0;i<n;i++)
		{
		    strs[i] = sc.next();
		}
        String prefix = strs[0]; 
        for(i = 0;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println("Longest Common Prefix : "+prefix);
	}
}
