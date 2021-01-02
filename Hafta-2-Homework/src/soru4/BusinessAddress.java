package soru4;

public class BusinessAddress implements Address{
	
	public BusinessAddress(String sehir,String mahalle,String sokak) {
		super();
	}
	
	@Override
	public String toString() {
		return "BusinessAddress [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
