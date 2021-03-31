package com.example.oyster.template.event.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event")
@Data
public class Event {
    @Id
    private Long id;

    private Long stateSourceId;

    private Long stateTargetId;

    private String condition;
}
