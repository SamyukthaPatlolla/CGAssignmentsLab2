package lab2;
import java.util.*;

public class Exe3 {
	
	
	int[] getSorted(int[] arr)
	{
		int rev[]=new int[arr.length];
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			rev[j]=arr[i];
			j--;
		}
		for (int i=0;i<rev.length;i++)
		{
			for(int k=i+1;k<rev.length;k++)
			{
				if(rev[i]>rev[k])
				{
					int temp=rev[i];
					rev[i]=rev[k];
					rev[k]=temp;
				}
			}
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe3 ob=new Exe3();
		System.out.println("enter no of elements in an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] rev=ob.getSorted(arr);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(rev[i]+" ");
		}
		
		sc.close();
	}

}
