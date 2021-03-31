package com.example.oyster.template.event.repository;

import com.example.oyster.template.event.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
