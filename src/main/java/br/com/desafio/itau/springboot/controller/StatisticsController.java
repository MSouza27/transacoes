package br.com.desafio.itau.springboot.controller;

import br.com.desafio.itau.springboot.dto.StatisticsDTO;
import br.com.desafio.itau.springboot.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
public class StatisticsController {

    private final TransactionService transactionService;

    public StatisticsController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<StatisticsDTO> getStatistics(){
        DoubleSummaryStatistics stats = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsDTO(stats));
    }
}
