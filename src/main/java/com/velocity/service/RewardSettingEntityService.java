package com.velocity.service;

import java.util.List;

import com.velocity.model.RewardSettingEntity;

public interface RewardSettingEntityService {
	public void deletById(int id);
	
	public List<RewardSettingEntity> getRewardSettingEntity();
	
}