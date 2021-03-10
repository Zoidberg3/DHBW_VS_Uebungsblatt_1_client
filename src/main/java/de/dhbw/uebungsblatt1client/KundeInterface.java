package de.dhbw.uebungsblatt1client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@FeignClient(name="Kundeservice", url ="http://localhost:8080/kunde")
public interface KundeInterface {
	
	@GetMapping(path="/{id}")
	Kunde get(@PathVariable String id);
	@GetMapping
	Collection<Kunde> getAll();
	@GetMapping
	Collection<Kunde> finde(@SpringQueryMap Map<String, String>querymap);
	@PostMapping
	Kunde post(@RequestBody Kunde kunde);
	@PutMapping(path="/{id}")
	Kunde put(@PathVariable String id, @RequestBody Kunde kunde);
	@DeleteMapping(path="/{id}")
	void delete(@PathVariable String id);
}
