package com.example.task241jwt.repository;

import com.example.task241jwt.entity.Card;
import com.example.task241jwt.payload.CardDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<CardDto, Long> {
    Boolean existsByNumber(Long number);
}
