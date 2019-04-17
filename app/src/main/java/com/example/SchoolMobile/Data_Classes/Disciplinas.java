package com.example.SchoolMobile.Data_Classes;

public enum Disciplinas {

    portugues_a ("Português A"),
    matematica_a ("Matemática A"),
    biologia ("Biologia"),
    geologia ("Geologia"),
    ed_fisica ("E. Fisica");

    private String value;

    Disciplinas (String value){
        this.value = value;
    }

    public String getValue () {
        return this.value;
    }

    public static Disciplinas value (String value) {

        if (value.equals(portugues_a.value))
            return portugues_a;
        if (value.equals(matematica_a.value))
            return matematica_a;
        if (value.equals(biologia.value))
            return biologia;
        if (value.equals(geologia.value))
            return geologia;
        if (value.equals(ed_fisica.value))
            return ed_fisica;
        return null;
    }
}
