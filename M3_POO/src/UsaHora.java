
public class UsaHora {

	  public static void main(String[] args) {
		  Hora time;
		  try {
			  time = new Hora(12,11,25);
			  System.out.println(time.toString());
		  } catch (HourOutOfRangeException horamala) {
			  System.out.println(horamala.getMessage());
		  }
	  }
}
