import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int i = 0;
		int ventanas[] = new int[N];
		// inicializarlo a 0
		for(int j=0; j<N; j++) {
			ventanas[j] = 0;
		}
		
		String linea;
		sc.nextLine();
		while (i < K) {
			linea = sc.nextLine();
			String partes[] = linea.split(" ");
			if(partes[0].equals("CLICK")) {
				// abro o cierro
				int b = Integer.parseInt(partes[1]);
				if(ventanas[b-1] == 0) {
					ventanas[b-1] = 1;
				}
				else {
					ventanas[b-1] = 0;
				}
			}
			else {
				// cierro todo
				for(int j=0; j<N; j++) {
					ventanas[j] = 0;
				}
			}
			int abiertas = 0;
			for(int j=0; j<N; j++) {
				abiertas = abiertas + ventanas[j];
			}
			System.out.println(abiertas);
			
			i = i + 1;     // otra manera: i++
		}
  }
}