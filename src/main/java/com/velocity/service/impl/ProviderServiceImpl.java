package com.velocity.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Product;
import com.velocity.model.Provider;
import com.velocity.repository.ProviderRepository;
import com.velocity.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private ProviderRepository providerRepository;
	@Override
	public Optional<Provider> getProvider(Integer pid) {
		Optional<Provider> provider=providerRepository.findById(pid);
		return provider;
	}
	@Override
	public Provider saveProvider(Provider provider) {
		return providerRepository.save(provider);
	}

	@Override
	public void deleteProviderById(int pid) {

		providerRepository.deleteById(pid);

	}
	@Override
	public Provider updateProvider(Provider provider) {
		int id = provider.getPid();
	Provider provider2	= providerRepository.findById(id).get();
		provider2.setAddress(provider.getAddress());
		provider2.setCreateDate(provider.getCreateDate());
		provider2.setDescribe(provider.getDescribe());
		provider2.setFax(provider.getFax());
		provider2.setPeople(provider.getPeople());
		provider2.setPhone(provider.getPhone());
		provider2.setProviderCode(provider.getProviderCode());
		provider2.setProviderName(provider.getProviderName());
		return null;
	}


}
