import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numero;
		
		System.out.println("Digite um numero de 3 algarismos:");
		numero = sc.nextLine();
		
		String nSplit[] = numero.split("");
		
		int vetor[] = new int[nSplit.length];
		
		int res = 0;
		
			for (int i = 0; i < nSplit.length; i++) {
				vetor[i] = Integer.parseInt(nSplit[i]);
				
				res += vetor[i];
			}
			
			System.out.println("Resultado da soma: " + res);
			
			sc.close();
			
	}
}