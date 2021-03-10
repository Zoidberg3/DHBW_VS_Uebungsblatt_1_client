package de.dhbw.uebungsblatt1client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@FeignClient(name="Bestellpositionservice", url ="http://localhost:8080/bestellposition")
public interface BestellpositionInterface {
	
	@GetMapping(path="/{id}")
	Bestellposition get(@PathVariable String id);
	
	@GetMapping
	Collection<Bestellposition>getAll();
	
	@GetMapping
	Collection<Bestellposition> finde(@SpringQueryMap Map<String, String>querymap);
	
	@PostMapping
	Bestellposition post(@RequestBody Bestellposition bestellposition);
	
	@PutMapping(path="/{id}")
	Bestellposition put(@PathVariable String id, @RequestBody Bestellposition bestellposition);
	
	@DeleteMapping(path="/{id}")
	void delete(@PathVariable String id);
}
