package com.example.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class College {
	
	private Integer id;
    private String college;
    private String collegename;
    private String location;
    public College() {
    }
	public College(Integer id, String college, String collegename, String location) {
		super();
		this.id = id;
		this.college = college;
		this.collegename = collegename;
		this.location = location;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", college=" + college + ", collegename=" + collegename + ", location=" + location
				+ "]";
	}
	
	
    

}
