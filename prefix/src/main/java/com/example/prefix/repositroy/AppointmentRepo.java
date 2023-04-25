package com.example.prefix.repositroy;

import com.example.prefix.entity.Appointment;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {
    String findAllById(Integer id);

}
