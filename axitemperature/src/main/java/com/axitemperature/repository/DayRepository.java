package com.axitemperature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.axitemperature.model.Day;

public interface DayRepository extends JpaRepository<Day, Long> {

    @Query("SELECT AVG(h.degrees) FROM Hour h WHERE h.day = :day")
    int calculateAvgDegreesForDay(@Param("day") Day day);

    @Query("SELECT AVG(h.wind) FROM Hour h WHERE h.day = :day")
    int calculateAvgWindForDay(@Param("day") Day day);

    @Query("SELECT AVG(h.precipitation) FROM Hour h WHERE h.day = :day")
    int calculateAvgPrecipForDay(@Param("day") Day day);

    @Query("SELECT AVG(h.humidity) FROM Hour h WHERE h.day = :day")
    int calculateAvgHumidityForDay(@Param("day") Day day);
}