package com.axitemperature.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Month {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Year year;

    private int monthNumber;
    private String monthText;
    private int avgDegrees;
    private int avgWind;
    private int avgPrecip;
    private int avgHumidity;

    public Month() {
        this.avgDegrees = 0;
        this.avgWind = 0;
        this.avgPrecip = 0;
        this.avgHumidity = 0;
    }

    public Month(Year year, int monthNumber, String monthText) {
        this.year = year;
        this.monthNumber = monthNumber;
        this.monthText = monthText;
        this.avgDegrees = 0;
        this.avgWind = 0;
        this.avgPrecip = 0;
        this.avgHumidity = 0;
    }

    public Month(Year year, int monthNumber, String monthText, int avgDegrees, int avgWind, int avgPrecip, int avgHumidity) {
        this.year = year;
        this.monthNumber = monthNumber;
        this.monthText = monthText;
        this.avgDegrees = avgDegrees;
        this.avgWind = avgWind;
        this.avgPrecip = avgPrecip;
        this.avgHumidity = avgHumidity;
    }

    // Getters and Setters


    public int getAvgDegrees() {
        return avgDegrees;
    }

    public int getAvgPrecip() {
        return avgPrecip;
    }

    public Long getId() {
        return id;
    }

    public int getAvgHumidity() {
        return avgHumidity;
    }

    public int getAvgWind() {
        return avgWind;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthText() {
        return monthText;
    }

    public Year getYear() {
        return year;
    }

    public void setAvgDegrees(int avgDegrees) {
        this.avgDegrees = avgDegrees;
    }

    public void setAvgPrecip(int avgPrecip) {
        this.avgPrecip = avgPrecip;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAvgWind(int avgWind) {
        this.avgWind = avgWind;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public void setMonthText(String monthText) {
        this.monthText = monthText;
    }

    public void setAvgHumidity(int avgHumidity) {
        this.avgHumidity = avgHumidity;
    }
}