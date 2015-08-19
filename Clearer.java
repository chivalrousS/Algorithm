import java.util.*;

public class Clearer {
	public static int[][] clearZero(int[][] mat,int n)
	{
		boolean[] row = new boolean[n];
		boolean[] column = new boolean[n];
		
		for(int i = 0;i < n;++i)
		{
			for(int j = 0;j < n;++j)
			{
				if(mat[i][j] == 0)
				{
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0;i < n;++i)
		{
			for(int j = 0;j < n;++j)
			{
				if((row[i] == true)||(column[j] == true) )
					mat[i][j] = 0;
			}
		}
		return mat;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
