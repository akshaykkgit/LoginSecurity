package com.m2h.wsi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coding_language")
public class CodingLanguage {
    @Id
	@GeneratedValue
	@Column(name = "Id", nullable = false)
	private long id;
	private String codingLanguage;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodingLanguage() {
		return codingLanguage;
	}
	public void setCodingLanguage(String codingLanguage) {
		this.codingLanguage = codingLanguage;
	}
	
	
	
	

}
