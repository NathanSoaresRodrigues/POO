
public class Q8 {
	public static void main (String[] args) {
		float altChico = (float) 1.50;
		float altZe = (float) 1.10;
		int i = 0;
		do {
			altChico = (float) (altChico + 0.02);
			altZe = (float) (altZe + 0.03);
			i += 1;
		} while (altChico != altZe);
		System.out.println("Levará " + i + " anos para eles terem a mesma altura.");
	}
}
