package com.axitemperature.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Hour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Day day;

    private int hourNumber;
    private int degrees;
    private int wind;
    private int precipitation;
    private int humidity;

    public Hour() {
    }

    public Hour(Day day, int hourNumber, int degrees, int wind, int precipitation, int humidity) {
        this.day = day;
        this.hourNumber = hourNumber;
        this.degrees = degrees;
        this.wind = wind;
        this.precipitation = precipitation;
        this.humidity = humidity;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getDegrees() {
        return degrees;
    }

    public Day getDay() {
        return day;
    }

    public int getHourNumber() {
        return hourNumber;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public int getWind() {
        return wind;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
    }

    public void setHourNumber(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}