import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x;
		float n1;
		float n2;
		
		System.out.println("Digite uma das operações:");
		System.out.println("+ para soma");
		System.out.println("- para subtração");
		System.out.println("* para multiplicação");
		System.out.println("/ para divisão");
		x = sc.next().charAt(0);
		
		if (x == '+' || x == '-' || x == '*' || x == '/') {
			System.out.println("Digite dois números que deseja realizar a operação: ");
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			switch (x) {
			case '+':
				System.out.println("A soma é: " + (n1+n2));
				break;
			case '-':
				System.out.println("A subtração é: " + (n1-n2));
				break;
			case '*':
				System.out.println("A multiplicação é: " + (n1*n2));
				break;
			case '/':
				if (n2 != 0) {
					System.out.println("A divisão é: " + (n1/n2));
				} else {
					System.out.println("Denominador é igual a 0.");
				}
				break;
			default:
				System.out.println("Operação inválida");
				break;
			}
		}
		sc.close();
	}
}