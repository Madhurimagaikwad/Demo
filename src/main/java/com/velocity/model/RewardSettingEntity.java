package com.velocity.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="rewardsetting")
public class RewardSettingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String planName;
    private Integer point;
    private boolean isOn;
  
    
    @ManyToOne
    @JoinColumn(name = "task_type", referencedColumnName = "id")
    private PlanTypeEntity planTypeByTaskType;
    
    @OneToMany(mappedBy = "rewardSettingBySettingId", cascade = CascadeType.DETACH)
    private Collection<RewardRecordEntity> rewardRecordsById;
    
    private ArrayList<Integer> typeList;
    
  public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public ArrayList<Integer> getTypeList() {
		return typeList;
	}
	@OneToMany
	@JoinColumn(name="task_type")
	public void setTypeList(ArrayList<Integer> typeList) {
		this.typeList = typeList;
	}

	public void setPlanTypeByTaskType(PlanTypeEntity planTypeByTaskType) {
		this.planTypeByTaskType = planTypeByTaskType;
	}

	public void setRewardRecordsById(Collection<RewardRecordEntity> rewardRecordsById) {
		this.rewardRecordsById = rewardRecordsById;
	}


    public Collection<RewardRecordEntity> getRewardRecordsById() {
        return rewardRecordsById;
    }

  
    public PlanTypeEntity getPlanTypeByTaskType() {
        return planTypeByTaskType;
    }


}


