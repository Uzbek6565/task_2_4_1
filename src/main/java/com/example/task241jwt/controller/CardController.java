package com.example.task241jwt.controller;

import com.example.task241jwt.mesasge.Result;
import com.example.task241jwt.payload.CardDto;
import com.example.task241jwt.service.CardService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/card")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public HttpEntity<?> getCards(){
        List<CardDto> cards = cardService.getCards();
        return ResponseEntity.ok(cards);
    }

    @PostMapping
    public HttpEntity<?> addCard(@RequestBody CardDto cardDto){
        Result result = cardService.addCard(cardDto);
        return ResponseEntity.status(result.getStatus() ? 201 : 400).body(result);
    }

    @PutMapping("/{id}")
    public HttpEntity<?> editCard(@PathVariable Long id, @RequestBody CardDto cardDto){
        Result result = cardService.editCard(id, cardDto);
        return ResponseEntity.status(result.getStatus() ? 202 : 400).body(result);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteCard(@PathVariable Long id){
        Result result = cardService.deleteCard(id);
        return ResponseEntity.status(result.getStatus() ? 204 : 400).body(result);
    }
}
