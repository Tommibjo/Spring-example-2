package com.juurivuohi.testailua;

public class LaskutusTiedot {
	private String osoite;
	private int maksuaika;
	private int saldo;

	public LaskutusTiedot(String osoite, int maksuaika, int saldo) {
		this.osoite = osoite;
		this.maksuaika = maksuaika;
		this.saldo = saldo;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public void setMaksuaika(int maksuaika) {
		this.maksuaika = maksuaika;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\nLaskutusTiedot: \n osoite: " + osoite + "\n maksuaika: " + maksuaika + "\n saldo: " + saldo;
	}
}
