package com.example.oyster.template.scenario.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "scenario")
public class Scenario {

    @Id
    private Long id;

}
