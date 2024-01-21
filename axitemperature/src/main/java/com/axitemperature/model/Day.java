package com.axitemperature.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Month month;

    private int dayNumber;
    private String dayOfWeek;
    private int avgDegrees;
    private int avgWind;
    private int avgPrecip;
    private int avgHumidity;

    public Day() {
        this.avgDegrees = 0;
        this.avgWind = 0;
        this.avgPrecip = 0;
        this.avgHumidity = 0;
    }

    public Day(Month month, int dayNumber, String dayOfWeek) {
        this.month = month;
        this.dayNumber = dayNumber;
        this.dayOfWeek = dayOfWeek;
        this.avgDegrees = 0;
        this.avgWind = 0;
        this.avgPrecip = 0;
        this.avgHumidity = 0;
    }

    public Day(Month month, int dayNumber, String dayOfWeek, int avgDegrees, int avgWind, int avgPrecip, int avgHumidity) {
        this.month = month;
        this.dayNumber = dayNumber;
        this.dayOfWeek = dayOfWeek;
        this.avgDegrees = avgDegrees;
        this.avgWind = avgWind;
        this.avgPrecip = avgPrecip;
        this.avgHumidity = avgHumidity;
    }

    // Getters and Setters


    public int getAvgPrecip() {
        return avgPrecip;
    }

    public int getAvgDegrees() {
        return avgDegrees;
    }

    public int getAvgWind() {
        return avgWind;
    }

    public Long getId() {
        return id;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public Month getMonth() {
        return month;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getAvgHumidity() {
        return avgHumidity;
    }

    public void setAvgPrecip(int avgPrecip) {
        this.avgPrecip = avgPrecip;
    }

    public void setAvgDegrees(int avgDegrees) {
        this.avgDegrees = avgDegrees;
    }

    public void setAvgWind(int avgWind) {
        this.avgWind = avgWind;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAvgHumidity(int avgHumidity) {
        this.avgHumidity = avgHumidity;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}