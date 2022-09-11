import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		int denominador = 0;
		double soma = 0;
		do {
			System.out.println("Digite uma idade");
			idade = sc.nextInt();
			soma += idade;
			if (idade != 0) {
				denominador += 1;
			}
		} while (idade != 0);
		System.out.println(soma / denominador);
		sc.close();
	}
}