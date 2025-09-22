import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int count=0;
		    int n=sc.nextInt();
		    String s=sc.next();
		    StringBuilder sb=new StringBuilder(s);
		    for(int i=0;i<sb.length()-1;i++)
		    {
		        if(sb.charAt(i)==sb.charAt(i+1))
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
