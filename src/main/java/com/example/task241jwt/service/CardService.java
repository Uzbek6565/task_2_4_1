package com.example.task241jwt.service;

import com.example.task241jwt.entity.Card;
import com.example.task241jwt.mesasge.Result;
import com.example.task241jwt.payload.CardDto;
import com.example.task241jwt.repository.CardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Slf4j
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<CardDto> getCards() {
        return cardRepository.findAll();
    }

    public Result addCard(CardDto cardDto) {
        Boolean exists = cardRepository.existsByNumber(cardDto.getNumber());
        if (exists){
            return new Result("Card already exists", false);
        }
        cardRepository.save(cardDto);
        return new Result("Car is successfully added", true);
    }

    public Result editCard(Long id, CardDto cardDto){

    }

    public Result deleteCard(Long id) {
        
    }
}
