
public class Hora {
  private int h, m, s;
  
  public Hora() {
	  h=0; m=0; s=0;
  }
  
  public Hora(int h,int m, int s) { 
	  this.h=h; this.m=m; this.s=s;
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
	  if (h >=0 || h <=23) {
		  this.h=h;
	  }else {
		  throw new HourOutOfRangeException();
	  }
  }
  
  public void setMinut(int m)throws MinutOutOfRangeException { 
	  if (m >=0 || m <=59) {
		  this.m=m;
	  } else {
		 throw new MinutOutOfRangeException();
	  }
  }
  
  public void setSegon(int s)throws SegonOutOfRangeException { 
	  if (s >=0 || s <=59) {
		  this.s=s;
	  } else {
		  throw new SegonOutOfRangeException();
	  }
  }
  
  public String toString() { 
	  return h+":"+m+":"+s;         
  }
  
}
