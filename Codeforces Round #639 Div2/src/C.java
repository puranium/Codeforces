import java.util.Scanner;
public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		for(int i=0; i<k; i++) {
			int n = s.nextInt();
			int[] inp = new int[n];
			int[] ck = new int[n];
			int x;
			boolean hey = true;
			
			for(int j=0; j<n; j++){
				ck[j] = 1;
			}
 
			for(int j=0; j<n; j++) {
				inp[j] = s.nextInt();
				x = j + Math.floorMod(inp[j], n);
				if(x<n) {
					if(ck[x]==0)
						hey = false;
					else ck[x] = 0;
				}
				else {
					if(ck[x-n]==0)
						hey = false;
					else ck[x-n] = 0;
				}
			}
			if(hey==true)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
	}
 
}