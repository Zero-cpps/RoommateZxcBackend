package edu.sustech.zxc.roommatezxcbackend.domain;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String password;

	

	private Time sleepTime, wakeTime;
	private boolean siesta;
	private double temperature_upper, temperature_lower;


}
