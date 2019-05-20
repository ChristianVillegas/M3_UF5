
public class Hora {
  private int h, m, s;
  
  public Hora() {
	  h=0; m=0; s=0;
  }
  
  public Hora(int h,int m, int s) throws HourOutOfRangeException { 
	  try {
		  setHora(h);
		  setMinut(m);
		  setSegon(s);
	  } catch (HourOutOfRangeException f) {
		  throw new HourOutOfRangeException(f.getMessage());
	  }
  }
  
  public int getHora() {
	  return h;                     
  }
  
  public int getMinut() { 
	  return m;                     
  }
  
  public int getSegon() { 
	  return s;                     
  }
  
  public void setHora(int h)throws HourOutOfRangeException { 
	  if (h >=0 && h <=23) {
		  this.h=h;
	  }else {
		  throw new HourOutOfRangeException("Error! Hora incorrecta.");
	  }
  }
  
  public void setMinut(int m)throws HourOutOfRangeException { 
	  if (m >=0 && m <=59) {
		  this.m=m;
	  } else {
		 throw new HourOutOfRangeException("Error! Minut incorrecte.");
	  }
  }
  
  public void setSegon(int s)throws HourOutOfRangeException { 
	  if (s >=0 && s <=59) {
		  this.s=s;
	  } else {
		  throw new HourOutOfRangeException("Error! Segon incorrecte.");
	  }
  }
  
  public String toString() { 
	  return h+":"+m+":"+s;         
  }
  
}
