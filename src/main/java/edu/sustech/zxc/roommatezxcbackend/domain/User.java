package edu.sustech.zxc.roommatezxcbackend.domain;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import edu.sustech.zxc.roommatezxcbackend.enums.Province;

import javax.persistence.GenerationType;

@Entity
public class User {
	
	// Account information
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String password;

	// Personal information

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Province province;

	@Column(nullable = false)
	private Date birthday;

	@Column(nullable = false)
	private Time sleepTime, wakeTime;

	@Column(nullable = false)
	private boolean siesta;

	@Column(nullable = false)
	private double temperatureUpper, temperatureLower;

	@Column(nullable = false)
	private boolean game;

	private byte[] other;

	// Expected information of roommates
	@OneToMany
	private List<Province> preferProvinces;
	private Time preferSleepTime, preferWakeTime;
	private boolean preferSiesta;
	private double preferTemperatureUpper, preferTemperatureLower;
	private boolean preferGame;
	private byte[] preferOther;
}
