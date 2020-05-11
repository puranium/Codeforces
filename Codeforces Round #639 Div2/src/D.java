import java.util.Scanner;
public class D {
	public static void dfs(int[][] arr, int i, int j) {
		arr[i][j] = 3;
		if(arr.length-1>i)
			if(arr[i+1][j] == 1)
				dfs(arr, i+1, j);
		if(arr[0].length-1>j)
			if(arr[i][j+1] == 1)
				dfs(arr, i, j+1);
		if(i>0)
			if(arr[i-1][j] == 1)
				dfs(arr, i-1, j);
		return;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		s.nextLine();
		int[][] grid = new int[n][m];
		for(int i = 0; i<m; i++) {
			String str = s.nextLine();
			for(int j = 0; j<n; j++) {
				char a = str.charAt(j);
				if(a == '.')
					grid[j][i] = 0;
				else
					grid[j][i] = 1;
			}			
		}
		int bl = 0;
		for(int j=0; j<m; j++) {
			for(int i=0; i<n; i++) {
				if(grid[i][j] == 1) {
					dfs(grid, i, j);
					bl = bl + 1;
				}
			}
		}
		int r = 0;
		for(int j=0; j<m; j++) {
			int bwb = 0;
			for(int i=0; i<n; i++) {
				if(bwb == 0) {
					if(grid[i][j] == 3)
						bwb = 1;
				}
				else if(bwb == 1) {
					if(grid[i][j] == 0)
						bwb = 2;
				}
				else if(bwb == 2) {
					if(grid[i][j] == 3)
						r = 1;
				}
			}
		}
		for(int i=0; i<n; i++) {
			int bwb = 0;
			for(int j=0; j<m; j++) {
				if(bwb == 0) {
					if(grid[i][j] == 3)
						bwb = 1;
				}
				else if(bwb == 1) {
					if(grid[i][j] == 0)
						bwb = 2;
				}
				else if(bwb == 2) {
					if(grid[i][j] == 3)
						r = 1;
				}
			}
		}
		int row = 1;
		int col = 1;
		for(int j=0; j<m; j++) {
			int b = 0;
			for(int i=0; i<n; i++) {
				if(b==0)
					if(grid[i][j] == 3)
						b = 1;
			}
			if(b==0)
				row = 0;
 
		}
		for(int i=0; i<n; i++) {
			int b = 0;
			for(int j=0; j<m; j++) {
				if(b==0)
					if(grid[i][j] == 3)
						b = 1;
			}
			if(b==0)
				col = 0;
 
		}
		if(row != col)
			r = 1;
		
		if(r == 1)
			System.out.println("-1");
		else
			System.out.println(bl);
		
		
	}
 
}