package com.pms.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor


public class ProcessPensionBean {
@Id
@GeneratedValue
	
	private long id;
	private String name;
	private String dob;
	private double salaryearned;
	private double da_allowance;
	private String typeselfofamilypension;
	private double pensionamount;
	private double basicsalary;
	private static final int fixedbygovt=70;
	private String pensioneraccountnumber;
	private String pancard;
	private String username;
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getSalaryearned() {
		return salaryearned;
	}
	public void setSalaryearned(double salaryearned) {
		this.salaryearned = salaryearned;
	}
	public double getDa_allowance() {
		return da_allowance;
	}
	public void setDa_allowance(double da_allowance) {
		this.da_allowance = da_allowance;
	}
	public String getTypeselfofamilypension() {
		return typeselfofamilypension;
	}
	public void setTypeselfofamilypension(String typeselfofamilypension) {
		this.typeselfofamilypension = typeselfofamilypension;
	}
	public double getPensionamount() {
		return pensionamount;
	}
	public void setPensionamount(double pensionamount) {
		this.pensionamount = pensionamount;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public int getFixedbygovt() {
		return fixedbygovt;
	}
	
	
	public String getPensioneraccountnumber() {
		return pensioneraccountnumber;
	}
	public void setPensioneraccountnumber(String pensioneraccountnumber) {
		this.pensioneraccountnumber = pensioneraccountnumber;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
