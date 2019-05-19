package verduleria;
import java.io.*;
import java.util.*;

public class Tenda {
	static BufferedReader reader;
	public static void main(String[] args) throws IOException{
		reader = new BufferedReader(new InputStreamReader(System.in));
		//Heu de definir una variable que serà la cua. 
		//Heu de decidir la cua de què serà? Quins elements contindrà la cua?
		//Quin tipus de dades?

		//TODO Definició dades
		ArrayList cua = new ArrayList();

		//Pintar menu
		int operacio=0;	
		while(operacio!=5){
			System.out.println("---VERDURES AUSTRIA ----");
			System.out.println("1) Afegir cua ");
			System.out.println("2) Quanta gent hi ha ");
			System.out.println("3) LListar cua");
			System.out.println("4) Següent");
			System.out.println("5) Sortir");
			String linia = reader.readLine();
			switch(linia){
			case "1":
				//TODO Afegir argument que correspongui
				if (afegirClient(cua)){
					//TODO Completar missatge se li ha de dir el torn. Si sóc l'últim, m'afegeixo a la cua i llavors hi ha 5 persones. Quin és el meu torn?
					if (cua.size() == 1) {
						System.out.println("Client afegit, tens el torn " + cua.size() + ".");
					} else if (cua.size() == 2) {
						System.out.println("Client afegit, tens el torn " + cua.size() + ". Hi ha 1 persona davant teu.");
						} else {
							System.out.println("Client afegit, tens el torn " + cua.size() + ". Hi han " + (cua.size()- 1) + " persones davant teu.");
						}
				}
				else{
					System.out.println("Ha hagut un problema amb la inserció del client, torna-ho a provar. Disculpa.");
				}
				break;
			case "2":
				//TODO Pintar quants elements hi ha a la cua. Quin és l'equivalent al length dels arrays?
				elementsTotals(cua);
				break;
			case "3":
				//TODO Pintar tots els clients de la cua. Amb un ArrayList ens cal pintar element a element, en un for? Quin mètode ens ho pinta tot? O no és un mètode?
				elementsClients(cua);
				break;
			case "4":
				//TODO Si la cua �s m�s gran que zero es diu el nom del seg�ent client i se'l treu de la cua 
				next(cua);
				break;
			default:
				operacio=5;
				System.out.println("Adeu, bon dia tingui!");
			}
		}

	}

	//Creació d'un nou mètode que afegeix un Client a la cua. 
	//TODO Rep el scanner ha de rebre alguna cosa més?
	public static boolean afegirClient(ArrayList<Client> cua){
		try{
			System.out.println("Quin �s el nom del client?");
			String nom = reader.readLine();

			System.out.println("Quin �s el dni del client?");
			String dni = reader.readLine();


			System.out.println("Quina �s la direcci� del client?");
			String direccio = reader.readLine();

			//TODO Aquí s'ha de crear el nou client 
			Client client = new Client(dni, nom, direccio);
			
			//TODO S'ha d'afegir el nou client a la cua
			cua.add(client);

			//Si falla per excepció ja no tornarà true
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	public static void elementsTotals(ArrayList<Client> cua) {
		if (cua.size() == 1) {
			System.out.println("En total hi ha " + cua.size() + " client.");
		} else if (cua.size() > 1) {
			System.out.println("En total hi han " + cua.size() + " clients.");
		} else {
			System.out.println("En aquests moments no hi han clients.");
		}
	}
	
	public static void elementsClients(ArrayList<Client> cua) {
		for (int i = 0; i < cua.size(); i++) {
			System.out.println(cua.get(i));
		}
	}
	
	public static void next(ArrayList<Client> cua) {
		if (cua.size() > 0) {
			for (int i = 0; i < cua.size(); i++) {
				System.out.println("Seg�ent: " + cua.get(1));
				cua.remove(0);
			}
			
		}
	}
}
