package de.dhbw.uebungsblatt1client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@FeignClient(name="Bestellungservice", url ="http://localhost:8080/bestellung")
public interface BestellungInterface {
	
	@GetMapping(path="/{id}")
	Bestellung get(@PathVariable String id);
	
	@GetMapping
	Collection<Bestellung>getAll();
	
	@GetMapping
	Collection<Bestellung> finde(@SpringQueryMap Map<String, String>querymap);
	
	@PostMapping
	Bestellung post(@RequestBody Bestellung bestellung);
	
	@PutMapping(path="/{id}")
	Bestellung put(@PathVariable String id, @RequestBody Bestellung bestellung);
	
	@DeleteMapping(path="/{id}")
	void delete(@PathVariable String id);
}
