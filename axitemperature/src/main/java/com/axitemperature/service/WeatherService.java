package com.axitemperature.service;

import com.axitemperature.model.*;
import com.axitemperature.repository.DayRepository;
import com.axitemperature.repository.HourRepository;
import com.axitemperature.repository.MonthRepository;
import com.axitemperature.repository.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WeatherService {

    @Autowired
    private YearRepository yearRepository;

    @Autowired
    private MonthRepository monthRepository;

    @Autowired
    private DayRepository dayRepository;

    @Autowired
    private HourRepository hourRepository;

    public void calculateAndSetAverageValues() {

        // Calculate and update average values for Day
        calculateAndSetAvgDegreesForDays();
        calculateAndSetAvgWindForDays();
        calculateAndSetAvgPrecipForDays();
        calculateAndSetAvgHumidityForDays();

        // Calculate and update average values for Month
        calculateAndSetAvgDegreesForMonths();
        calculateAndSetAvgWindForMonths();
        calculateAndSetAvgPrecipForMonths();
        calculateAndSetAvgHumidityForMonths();

        // Calculate and update average values for Year
        calculateAndSetAvgDegreesForYears();
        calculateAndSetAvgWindForYears();
        calculateAndSetAvgPrecipForYears();
        calculateAndSetAvgHumidityForYears();
    }

    // YEARS:

    private void calculateAndSetAvgDegreesForYears() {
        yearRepository.findAll().forEach(this::updateAvgDegreesForYear);
    }

    private void updateAvgDegreesForYear(Year year) {
        int avgDegrees = yearRepository.calculateAvgDegreesForYear(year);
        year.setAvgDegrees(avgDegrees);
        yearRepository.save(year);
    }

    private void calculateAndSetAvgWindForYears() {
        yearRepository.findAll().forEach(this::updateAvgWindForYear);
    }

    private void updateAvgWindForYear(Year year) {
        int avgWind = yearRepository.calculateAvgWindForYear(year);
        year.setAvgWind(avgWind);
        yearRepository.save(year);
    }

    private void calculateAndSetAvgPrecipForYears() {
        yearRepository.findAll().forEach(this::updateAvgPrecipForYear);
    }

    private void updateAvgPrecipForYear(Year year) {
        int avgPrecip = yearRepository.calculateAvgPrecipForYear(year);
        year.setAvgPrecip(avgPrecip);
        yearRepository.save(year);
    }

    private void calculateAndSetAvgHumidityForYears() {
        yearRepository.findAll().forEach(this::updateAvgHumidityForYear);
    }

    private void updateAvgHumidityForYear(Year year) {
        int avgHumidity = yearRepository.calculateAvgHumidityForYear(year);
        year.setAvgHumidity(avgHumidity);
        yearRepository.save(year);
    }

    // DAYS:

    private void calculateAndSetAvgDegreesForDays() {
        dayRepository.findAll().forEach(this::updateAvgDegreesForDay);
    }

    private void updateAvgDegreesForDay(Day day) {
        int avgDegrees = dayRepository.calculateAvgDegreesForDay(day);
        day.setAvgDegrees(avgDegrees);
        dayRepository.save(day);
    }

    private void calculateAndSetAvgWindForDays() {
        dayRepository.findAll().forEach(this::updateAvgWindForDay);
    }

    private void updateAvgWindForDay(Day day) {
        int avgWind = dayRepository.calculateAvgWindForDay(day);
        day.setAvgWind(avgWind);
        dayRepository.save(day);
    }

    private void calculateAndSetAvgPrecipForDays() {
        dayRepository.findAll().forEach(this::updateAvgPrecipForDay);
    }

    private void updateAvgPrecipForDay(Day day) {
        int avgPrecip = dayRepository.calculateAvgPrecipForDay(day);
        day.setAvgPrecip(avgPrecip);
        dayRepository.save(day);
    }

    private void calculateAndSetAvgHumidityForDays() {
        dayRepository.findAll().forEach(this::updateAvgHumidityForDay);
    }

    private void updateAvgHumidityForDay(Day day) {
        int avgHumidity = dayRepository.calculateAvgHumidityForDay(day);
        day.setAvgHumidity(avgHumidity);
        dayRepository.save(day);
    }

    // MONTHS:

    private void calculateAndSetAvgDegreesForMonths() {
        monthRepository.findAll().forEach(this::updateAvgDegreesForMonth);
    }

    private void updateAvgDegreesForMonth(Month month) {
        int avgDegrees = monthRepository.calculateAvgDegreesForMonth(month);
        month.setAvgDegrees(avgDegrees);
        monthRepository.save(month);
    }

    private void calculateAndSetAvgWindForMonths() {
        monthRepository.findAll().forEach(this::updateAvgWindForMonth);
    }

    private void updateAvgWindForMonth(Month month) {
        int avgWind = monthRepository.calculateAvgWindForMonth(month);
        month.setAvgWind(avgWind);
        monthRepository.save(month);
    }

    private void calculateAndSetAvgPrecipForMonths() {
        monthRepository.findAll().forEach(this::updateAvgPrecipForMonth);
    }

    private void updateAvgPrecipForMonth(Month month) {
        int avgPrecip = monthRepository.calculateAvgPrecipForMonth(month);
        month.setAvgPrecip(avgPrecip);
        monthRepository.save(month);
    }

    private void calculateAndSetAvgHumidityForMonths() {
        monthRepository.findAll().forEach(this::updateAvgHumidityForMonth);
    }

    private void updateAvgHumidityForMonth(Month month) {
        int avgHumidity = monthRepository.calculateAvgHumidityForMonth(month);
        month.setAvgHumidity(avgHumidity);
        monthRepository.save(month);
    }
}
