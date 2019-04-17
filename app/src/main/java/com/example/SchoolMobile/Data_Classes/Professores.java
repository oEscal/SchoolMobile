package com.example.SchoolMobile.Data_Classes;

public enum Professores {

    portugues_a (new String[] {"José Figueiras", "jfigueiras@josestevao.pt", "210"}),
    matematica_a (new String[] {"Manuel Garrido", "mg@josestevao.pt", "206"}),
    biologia (new String[] {"Tozé Fonseca", "toze@josestevao.pt", "201"}),
    geologia (new String[] {"Deolinda Lemos", "deolemos@josestevao.pt", "212"}),
    ed_fisica (new String[] {"Cristina Ferreira", "crisf@josestevao.pt", "230"});

    private String[] value;

    Professores (String[] value){
        this.value = value;
    }

    public String[] getValue () {
        return this.value;
    }
}
