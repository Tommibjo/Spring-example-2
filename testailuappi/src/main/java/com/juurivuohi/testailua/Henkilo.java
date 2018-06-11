package com.juurivuohi.testailua;

import java.util.ArrayList;

public class Henkilo {
	private int HTT;
	private String etunimi;
	private String sukunimi;
	private ArrayList<String> ostoskori;
	private LaskutusTiedot laskutustiedot;

	public Henkilo(int HTT, String etunimi, String sukunimi, ArrayList<String> ostoskori,
			LaskutusTiedot laskutustiedot) {
		this.HTT = HTT;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.ostoskori = ostoskori;
		this.laskutustiedot = laskutustiedot;
	}

	public void kaynnistyessa() {
		System.out.println("Luodaan Henkilo objekti");
	}

	public void havitessa() {
		System.out.println("Suljetaan Henkilo objekti");
	}

	@Override
	public String toString() {
		String ostokoriNatimmin = "";
		for (int i = 0; i < this.ostoskori.size(); i++) {
			ostokoriNatimmin += this.ostoskori.get(i) + "\n";
		}

		return "-----------\nHenkilo : \n STT: " + HTT + "\n etunimi: " + etunimi + "\n sukunimi: " + sukunimi
				+ "\n\nostoskori:\n" + ostokoriNatimmin + laskutustiedot.toString();
	}
}
