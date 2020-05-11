import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		for(int i=0; i<k; i++) {
			int n = s.nextInt();
			int m = s.nextInt();
			if(n == 1 || m == 1)
				System.out.println("YES");
			else if(n == 2 && m == 2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
 
}