package com.samir.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.samir.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
