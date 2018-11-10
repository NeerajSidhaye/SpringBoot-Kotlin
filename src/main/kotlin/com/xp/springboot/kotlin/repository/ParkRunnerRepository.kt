package com.xp.springboot.kotlin.repository

import org.springframework.data.repository.CrudRepository
import com.xp.springboot.kotlin.model.ParkRunner
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "runners", path = "runners")
interface ParkRunnerRepository : CrudRepository <ParkRunner, Long >{
}