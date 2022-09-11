import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		int tempoDeServico;
		boolean casoExtra = true;
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Digite há quanto tempo você trabalha: ");
		tempoDeServico = sc.nextInt();
		
		casoExtra = (idade >= 60 && tempoDeServico >= 25);
		
		if (idade >= 65 || tempoDeServico >= 30 || casoExtra == true) {
			System.out.println("Você pode se aposentar!");
		} else {
			System.out.println("Você ainda não pode se aposentar!");
			System.out.println(casoExtra);
		}
		sc.close();
	}
}
