
public class App {
public static void main (String args[])
{
	int[] values= {3,5,2343};
	System.out.println(values);
	int[][] grid= {{2,3,2343},{2,3},{4,5,6}};
	for(int row=0;row<grid.length;row++) //grid.length will give rows length
	{
		for(int col=0;col<grid[row].length;col++)
		{
			System.out.println(grid[row][col]);
		}
	}
	int[][] grid2=new int[2][];
	System.out.println(grid2[0]);
 grid2[0]= new int[2];
 System.out.println(grid2[0]);
	grid2[0][0]=1;
	System.out.println(grid2[0][1]);

	
	}

}
