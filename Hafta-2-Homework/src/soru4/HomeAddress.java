package soru4;

public class HomeAddress implements Address{

	public HomeAddress(String sehir,String mahalle,String sokak) {
		super();
	}
	
	@Override
	public String toString() {
		return "HomeAddress [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}
