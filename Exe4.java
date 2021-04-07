package lab2;
import java.util.Scanner;

public class Exe4 {
	static int k;
	int[] modifyArray(int[] arr)
	{
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		result[0]=arr[0];
		k=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]!=arr[i])
			{
				
				result[k]=arr[i];
				k++;
				
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe4 ob=new Exe4();
		System.out.println("enter no of elements in an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] result=ob.modifyArray(arr);
		for(int i=0;i<k;i++)
		{
			System.out.print(result[i]+" ");
		}
		sc.close();
	}

}
