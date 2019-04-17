package com.example.SchoolMobile.Data_Classes;

public enum Faltas {

    portugues_a (new String[] {"1", "0", "2", "0"}),
    matematica_a (new String[] {"1", "2", "1", "0"}),
    biologia (new String[] {"0", "0", "0", "0"}),
    geologia (new String[] {"2", "0", "0", "0"}),
    ed_fisica (new String[] {"0", "0", "0", "0"});

    private String[] value;

    Faltas (String[] value){
        this.value = value;
    }

    public String[] getValue () {
        return this.value;
    }
}
