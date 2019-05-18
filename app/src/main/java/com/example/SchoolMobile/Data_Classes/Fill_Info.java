package com.example.SchoolMobile.Data_Classes;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Fill_Info {


    public static Map<String, List<Schedule>> fill_Schedules() {
        Map<String, List<Schedule>> schedules = new HashMap<>();

        List<Schedule> monday = new ArrayList<>();
        List<Schedule> tuesday = new ArrayList<>();
        List<Schedule> wednesday = new ArrayList<>();
        List<Schedule> thursday = new ArrayList<>();
        List<Schedule> friday = new ArrayList<>();

        monday.add(new Schedule("Biologia", "08:30-10:00", "37"));
        monday.add(new Schedule("Matemática A", "10:20-11:50", "25"));
        schedules.put("Segunda", monday);

        tuesday.add(new Schedule("E. Fisica", "08:30-10:00", "Gin"));
        tuesday.add(new Schedule("Português A", "10:20-11:50", "37"));
        schedules.put("Terça", tuesday);

        wednesday.add(new Schedule("Biologia", "08:30-10:00", "5"));
        wednesday.add(new Schedule("Geologia", "10:20-11:50", "19"));
        wednesday.add(new Schedule("Matemática A", "12:00-13:30", "37"));
        schedules.put("Quarta", wednesday);

        thursday.add(new Schedule("Português A", "08:30-10:00", "39"));
        thursday.add(new Schedule("Matemática A", "10:20-11:50", "25"));
        schedules.put("Quinta", thursday);

        friday.add(new Schedule("Geologia", "08:30-10:00", "22"));
        friday.add(new Schedule("E. Fisica", "10:20-11:50", "Gin"));
        friday.add(new Schedule("Português A", "12:00-12:45", "20"));
        schedules.put("Sexta", friday);

        return schedules;
    }


    public static Map<String, List<Schedule>> fill_Schedules_Docente() {
        Map<String, List<Schedule>> schedules = new HashMap<>();

        List<Schedule> monday = new ArrayList<>();
        List<Schedule> tuesday = new ArrayList<>();
        List<Schedule> wednesday = new ArrayList<>();
        List<Schedule> thursday = new ArrayList<>();
        List<Schedule> friday = new ArrayList<>();

        monday.add(new Schedule("Biologia", "08:30-10:00", "37"));
        monday.add(new Schedule("Geologia", "10:20-11:50", "25"));
        schedules.put("Segunda", monday);


        tuesday.add(new Schedule("Geologia", "10:20-11:50", "37"));
        tuesday.add(new Schedule("Biologia", "12:45-14:35", "37"));
        schedules.put("Terça", tuesday);

        wednesday.add(new Schedule("Biologia", "08:30-10:00", "5"));
        wednesday.add(new Schedule("Geologia", "10:20-11:50", "19"));
        schedules.put("Quarta", wednesday);

        thursday.add(new Schedule("Geologia", "08:30-10:00", "39"));
        schedules.put("Quinta", thursday);

        friday.add(new Schedule("Geologia", "08:30-10:00", "22"));
        friday.add(new Schedule("Biologia", "12:00-13:30", "20"));
        friday.add(new Schedule("Geologia", "13:50-14:35", "22"));
        schedules.put("Sexta", friday);

        return schedules;
    }


    public static Map<String,Menu> fill_Menu() {
        Map<String, Menu> menus = new LinkedHashMap<>();

        menus.put("Segunda",new Menu("Sopa de Legumes","Gratinado de atum com massa espiral e legumes","Fruta da época"));
        menus.put("Terça",new Menu("Sopa de alho-francês","Feijoada à caseira","Fruta da época"));
        menus.put("Quarta",new Menu("Sopa de curgete","Bacalhau com natas","Fruta da época"));
        menus.put("Quinta",new Menu("Creme de abóbora e espinafres","Hambúrguer de aves com macarrão colorido","Gelatina de ananás"));
        menus.put("Sexta",new Menu("Caldo verde","Lasanha","Fruta da época "));

        return menus;
    }

    public static List<String> fill_team(String key) {
        Map<String,List<String>> teams= new LinkedHashMap<>();
        List<String> a = new ArrayList<>();

        a.add("Adriana Amarante Teixeira");
        a.add("Afonso Guilherme Lapão Martins");
        a.add("Alexandre Daniel Torres");
        a.add("Ana Carolina Peixoto Leitão");
        a.add("Ana Catarina Branco Nunes");
        a.add("António José Gonçalves Costa Silva");
        a.add("Beatriz Goulart da Silva Pinheiro");
        a.add("Daniel Alexandre Ferreira da Rocha");
        a.add("Diogo Miguel Rodrigues Osório Vaz Lopes");
        a.add("Gonçalo Filipe José Branco Silva");
        a.add("Henrique Rodrigues Amarante");
        a.add("Inês Ferrreira dos Santos");
        a.add("Inês Sofia Almeida Vieira");
        a.add("Iolanda Sofia Dias Magalhães");
        a.add("Jessica Lea de Bono Mesquita");
        a.add("Joana Filipa Matias Delgado");
        a.add("Joana Filipa Veiga Barbosa");
        a.add("Joana Matos Silva Mendes dos Reis");
        a.add("João Marcos Magro Velez");
        a.add("José Nuno Costa Oliveira");
        a.add("Luísa Veríssimo Alves Bento");
        a.add("Mafalda Sabrosa Pinto Coelho");
        a.add("Maria João Canha Pereira");
        a.add("Melanie Jessica Monteiro");
        a.add("Raissa Corrêa Xavier de Almeida");
        a.add("Ricardo Alexandre Pereira de Almeida");
        a.add("Sara Cardoso Rodrigues Correia");
        a.add("Susana Breiro Bento");
        a.add("Tiago Alexandre Vieira Pedro");

        teams.put("12A",a);

        List<String> b = new ArrayList<>();

        b.add("Ana Catarina Batista Cardoso");
        b.add("André Castelo Ferreira");
        b.add("André Eduardo Matias Vaz Ferreira de Almeida");
        b.add("Andre Nunes Correia Gouveia");
        b.add("Carolina Isabel Alves");
        b.add("Cláudio Alexandre Rodrigues Ferro");
        b.add("Daniel Jorge Silva");
        b.add("Fábio André Dias Aguilar Correia");
        b.add("Filipe Miguel Gorgulho Santos Calapez Xavier");
        b.add("Gonçalo Miguel Ribeiro de Sá Caetano");
        b.add("Inês Flora Lopes");
        b.add("Isabel Maria de Almeida Rodrigues");
        b.add("Joana Filipa Santos Pinto");
        b.add("Joana Isabel Lopes Maia");
        b.add("Joana Teresa Xisto");
        b.add("João Campos Moreira Rodrigues");
        b.add("João Manuel de Jesus Silva");
        b.add("João Manuel Francisco Alves");
        b.add("João Nuno Vidal Bruno");
        b.add("João Pedro da Silva Santos");
        b.add("Jorge Miguel Alexandre Silva");
        b.add("Leandro Filipe Paulo de Almeida");
        b.add("Maria Antoci");
        b.add("Maria Constantino Borges");
        b.add("Maria João Esgueira Simões");
        b.add("Olga Tatiana Pereira Barros");
        b.add("Ricardo Ranito Vicente");
        b.add("Sofia Almeida Correia de Oliveira Pinto");
        b.add("Tiago Corrêa Mendes da Silva Ribeiro");


        teams.put("12B", b);

        return teams.get(key);
    }

    public static Map<String,String> fill_aulas() {


        int minus_day[] = new int [] {0,2,5};


        Map<String,String> aulas = new LinkedHashMap<>();

        Date date = new Date();
        Calendar cal = Calendar.getInstance();


        String pattern = "dd-MM-yyyy";
        int counter = 0;
        for(int i=15;i>=1;i--) {


            cal.setTime(date);
            cal.add(Calendar.DATE, -minus_day[counter % 3]);
            minus_day[counter % 3]+=7;
            counter+=1;
            String dateInString =new SimpleDateFormat(pattern).format(cal.getTime());
            aulas.put("Aula "+i,"Data: "+dateInString);
        }


        return aulas;
    }
}
