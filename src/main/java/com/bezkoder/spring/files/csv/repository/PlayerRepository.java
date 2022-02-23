package com.bezkoder.spring.files.csv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.files.csv.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
