package com.cattsoft.ny.base.entity;

import com.cattsoft.baseplatform.core.entity.Entity;
/**
 * 设备属性对象
 * @author John
 */
public class EquipAttribute extends Entity {

	private static final long serialVersionUID = 7283333955376768294L;
	private java.lang.Long id;
	private java.lang.String name;
	private java.lang.String value;
	private java.lang.Long equipId;
	public java.lang.Long getId() {
		return id;
	}
	public void setId(java.lang.Long id) {
		this.id = id;
	}
	public java.lang.String getName() {
		return name;
	}
	public void setName(java.lang.String name) {
		this.name = name;
	}
	public java.lang.String getValue() {
		return value;
	}
	public void setValue(java.lang.String value) {
		this.value = value;
	}
	public java.lang.Long getEquipId() {
		return equipId;
	}
	public void setEquipId(java.lang.Long equipId) {
		this.equipId = equipId;
	}
	
}
