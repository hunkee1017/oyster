package com.example.oyster.template.scenario.repository;

import com.example.oyster.template.scenario.model.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScenarioRepository extends JpaRepository<Scenario, Long> {
}
