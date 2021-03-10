package de.dhbw.uebungsblatt1client;

public class Bestellposition {
	public Long bestellposNr;
	public Long bestellungsNr;
	public String artikelNr;
	public String anzahl;
	public Bestellposition(){
	
	}
	
	public Bestellposition(Long bestellposNr, Long bestellungsNr, String artikelNr, String anzahl){
		this.bestellposNr = bestellposNr;
		this.bestellungsNr = bestellungsNr;
		this.artikelNr = artikelNr;
		this.anzahl = anzahl;
	}
	public String toString(){
		return "Bestellposition: " + bestellposNr + " Bestellungsnr. "+ bestellungsNr + " Artikelnummer: " + artikelNr + "Anzahl: " + anzahl;
	}
}
