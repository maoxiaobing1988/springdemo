/*
 * Powered By Generator Util
 */
package com.cattsoft.ny.base.entity;

import java.util.Date;

import com.cattsoft.baseplatform.core.entity.Entity;

/**
 * 
 * Description: <br>
 * Date: <br>
 * Copyright (c) 2012 CATTSoft <br>
 * 
 * @author CHASE
 */
public class EquipSensorsGhouse extends Entity {
	private static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.Long baseId;
	private java.lang.Long houseId;
	private java.lang.Long equipInfoId;
	private java.lang.Long custId;
	private java.lang.String type;
	private String status;// o 停用 1 在用
	private Date startTime;// 使用时间
	private Date stopTime;// 停用时间
	/**
	 * 父设备id
	 */
	/**
	 * 控制器名称
	 */
	private String equipName;

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setBaseId(java.lang.Long baseId) {
		this.baseId = baseId;
	}

	public java.lang.Long getBaseId() {
		return this.baseId;
	}

	public void setHouseId(java.lang.Long houseId) {
		this.houseId = houseId;
	}

	public java.lang.Long getHouseId() {
		return this.houseId;
	}

	public void setEquipInfoId(java.lang.Long equipInfoId) {
		this.equipInfoId = equipInfoId;
	}

	public java.lang.Long getEquipInfoId() {
		return this.equipInfoId;
	}

	public void setCustId(java.lang.Long custId) {
		this.custId = custId;
	}

	public java.lang.Long getCustId() {
		return this.custId;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStopTime() {
		return stopTime;
	}

	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}


	/**
	 * @return the equipName
	 */
	public String getEquipName() {
		return equipName;
	}

	/**
	 * @param equipName
	 *            the equipName to set
	 */
	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

}