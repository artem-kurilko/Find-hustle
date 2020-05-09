package com.findyourhustle.management.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "units")
public class Unit extends BaseEntity{

    @NotNull
    @Column(name = "risk", length = 100)
    private int risk;

    @NotNull
    @Column(name = "competition", length = 100)
    private int competition;

    @NotNull
    @Column(name = "revenue", length = 100)
    private int revenue;

    @NotNull
    @Column(name = "investments", length = 100)
    private int investments;

    @NotNull
    @Column(name = "time", length = 100)
    private int time;
}
