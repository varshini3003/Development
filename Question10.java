/*
 * Print using 2-D array
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 */
public class Question10 {
	public static void main(String[] args)
	{
		int[][] arr = new int[4][4];
		arr[0][0]=1;
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(j!=0)
				{
					arr[i][j]=arr[i][j-1]+1;
				}	
				if(i>0 && j==0)
				{
					arr[i][j]=arr[i-1][3]+1;
				}
			}
		}
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}