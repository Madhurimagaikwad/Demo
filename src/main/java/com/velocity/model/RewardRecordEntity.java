package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rewardrecord")
public class RewardRecordEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rewardRecordType;
	private int rewardSettingBySettingId;	// FK
	
	
	
	public int getRewardSettingBySettingId() {
		return rewardSettingBySettingId;
	}
	public void setRewardSettingBySettingId(int rewardSettingBySettingId) {
		this.rewardSettingBySettingId = rewardSettingBySettingId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRewardRecordType() {
		return rewardRecordType;
	}
	public void setRewardRecordType(String rewardRecordType) {
		this.rewardRecordType = rewardRecordType;
	}

}



