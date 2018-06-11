package com.juurivuohi.testailua;

import java.util.HashMap;

public class Online {
	private HashMap<Henkilo, Boolean> kayttaja = new HashMap<Henkilo, Boolean>();

	public Online() {
	}

	public void setOnline(HashMap<Henkilo, Boolean> kayttaja) {
		this.kayttaja = kayttaja;
	}

	@Override
	public String toString() {
		String toStringPalaute = "";
		for (Henkilo key : kayttaja.keySet()) {
			toStringPalaute += "\n\n\nONLINE: " + kayttaja.get(key) + "\n" + key;
		}
		return toStringPalaute;
	}
}
