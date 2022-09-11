public class Q10 {
	public static void main(String[] args) {
		int i;
		int soma1 = 0;
		int soma2 = 0;
		int quadrado = 0;
		
		
		for (i = 1; i <= 100; i++) {
			quadrado = i * i;
			soma1 += quadrado;
			quadrado = 0;
		}
		System.out.println(soma1);
		
		
		for (i = 1; i <= 100; i++) {
			soma2 += i;
		}
		soma2 = soma2 * soma2;
		
		
		System.out.println(soma2);
		System.out.println(soma2-soma1);
	}
}