package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.velocity.service.RewardSettingEntityService;

@Controller
public class RewardSettingRecordController {
	
	@Autowired
	private RewardSettingEntityService rewardSettingEntityService;
	
	@DeleteMapping("/deleteReward/{id}")
	public void deletById(@PathVariable("id") int id) {
		rewardSettingEntityService.deletById(id);
	}
	
	public ResponseEntity<RewardSettingEntity> saveRewardSettingEntity(@RequestBody RewardSettingEntity rewardSettingEntity ) {
		RewardSettingEntity rewardSettingEntity1=rewardSettingEntityService.saveRewardSettingEntity(rewardSettingEntity);
		return ResponseEntity.ok().body(rewardSettingEntity1);
	}
}
/* Author Vishal*/
@PostMapping("/saveProvider")
public ResponseEntity<Provider> saveProviderDetails(@RequestBody Provider provider) {
	Provider providers = providerService.saveProvider(provider);
	return ResponseEntity.ok().body(providers);