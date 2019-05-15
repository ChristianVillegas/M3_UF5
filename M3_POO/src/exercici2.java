import java.io.*;

public class exercici2 {

	public static void main(String[] args) throws IOException {
		int A, B;

		try {
			System.out.print("Escriu un número entre 1 i 100: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String n1 = reader.readLine();
			A = Integer.parseInt(n1);

			System.out.print("Escriu un altre número entre 1 i 100: ");
			String n2 = reader.readLine();
			B = Integer.parseInt(n2);

			int total = A % B;

			multiple(A);
			interval(A, B);

			System.out.println("El residu de la divisió entre " + A + " i " + B + " és: " + total);

		} catch (Mult10Exception multiplo) {
			System.out.println("Error! El dividend introduït no és múltiple de 10.");
		} catch (ForaIntervalException rango) {
			System.out.println("Error! Els números introduïts estan fora de l'interval (1-100).");
		}
	}

	public static void multiple(int A) throws Mult10Exception {
		if (A % 10 != 0) {
			throw new Mult10Exception();
		}
	}

	public static void interval(int A, int B) throws ForaIntervalException {
		if ((A < 1 || A > 100) || (B < 1 || B > 100)) {
			throw new ForaIntervalException();
		}
	}
}
