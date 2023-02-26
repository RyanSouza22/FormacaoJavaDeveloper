package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate date;

    public Mentoria() {
    }

    //getters and setters

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", date=" + this.date +
                '}';
    }
}
