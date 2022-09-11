import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 1;
		int x;
		
		System.out.println("Digite até quanto você quer que a sequência continue: ");
		x = sc.nextInt();
		
		do {
			System.out.print(i + ", ");
			j = i+j;
			i = j-i;
		} while (i < x);
		System.out.println(i);
		sc.close();
	}
}
