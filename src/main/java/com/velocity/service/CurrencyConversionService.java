package com.velocity.service;

import java.util.List;

import com.velocity.model.CurrencyConversionBean;


public interface CurrencyConversionService {
	
	public CurrencyConversionBean updateCurrencyConversionBean(CurrencyConversionBean currencyConversionBean);

	public void deleteById(Long id);
	
	public List<CurrencyConversionBean> getCurrencyConversionBean();

	public CurrencyConversionBean addCurrencyConversionBean(CurrencyConversionBean currencyConversionBean);
}
