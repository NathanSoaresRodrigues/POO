import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2;
		System.out.println("Digite uma nota: ");
		n1 = sc.nextFloat();
		System.out.println("Digite outra nota: ");
		n2 = sc.nextFloat();
		if (n1 >= 0.0 && n1 <= 10.0) {
			if (n2 >= 0.0 && n2 <= 10.0) {
				System.out.println("A média do aluno é: " + (n1 + n2)/2);
			} else {
				System.out.println("N2 é maior que 10 ou menor que 0.");
			}
		} else {
			System.out.println("N1 é maior que 10 ou menor que 0.");
		}
		sc.close();
	}
}
