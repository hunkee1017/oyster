package com.example.oyster.template.state.repository;

import com.example.oyster.template.state.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
