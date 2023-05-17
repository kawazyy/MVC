package br.fatecrl.mvcdemo.models;

public class Aluno {
    private String ra;
    private String nome;
    private float p1;
    private float p2;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public Aluno(String ra, String nome, float p1, float p2) {
        this.ra = ra;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
}
