package lab2;
import java.util.Scanner;
import java.util.Arrays;
public class Exe2 {
	static int n;
	String[] sortStrings(String[] str)
	{
		String[] result=new String[n];
		Arrays.sort(str);
		int k;
		if(n%2==0)
		{
			k=n/2;
		}
		else
		{
			k=n/2+1;
		}
		for(int j=0;j<k;j++)
		{
			result[j]=str[j].toUpperCase();
		}
		
		for(int i=k;i<n;i++)
		{
			result[i]=str[i].toLowerCase();
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Exe2 ob=new Exe2();
		System.out.println("Enter number of elements in string array");
		n=sc.nextInt();
		System.out.println("Enter thr strings");
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		String[] result=ob.sortStrings(str);
		for(int i=0;i<n;i++)
		{
			System.out.println(result[i]);
		}
		
		sc.close();
	}

}
