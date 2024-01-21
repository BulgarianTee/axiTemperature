package com.axitemperature.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Year {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int yearNumber;
    private int avgDegrees;
    private int avgHumidity;
    private int avgWind;
    private int avgPrecip;

    public Year() {
        this.avgDegrees = 0;
        this.avgHumidity = 0;
        this.avgWind = 0;
        this.avgPrecip = 0;
    }

    public Year(int yearNumber) {
        this.yearNumber = yearNumber;
        this.avgDegrees = 0;
        this.avgHumidity = 0;
        this.avgWind = 0;
        this.avgPrecip = 0;
    }

    public Year(int yearNumber, int avgDegrees, int avgHumidity, int avgWind, int avgPrecip) {
        this.yearNumber = yearNumber;
        this.avgDegrees = avgDegrees;
        this.avgHumidity = avgHumidity;
        this.avgWind = avgWind;
        this.avgPrecip = avgPrecip;
    }

    // Getters and Setters

    public int getYearNumber() {
        return yearNumber;
    }

    public Long getId() {
        return id;
    }

    public int getAvgPrecip() {
        return avgPrecip;
    }

    public int getAvgHumidity() {
        return avgHumidity;
    }

    public int getAvgDegrees() {
        return avgDegrees;
    }

    public int getAvgWind() {
        return avgWind;
    }

    public void setAvgPrecip(int avgPrecip) {
        this.avgPrecip = avgPrecip;
    }

    public void setAvgHumidity(int avgHumidity) {
        this.avgHumidity = avgHumidity;
    }

    public void setAvgDegrees(int avgDegrees) {
        this.avgDegrees = avgDegrees;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    public void setAvgWind(int avgWind) {
        this.avgWind = avgWind;
    }

    public void setId(Long id) {
        this.id = id;
    }
}