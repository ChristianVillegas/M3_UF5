import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WriteToFileExample1 {
	public static void main(String[] args){
		BufferedReader br = null;
		FileReader fr = null;
		System.out.println("Entra la ruta de l'arxiu");
		java.util.Scanner lector = new java.util.Scanner(System.in);
		String Filename = lector.nextLine();
		try {
			fr = new FileReader(Filename);
			br = new BufferedReader(fr);
			String linia;
			br = new BufferedReader(new FileReader(new File(Filename)));
			while ((linia = br.readLine()) != null) {
				System.out.println(linia);
			}
		} catch (FileNotFoundException f) {
			System.out.println("El fitxer o directori no existeix");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lector.close();
		}
	}
}