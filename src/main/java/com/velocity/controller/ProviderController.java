package com.velocity.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Provider;
import com.velocity.service.ProviderService;

@RestController
public class ProviderController {
	
	@Autowired
	private ProviderService providerService;
	
	/* Author Madhuria */
	@GetMapping("/getProvider/{pid}")
	public ResponseEntity<Optional<Provider>> getProvider(@PathVariable("pid") Integer pid) {
	Optional<Provider> provider =providerService.getProvider(pid);
	return ResponseEntity.ok().body(provider);
	}

	/* Author Vishal */
	@PostMapping("/saveProvider")
	public ResponseEntity<Provider> saveProviderDetails(@RequestBody Provider provider) {
		Provider providers = providerService.saveProvider(provider);
		return ResponseEntity.ok().body(providers);

	}
	
	/* Author Anuska */
	@DeleteMapping("/deleteProviderById/{pid}")
	public void deleteProviderById(@PathVariable("pid") int pid)
	{
		providerService.deleteProviderById(pid);
			
	}
	@PutMapping("/updateProvider")
	public Provider updateProvider(@RequestBody Provider provider) {
	Provider provider2	= providerService.saveProvider(provider);
	return provider2;
	
	
	}
}
