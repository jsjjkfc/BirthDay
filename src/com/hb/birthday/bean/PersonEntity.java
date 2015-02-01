package com.hb.birthday.bean;

import java.util.Date;

public class PersonEntity {
	/**
	 * 姓
	 */
	private String surname;
	/**
	 * 名
	 */
	private String name;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 主要提醒
	 */
	private Date infortime;
	/**
	 * 星座️
	 */
	private int constellation;

	public Date getInfortime() {
		return infortime;
	}

	public void setInfortime(Date infortime) {
		this.infortime = infortime;
	}

	public int getConstellation() {
		return constellation;
	}

	public void setConstellation(int constellation) {
		this.constellation = constellation;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
