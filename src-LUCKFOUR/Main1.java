import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		for (int i = 0; i < T; i++) {
			int n = s.nextInt();
			int cuatros = 0;

			while (n!=0) {
				if (n%10 == 4) {
					cuatros++;
				}
				n = n/10;
			}
			System.out.println(cuatros);
		}
  }
}
