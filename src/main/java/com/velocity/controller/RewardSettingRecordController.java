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

}
