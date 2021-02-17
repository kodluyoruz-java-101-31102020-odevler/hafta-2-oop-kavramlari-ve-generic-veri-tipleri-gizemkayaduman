package soru4;

import java.util.ArrayList;
import java.util.List;



public abstract class Account {
	
	private final AuthenticationStatus success = AuthenticationStatus.SUCCESS;
	private final AuthenticationStatus fail = AuthenticationStatus.FAIL;
	private AuthenticationStatus login = fail;
	private User user = new User();
	private List<Insurance> userSigortalari = new ArrayList();
	
	public Account(User user, AuthenticationStatus login, List<Insurance> userSigortalari) {
		this.user = user;
		this.login = login;
		this.userSigortalari = userSigortalari;
	}
	
	public final void showUserInfo() { 
		
		System.out.println("müşteri bilgileri: ");

		if(this.user != null) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("İsim : ");
			stringBuilder.append(this.user.getIsim());
			stringBuilder.append("Soyisim: ");
			stringBuilder.append(this.user.getSoyisim());
			stringBuilder.append("Son giris tarihi: ");
			stringBuilder.append(this.user.getSonGiris());
			System.out.println(stringBuilder.toString());
		}
		else {
			System.out.println("Kullanıcı bulunamadı!");
		}
	}	
	public void giris (String email, String sifre)  throws InvalidAuthenticationException {
		
		if(user.getEmail().equals(email) && user.getSifre().equals(sifre)) {
				login = success;
				System.out.println("Login işlemi başarılı!");
		}
		else {
			login = fail;
			System.out.println("Email yada sifre yanlis! Lütfen yeniden deneyiniz.");
		}
		
	}

	protected abstract void isInvalid();
		
		

}
