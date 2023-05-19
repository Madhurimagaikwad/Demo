package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.CurrencyConversionBean;
import com.velocity.repository.CurrencyConversionRepository;
import com.velocity.service.CurrencyConversionService;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

	@Autowired
	private CurrencyConversionRepository currencyConversionRepository;
	@Override
	public void deleteById(Long id) {
		currencyConversionRepository.deleteById(id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<CurrencyConversionBean> getCurrencyConversionBean() {
		Iterable<CurrencyConversionBean> currencyConversionBean = currencyConversionRepository.findAll();
		return (List<CurrencyConversionBean>) currencyConversionBean;
	}

	@Override
	public CurrencyConversionBean addCurrencyConversionBean(CurrencyConversionBean currencyConversionBean) {
		CurrencyConversionBean currencyConversionBean1 = currencyConversionRepository.save(currencyConversionBean);
		return currencyConversionBean1;
	}
	
	@Override
	public CurrencyConversionBean updateCurrencyConversionBean(CurrencyConversionBean currencyConversionBean) {
		long id = currencyConversionBean.getId();
		CurrencyConversionBean currencyConversionBean2 = currencyConversionRepository.findById(id).get();
		currencyConversionBean2.setFrom(currencyConversionBean.getFrom());
		currencyConversionBean2.setTo(currencyConversionBean.getTo());
		currencyConversionBean2.setConversionMultiple(currencyConversionBean.getConversionMultiple());
		currencyConversionBean2.setQuantity(currencyConversionBean.getQuantity());
		currencyConversionBean2.setTotalCalculatedAmount(currencyConversionBean.getTotalCalculatedAmount());
		currencyConversionBean2.setPort(currencyConversionBean.getPort());

		return currencyConversionRepository.save(currencyConversionBean2);

	
	}



}
