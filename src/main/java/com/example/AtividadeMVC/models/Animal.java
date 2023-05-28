package com.example.AtividadeMVC.models;

public class Animal {
    private String especie;
    private String cor;
    private boolean mamifero;
    private int idadeMax;

    public Animal(String especie, String cor, boolean mamifero, int idadeMax) {
        this.especie = especie;
        this.cor = cor;
        this.mamifero = mamifero;
        this.idadeMax = idadeMax;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isMamifero() {
        return mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }

    public int getIdadeMax() {
        return idadeMax;
    }

    public void setIdadeMax(int idadeMax) {
        this.idadeMax = idadeMax;
    }
}
