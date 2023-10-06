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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COURSE_DTLS")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("cid")
	@Column(name = "COURSE_ID")
	private Integer cid;
	@NotEmpty
	@Size(min = 2, message = "Course Name Should be Enter minimum  2 Characters")
	@JsonProperty("cname")
	@Column(name = "COURSE_NAME")
	private String courseName;
	@JsonProperty("cduration")

	@Column(name = "COURSE_DURATION")
	@Size(min = 4, message = "Course Duration Should be Enter minimum  4 Characters")

	private String courseDuration;
	@JsonProperty("cfee")

	@Column(name = "COURSE_FEE")
	private Integer cfee;
	/*
	 * @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "cid") List<Student> students;
	 */

	
	 
	  
	 }
