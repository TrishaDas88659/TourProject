package com.ttp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TouringPlace {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;//Primary Key
	  
	@Column(length=50)
	private String SearchingType;


}
