import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		int j;
		int n;
		int num = 1;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num += 1;
			}
			System.out.println();
		}
	}
}