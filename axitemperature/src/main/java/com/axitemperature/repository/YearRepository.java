package com.axitemperature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.axitemperature.model.Year;

public interface YearRepository extends JpaRepository<Year, Long> {

    @Query("SELECT AVG(m.avgDegrees) FROM Month m WHERE m.year = :year")
    int calculateAvgDegreesForYear(@Param("year") Year year);

    @Query("SELECT AVG(m.avgWind) FROM Month m WHERE m.year = :year")
    int calculateAvgWindForYear(@Param("year") Year year);

    @Query("SELECT AVG(m.avgPrecip) FROM Month m WHERE m.year = :year")
    int calculateAvgPrecipForYear(@Param("year") Year year);

    @Query("SELECT AVG(m.avgHumidity) FROM Month m WHERE m.year = :year")
    int calculateAvgHumidityForYear(@Param("year") Year year);
}