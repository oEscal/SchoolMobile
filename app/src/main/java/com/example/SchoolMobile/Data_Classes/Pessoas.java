package com.example.SchoolMobile.Data_Classes;

import java.util.ArrayList;
import java.util.List;

public enum Pessoas {

    prof_portugues_a (new String[] {"José Figueiras", "prof"}),
    prof_matematica_a (new String[] {"Manuel Garrido", "prof"}),
    prof_biologia (new String[] {"Tozé Fonseca", "prof"}),
    prof_geologia (new String[] {"Deolinda Lemos", "prof"}),
    prof_ed_fisica (new String[] {"Cristina Ferreira", "prof"}),
    aluno_1 (new String[] {"Sesário Silva", "aluno"}),
    aluno_2 (new String[] {"Emanuel Santos", "aluno"}),
    aluno_3 (new String[] {"Ermelinda Costa", "aluno"}),
    aluno_4 (new String[] {"Joaquina Silvia", "aluno"}),
    turma_1 (new String[] {"12º A", "turma"}),
    turma_2 (new String[] {"12º B", "turma"});

    private String[] value;

    Pessoas (String[] value){
        this.value = value;
    }

    public static List<String[]> getByName(String name_part) {

        List<String[]> people = new ArrayList();

        for (Pessoas current_p : Pessoas.values())
            if (current_p.value[0].contains(name_part))
                people.add(current_p.value);

        return people;
    }
}
