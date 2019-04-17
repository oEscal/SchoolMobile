package com.example.SchoolMobile.Data_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisciplinasInfo {

    private Map<Disciplinas, ArrayList<String>> info_prof;
    private Map<Disciplinas, ArrayList<String>> info_faltas;

    public DisciplinasInfo() {

        this.info_prof = new HashMap<>();
        this.info_faltas = new HashMap<>();

        this.info_prof.put(Disciplinas.biologia, new ArrayList<>(Arrays.asList(Professores.biologia.getValue())));
        this.info_prof.put(Disciplinas.ed_fisica, new ArrayList<>(Arrays.asList(Professores.ed_fisica.getValue())));
        this.info_prof.put(Disciplinas.geologia, new ArrayList<>(Arrays.asList(Professores.geologia.getValue())));
        this.info_prof.put(Disciplinas.matematica_a, new ArrayList<>(Arrays.asList(Professores.matematica_a.getValue())));
        this.info_prof.put(Disciplinas.portugues_a, new ArrayList<>(Arrays.asList(Professores.portugues_a.getValue())));

        this.info_faltas.put(Disciplinas.biologia, new ArrayList<>(Arrays.asList(Faltas.biologia.getValue())));
        this.info_faltas.put(Disciplinas.ed_fisica, new ArrayList<>(Arrays.asList(Faltas.ed_fisica.getValue())));
        this.info_faltas.put(Disciplinas.geologia, new ArrayList<>(Arrays.asList(Faltas.geologia.getValue())));
        this.info_faltas.put(Disciplinas.matematica_a, new ArrayList<>(Arrays.asList(Faltas.matematica_a.getValue())));
        this.info_faltas.put(Disciplinas.portugues_a, new ArrayList<>(Arrays.asList(Faltas.portugues_a.getValue())));
    }

    public List<String> getProfInfo(Disciplinas d) {

        return (List<String>) this.info_prof.get(d).clone();
    }

    public List<String> getFaltasInfo(Disciplinas d) {

        return (List<String>) this.info_faltas.get(d).clone();
    }
}
