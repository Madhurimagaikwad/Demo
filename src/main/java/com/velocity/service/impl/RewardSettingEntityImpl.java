package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.repository.RewardSettingEntityRepository;
import com.velocity.service.RewardSettingEntityService;

@Service
public class RewardSettingEntityImpl implements RewardSettingEntityService {

	@Autowired
	private RewardSettingEntityRepository rewardSettingEntityRepository;
	@Override
	public void deletById(int id) {
		
		rewardSettingEntityRepository.deleteById(id);
	}
	
	public RewardSettingEntity saveRewardSettingEntity(RewardSettingEntity rewardSettingEntity)
  
	RewardSettingEntity rewardSettingEntity1=rewardSettingEntityRepository.save(rewardSettingEntity);
    return rewardSettingEntity1;
}
