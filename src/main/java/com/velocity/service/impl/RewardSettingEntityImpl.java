package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.RewardSettingEntity;
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
	@Override
	public List<RewardSettingEntity> getRewardSettingEntity() {

 List<RewardSettingEntity> rewardSettingEntity=(List<RewardSettingEntity>) rewardSettingEntityRepository.findAll();
		return rewardSettingEntity;
	}

}
