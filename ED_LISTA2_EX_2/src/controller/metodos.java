package controller;

public class metodos {
 
	public metodos () {
		super();
	}
	public int resto(int dividendo, int divisor)
	 {
	  if(dividendo < divisor)
	  {
	   return dividendo;
	  }
	  else
	  {
	   return resto(dividendo - divisor, divisor);
	  }
	 }

}
