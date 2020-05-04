import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int flag=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)!='n' && str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' &&                     str.charAt(i)!='u')
            {
                if(str.charAt(i+1)!='a' && str.charAt(i+1)!='e' && str.charAt(i+1)!='i' && str.charAt(i+1)!='o' &&                                                                          str.charAt(i+1)!='u')
                {
                    flag=1;
                    break;
                }
            }
        }
        if(str.charAt(str.length()-1)!='n' && str.charAt(str.length()-1)!='a' && str.charAt(str.length()-1)!='e'
                && str.charAt(str.length()-1)!='i' && str.charAt(str.length()-1)!='o' && str.charAt(str.length()-1)!='u')
        {
            flag=1;
        }
        if(flag==1)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}
    

