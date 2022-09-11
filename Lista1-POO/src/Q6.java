import java.util.Scanner;
import java.util.Random;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		
		int soma = 0;
		int i = 0;
		int acerto = 0;
		int a = 0, b = 0;
		
		for (i = 0; i < 5; i++) {
			a = rdm.nextInt(100);
			b = rdm.nextInt(100);
			System.out.println("Qual a soma: "  + a + "+" + b + "?");
			soma = sc.nextInt();
			if (soma == a + b) {
				System.out.println("Você acertou!");
				acerto += 1;
			} else {
				System.out.println("Você errou, a resposta era: " + (a + b));
			}
			soma = 0;
		}
		System.out.println("Você acertou " + acerto + " de 5!");
		
		sc.close();
	}
}
