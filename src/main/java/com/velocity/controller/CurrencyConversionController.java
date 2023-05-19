package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.CurrencyConversionBean;
import com.velocity.service.CurrencyConversionService;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyConversionService currencyConversionService;
	
	@DeleteMapping("/deleteconverter/{id}")
	public void deleteById(@PathVariable ("id") Long id) {
		currencyConversionService.deleteById(id);
}
	@PutMapping("/updateCurrencyConversion")
	public ResponseEntity<CurrencyConversionBean> updateCurrencyConversionBeanService(
			@RequestBody CurrencyConversionBean currencyConversionBean) {
		CurrencyConversionBean currencyConversionBean2 = currencyConversionService
				.updateCurrencyConversionBean(currencyConversionBean);
		return ResponseEntity.ok().body(currencyConversionBean2);

	}
}
