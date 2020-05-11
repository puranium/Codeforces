import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		for(int i = 0; i<k; i++) {
			int n = s.nextInt();
			int b = 0;
			
			while(n>1) {
				b = b+1;
				int a = 2;
				do {
					n = n-a;
					a = a+3;
				}
				while(n>a-1);
			}
			System.out.println(b);
		}
	}
 
}