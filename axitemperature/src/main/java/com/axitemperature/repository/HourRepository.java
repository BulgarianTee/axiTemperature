package com.axitemperature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.axitemperature.model.Hour;

public interface HourRepository extends JpaRepository<Hour, Long> {

}