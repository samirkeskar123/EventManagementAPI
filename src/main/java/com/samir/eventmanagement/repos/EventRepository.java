package com.samir.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.samir.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event,Long> {

}
