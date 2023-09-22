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
public class StateUt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StateId;//Primary Key
	
	@Column(length=50)
	private String StateName;
	
	
	private StateDestination Statedestination;//Foreign Key
	
}
