/*
 * Powered By Generator Util
 */
package com.cattsoft.ny.base.entity.querybean;

import com.cattsoft.baseplatform.core.entity.QueryBean;
/**
 * 
 * Description: <br>
 * Date: <br>
 * Copyright (c) 2012 CATTSoft <br>
 * 
 * @author CHASE
 */
public class OperationWorksInfoQB extends QueryBean {
	private static final long serialVersionUID = 1L;
	
	private java.lang.Long id;
	private java.lang.Long userId;
	private java.lang.Long houseId;
	private java.lang.Long produceSeasonId;
	private java.lang.String workType;
	private java.lang.String type;
	private double amount;
	private java.util.Date beginTime;
	private java.util.Date beginTime0;
	private java.util.Date endTime;
	private java.util.Date endTime0;
	private java.lang.String remark;
	private java.lang.String typeName;
	private String userName;
	public void setId(java.lang.Long id) {
		this.id = id;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setUserId(java.lang.Long userId) {
		this.userId = userId;
	}
	
	public java.lang.Long getUserId() {
		return this.userId;
	}
	public void setHouseId(java.lang.Long houseId) {
		this.houseId = houseId;
	}
	
	public java.lang.Long getHouseId() {
		return this.houseId;
	}
	public void setProduceSeasonId(java.lang.Long produceSeasonId) {
		this.produceSeasonId = produceSeasonId;
	}
	
	public java.lang.Long getProduceSeasonId() {
		return this.produceSeasonId;
	}
	public void setWorkType(java.lang.String workType) {
		this.workType = workType;
	}
	
	public java.lang.String getWorkType() {
		return this.workType;
	}
	public void setType(java.lang.String type) {
		this.type = type;
	}
	
	public java.lang.String getType() {
		return this.type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setBeginTime(java.util.Date beginTime) {
		this.beginTime = beginTime;
	}
	
	public java.util.Date getBeginTime() {
		return this.beginTime;
	}
	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}
	
	public java.util.Date getEndTime() {
		return this.endTime;
	}
	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}

	public java.util.Date getBeginTime0() {
		return beginTime0;
	}

	public void setBeginTime0(java.util.Date beginTime0) {
		this.beginTime0 = beginTime0;
	}

	public java.util.Date getEndTime0() {
		return endTime0;
	}

	public void setEndTime0(java.util.Date endTime0) {
		this.endTime0 = endTime0;
	}

	public java.lang.String getTypeName() {
		return typeName;
	}

	public void setTypeName(java.lang.String typeName) {
		this.typeName = typeName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}