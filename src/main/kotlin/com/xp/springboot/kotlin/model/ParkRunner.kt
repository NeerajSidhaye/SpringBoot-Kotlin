package com.xp.springboot.kotlin.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="PARK_RUNNER")
data class ParkRunner (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	var parkRunId: Long = -1,		
		
    @Column(name = "firstName")
	var firstName: String = "",

	@Column(name = "lastName")
	var lastName: String = "",
	
	@Column(name = "gender")
	var gender: String = "",
	
	@Column(name = "runningClub")
	var runningClub: String = "",
	
	@Column(name = "totalRuns")
	var totalRuns: String = "0"

){  }