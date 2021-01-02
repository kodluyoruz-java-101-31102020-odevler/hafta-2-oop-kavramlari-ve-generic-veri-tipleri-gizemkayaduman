package soru4;

import java.util.ArrayList;
import java.util.List;

public class AddressManager {

	public static void adresEkle(User user, Address address) {
		
			List<Address> adresListesi = new ArrayList<>();
			adresListesi.add(address);
		
	}
	
	public static void adresSil(User user, Address address) {
		
		user.getAdres().remove(address);
		
	}
}
