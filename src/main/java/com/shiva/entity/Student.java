package com.shiva.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT_DTLS")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@JsonProperty("sid")
	private Integer id;
@Column(name = "sname")
@JsonProperty("sname")
	private String studentName;
@Column(name="sadd")
@JsonProperty("studentAddress")
	private String studentAddress;
	@NotEmpty
	@Email
	@Column(name="EMAIL")
	@JsonProperty("email")
	private String email;
	
	 @ManyToMany(targetEntity = Course.class, cascade = { CascadeType.ALL })
	  
	  @JoinTable(name = "Student_Course", joinColumns = { @JoinColumn(name =
	  "s_id") }, inverseJoinColumns = { @JoinColumn(name = "c_id") })
	  
	  List<Course> courses;
	  
}
