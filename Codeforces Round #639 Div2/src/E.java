import java.util.Scanner;
public class E {
	static int res = 0;
	static int con = 0;
	static int rtn = 0;
	public static int dfs(int[][] arr, int[] b, int c) {
		b[c] = 1;
		int l = arr.length;
		for(int i=1; i<l; i++) {
			if(arr[c][i] == 1 && b[i]>0) {
				rtn = i;
			}
			if(arr[c][i] == 1 && b[i] == 0) {
				dfs(arr, b, i);
			}
			else if(arr[c][i] == 1 && b[i] == 2) {
				con = 1;
			}
			
		}
		return rtn;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		int[] x = new int[n+1];
		int[][] grp = new int[n+1][n+1];
		for(int i=0; i<k; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			grp[a][b] = 1;
		}
		
		for(int i=1; i<n+1; i++) {
			if(x[i] == 0) {
				int t = dfs(grp, x, i);
				if(t == i) 
					res = -1;
				x[i] = 2;
				rtn = 0;
				if(con == 1) {
					x[i] = 1;
					con = 0;
				}
			}
 
			
		}
		int num = 0;
		for(int i=1; i<n+1; i++) {
			if(x[i] == 2)
				num++;
		}
		if(res == -1)
			System.out.println("-1");
		else {
			System.out.println(num);
			for(int i=1; i<n+1; i++) {
				if(x[i] == 2)
					System.out.print("A");
				else
					System.out.print("E");
			}
		}
			
		
	}
 
}