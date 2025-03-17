package br.com.desafio.itau.springboot.controller;

import br.com.desafio.itau.springboot.dto.TransactionDTO;
import br.com.desafio.itau.springboot.model.Transaction;
import br.com.desafio.itau.springboot.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Void> createTransaction(@RequestBody TransactionDTO dto){
        if (dto.getDataHora().isAfter(OffsetDateTime.now()) || dto.getValor() <= 0){
           return ResponseEntity.unprocessableEntity().build();
        }
        transactionService.addTransaction(new Transaction(dto.getValor(), dto.getDataHora()));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransactions(){
        transactionService.clearTransactions();
        return ResponseEntity.ok().build();
    }
}
