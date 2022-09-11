import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int num;
		int soma = 0;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}