import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float altura;
		float peso;
		float imc;
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextFloat();
		System.out.println("Digite seu peso: ");
		peso = sc.nextFloat();
		
		imc = peso / (altura * altura);
		
		if (imc <= 18.5) {
			System.out.println("Você está abaixo do peso");
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Você está saudável");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Você está com peso em excesso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Você está em Grau I de obesidade");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Você está em Grau II de obesidade");
		} else {
			System.out.println("Você está em Grau III de obesidade");
		}
		
		sc.close();
	}
}
