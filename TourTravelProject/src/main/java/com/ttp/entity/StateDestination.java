package com.ttp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StateDestination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int DestinationId;//Primary Key
	
	@Column(length=50)
	private String DestinationName;
	
	@Column(length=50)
	private String Image;
	
	@Column(length=50)
	private String Type;
	
	@Column(length=50)
	private String PopularityScore;


}
