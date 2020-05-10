package com.findyourhustle.management.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "units")
public class Unit extends BaseEntity{

    @Column(name = "risk")
    private int risk;

    @Column(name = "competition")
    private int competition;

    @Column(name = "revenue")
    private int revenue;

    @Column(name = "investments")
    private int investments;

    @Column(name = "time")
    private int time;
}
