package lab2;
import java.util.*;
public class Exe1 {
	int getSecondSmallest(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr[1];
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe1 ob=new Exe1();
		System.out.println("enter no of elements in an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Second smallest element is "+ob.getSecondSmallest(arr));
		sc.close();

	}

}
