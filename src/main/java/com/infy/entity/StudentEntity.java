package com.infy.entity;

public class StudentEntity {
	private int enId;
	private String enName;
	private String enAddress;
	public int getEnId() {
		return enId;
	}
	public void setEnId(int enId) {
		this.enId = enId;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getEnAddress() {
		return enAddress;
	}
	public void setEnAddress(String enAddress) {
		this.enAddress = enAddress;
	}
	public String toString() {
		return "StudentEntity [enId=" + enId + ", enName=" + enName + ", enAddress=" + enAddress + "]";
	}
	public StudentEntity(int enId, String enName, String enAddress) {
		super();
		this.enId = enId;
		this.enName = enName;
		this.enAddress = enAddress;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
