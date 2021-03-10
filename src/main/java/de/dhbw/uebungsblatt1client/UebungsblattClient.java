package de.dhbw.uebungsblatt1client;


import com.sun.jdi.LongValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UebungsblattClient implements CommandLineRunner {
	@Autowired ArtikelInterface ArtikelService;
	@Autowired KundeInterface KundeService;
	@Autowired BestellungInterface BestellungService;
	@Autowired BestellpositionInterface BestellpositionService;
	
	public void run(String... commandlineArgs){
		
		System.out.println("Ausgabe aller Kunden");
		Collection<Kunde> alle = KundeService.getAll();
		System.out.println("Alle Kunden: ");
		System.out.println(alle);
		
		System.out.println("Ausgabe Kunde Nr. 2");
		Kunde kun = KundeService.get("1");
		System.out.println(kun);
		
		
		System.out.println("Ausgabe aller Bestellungen von Kunde Nr. 2");
		Bestellung best = BestellungService.get("0");
		Bestellung best1 = BestellungService.get("1");
		Bestellposition pos = BestellpositionService.get("0");
		Bestellposition pos1 = BestellpositionService.get("1");
		Bestellposition pos2 = BestellpositionService.get("2");
		Artikel art = ArtikelService.get("3");
		Artikel art1 = ArtikelService.get("2");
		Artikel art2 = ArtikelService.get("0");
		Artikel art3 = ArtikelService.get("1");
		Kunde kun1 = KundeService.get("2");
		System.out.println("Bestellung " + best.bestellungsNr + " für " + kun1.vorname + " "+ kun1.nachname);
		System.out.println(pos.anzahl + " x " + art.bezeichnung + " für je " + art.einzelpreis );
		System.out.println(pos1.anzahl + " x " + art1.bezeichnung + " für je " + art1.einzelpreis );
		System.out.println("Bestellung " + best1.bestellungsNr + " für " + kun1.vorname + " "+ kun1.nachname);
		System.out.println(pos2.anzahl + " x " + art2.bezeichnung + " für je " + art2.einzelpreis );
		
		
		System.out.println("Erweiterung des Programms Aufgabe 2b");
		
		Artikel kamm = ArtikelService.get("3");
		kamm.einzelpreis = 1.69f;
		Artikel kamm2 = ArtikelService.put("3", kamm);
		System.out.println("Preis von Artikel Kamm auf 1,69 erhöht" + kamm2);
		Bestellposition buerste = new Bestellposition(6L, 0L, "1", "3"  );
		Bestellposition buerste2 = BestellpositionService.post(buerste);
		System.out.println("Bestellposition erstellt." + buerste2);
		BestellungService.delete("1");
		System.out.println("Bestellung 1 gelöscht");
		
		Bestellposition pos3 = BestellpositionService.get("6");
		art = ArtikelService.get("3");
		System.out.println("Bestellung " + best.bestellungsNr + " für " + kun1.vorname + " "+ kun1.nachname);
		System.out.println(pos.anzahl + " x " + art.bezeichnung + " für je " + art.einzelpreis );
		System.out.println(pos1.anzahl + " x " + art1.bezeichnung + " für je " + art1.einzelpreis );
		System.out.println(pos3.anzahl + " x " + art3.bezeichnung + " für je " + art3.einzelpreis );
		
	}
}
