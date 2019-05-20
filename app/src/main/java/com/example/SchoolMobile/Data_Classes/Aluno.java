package com.example.SchoolMobile.Data_Classes;

public class Aluno {
    private String nome;
    private int faltas[];
    private boolean is_changed;

    public Aluno(String nome, int faltas[]) {
        this.nome = nome;
        this.faltas = faltas;
        this.is_changed = false;
    }

    public String getNome() {
        return nome;
    }

    public int[] getFaltas() {
        return faltas;
    }

    public boolean get_is_changed() {
        return this.is_changed;
    }

    public void set_is_changed(boolean s) {
        this.is_changed =s;
    }

}
