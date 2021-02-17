package soru4;

import java.util.Date;

public abstract class Insurance {
	
	public String sigortaİsmi;
	public double ücret;
	public Date sigortaBaslangıc;
	public Date sigortaBitis;
	
	
	 abstract double calculate(double ratio);
	

}
