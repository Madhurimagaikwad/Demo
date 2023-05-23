package com.velocity.service;

import java.util.List;
import java.util.Optional;

import com.velocity.model.Product;
import com.velocity.model.Provider;


public interface ProviderService {
	
	public Optional<Provider> getProvider(Integer Pid);
	public Provider saveProvider(Provider provider);
	public void deleteProviderById( int pid);
	
	//Design the Restful web services to update the provider details into database
	public Provider updateProvider(Provider provider);
	
		
	}
