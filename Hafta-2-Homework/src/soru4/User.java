package soru4;

import java.util.Date;
import java.util.List;

public class User {
	

	private String isim;
	private String soyisim;
	private String email;
	private String sifre;
	private String meslek;
	private int yas;
	private List<Address> adres;
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public String getMeslek() {
		return meslek;
	}
	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public List<Address> getAdres() {
		return adres;
	}
	public void setAdres(List<Address> adres) {
		this.adres = adres;
	}
	public Date getSonGiris() {
		return sonGiris;
	}
	public void setSonGiris(Date sonGiris) {
		this.sonGiris = sonGiris;
	}
	private Date sonGiris;


	@Override
	public String toString() {
		return "User [isim=" + isim + ", soyisim=" + soyisim + ", email=" + email + ", sifre=" + sifre + ", meslek="
				+ meslek + ", yas=" + yas + ", adres=" + adres + ", sonGiris=" + sonGiris + "]";
	}


	
}
