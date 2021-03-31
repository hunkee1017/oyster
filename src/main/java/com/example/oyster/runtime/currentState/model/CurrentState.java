package com.example.oyster.runtime.currentState.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "current_state")
@Data
public class CurrentState {
    @Id
    private String 구분자;     // 대출 번호 등

    private Long scenarioId;

    private Long stateId;

}
