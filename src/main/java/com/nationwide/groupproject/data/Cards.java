package com.nationwide.groupproject.data;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cards")
public class Cards{
	@Id
	private String rempno;
	private String rname;
	private String rmempno;
	private String sempno;
	private String sname;
	private char category;
	private Date senddate;
	private String description;
	private String picture;
	
	public Cards() {
	}
	
	public Cards(String rempno, String rname, String rmempno, String sempno, String sname, char category, Date senddate,
			String description, String picture) {
		this.rempno = rempno;
		this.rname = rname;
		this.rmempno = rmempno;
		this.sempno = sempno;
		this.sname = sname;
		this.category = category;
		this.senddate = senddate;
		this.description = description;
		this.picture = picture;
	}

	public String getRempno() {
		return rempno;
	}

	public void setRempno(String rempno) {
		this.rempno = rempno;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRmempno() {
		return rmempno;
	}

	public void setRmempno(String rmempno) {
		this.rmempno = rmempno;
	}

	public String getSempno() {
		return sempno;
	}

	public void setSempno(String sempno) {
		this.sempno = sempno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public Date getSenddate() {
		return senddate;
	}

	public void setSenddate(Date senddate) {
		this.senddate = senddate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
}