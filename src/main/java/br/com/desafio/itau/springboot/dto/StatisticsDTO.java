package br.com.desafio.itau.springboot.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsDTO {

    private long quantidade;
    private double soma;
    private double media;
    private double minimo;
    private double maximo;

    public StatisticsDTO(DoubleSummaryStatistics stats) {
        this.quantidade = stats.getCount();
        this.soma = stats.getSum();
        this.media = stats.getAverage();
        this.minimo = stats.getMin();
        this.maximo = stats.getMax();
    }

    public long getQuantidade() {
        return quantidade;
    }

    public double getSoma() {
        return soma;
    }

    public double getMedia() {
        return media;
    }

    public double getMinimo() {
        return minimo;
    }

    public double getMaximo() {
        return maximo;
    }
}
