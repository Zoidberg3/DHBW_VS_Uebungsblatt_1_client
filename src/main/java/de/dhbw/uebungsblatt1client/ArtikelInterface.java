package de.dhbw.uebungsblatt1client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@FeignClient(name="Artikelservice", url ="http://localhost:8080/artikel")
public interface ArtikelInterface {
	
	@GetMapping(path="/{id}")
	Artikel get(@PathVariable String id);
	@GetMapping
	Collection<Artikel>getAll();
	@GetMapping
	Collection<Artikel> finde(@SpringQueryMap Map<String, String>querymap);
	@PostMapping
	Artikel post(@RequestBody Artikel artikel);
	@PutMapping(path="/{id}")
	Artikel put(@PathVariable String id, @RequestBody Artikel artikel);
	@DeleteMapping(path="/{id}")
	void delete(@PathVariable String id);
}
