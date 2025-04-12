package com.itv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itv.entity.Registration;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findByUserId(Long userId);
    List<Registration> findByEventId(Long eventId);

}
