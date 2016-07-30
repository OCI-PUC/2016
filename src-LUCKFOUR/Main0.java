import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// cantidad de enteros a recibir
		int T = s.nextInt();
		s.nextLine();

		for (int i = 0; i < T; i++) {

			String n = s.nextLine();
			int cuatros = 0; // contador de cuatros

			for (int j = 0; j < n.length(); j++) {
				if (n.charAt(j) == '4'){
					cuatros++;
				}
			}

			// forma alternativa usando String
			// for (char temp: n.toCharArray()) {
			// 	if (temp == '4'){
			// 		cuatros++;
			// 	}
			// }

			System.out.println(cuatros);
		}
  }
}
