package com.samir.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.samir.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
