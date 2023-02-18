/*
 * Selection sort
 */
import java.util.*;
public class Question7 {
	public static void print(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n-1; i++)
		{
			int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
            	
                if (arr[j] < arr[min_idx])
                {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
		}
		System.out.println("Ascending order: ");
		print(arr);
		for (int i = 0 ;i<n-1; i++)
		{
			int min = i;
			for (int j = i+1; j<n; j++)
			{
				if (arr[j] > arr[min])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println("\nDescending order: ");
		print(arr);
	}
}
