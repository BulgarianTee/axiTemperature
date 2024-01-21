package com.axitemperature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.axitemperature.model.Month;

public interface MonthRepository extends JpaRepository<Month, Long> {

    @Query("SELECT AVG(d.avgDegrees) FROM Day d WHERE d.month = :month")
    int calculateAvgDegreesForMonth(@Param("month") Month month);

    @Query("SELECT AVG(d.avgWind) FROM Day d WHERE d.month = :month")
    int calculateAvgWindForMonth(@Param("month") Month month);

    @Query("SELECT AVG(d.avgPrecip) FROM Day d WHERE d.month = :month")
    int calculateAvgPrecipForMonth(@Param("month") Month month);

    @Query("SELECT AVG(d.avgHumidity) FROM Day d WHERE d.month = :month")
    int calculateAvgHumidityForMonth(@Param("month") Month month);
}