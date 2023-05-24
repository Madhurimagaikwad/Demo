package com.velocity.service;

import com.velocity.model.RewardSettingEntity;

public interface RewardSettingEntityService {
	public void deletById(int id);
	
	public RewardSettingEntity saveRewardSettingEntity(RewardSettingEntity rewardSettingEntity);
	
}