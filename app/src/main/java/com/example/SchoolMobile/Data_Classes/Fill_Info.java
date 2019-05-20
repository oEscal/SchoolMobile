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

    public static List<Aluno> fill_team(String key) {
        Map<String,List<Aluno>> teams= new LinkedHashMap<>();
        List<Aluno> a = new ArrayList<>();
        a.add(new Aluno("Adriana Amarante Teixeira",new int[] { 1,1,0,1 }));
        a.add(new Aluno("Afonso Guilherme Lapão Martins",new int[] { 0,0,1,0 }));
        a.add(new Aluno("Alexandre Daniel Torres",new int[] { 1,1,2,0 }));
        a.add(new Aluno("Ana Carolina Peixoto Leitão",new int[] { 2,2,0,1 }));
        a.add(new Aluno("Ana Catarina Branco Nunes",new int[] { 1,2,1,0 }));
        a.add(new Aluno("António José Gonçalves Costa Silva",new int[] { 2,2,2,0 }));
        a.add(new Aluno("Beatriz Goulart da Silva Pinheiro",new int[] { 0,2,1,1 }));
        a.add(new Aluno("Bruno Pinheiro",new int[] { 2,0,1,2 }));
        a.add(new Aluno("Daniel Alexandre Ferreira da Rocha",new int[] { 2,0,1,1 }));
        a.add(new Aluno("Diogo Miguel Rodrigues Osório Vaz Lopes",new int[] { 0,2,0,1 }));
        a.add(new Aluno("Gonçalo Filipe José Branco Silva",new int[] { 2,0,2,2 }));
        a.add(new Aluno("Henrique Rodrigues Amarante",new int[] { 1,2,0,0 }));
        a.add(new Aluno("Inês Ferrreira dos Santos",new int[] { 0,0,0,0 }));
        a.add(new Aluno("Inês Sofia Almeida Vieira",new int[] { 2,1,0,1 }));
        a.add(new Aluno("Iolanda Sofia Dias Magalhães",new int[] { 1,2,0,0 }));
        a.add(new Aluno("Jessica Lea de Bono Mesquita",new int[] { 1,0,1,0 }));
        a.add(new Aluno("Joana Filipa Matias Delgado",new int[] { 1,2,1,2 }));
        a.add(new Aluno("Joana Filipa Veiga Barbosa",new int[] { 1,2,2,1 }));
        a.add(new Aluno("Joana Matos Silva Mendes dos Reis",new int[] { 0,0,0,2 }));
        a.add(new Aluno("João Marcos Magro Velez",new int[] { 0,2,0,1 }));
        a.add(new Aluno("José Nuno Costa Oliveira",new int[] { 0,0,2,2 }));
        a.add(new Aluno("Luísa Veríssimo Alves Bento",new int[] { 0,0,2,1 }));
        a.add(new Aluno("Mafalda Sabrosa Pinto Coelho",new int[] { 0,1,1,1 }));
        a.add(new Aluno("Maria João Canha Pereira",new int[] { 2,1,0,2 }));
        a.add(new Aluno("Melanie Jessica Monteiro",new int[] { 2,1,1,2 }));
        a.add(new Aluno("Raissa Corrêa Xavier de Almeida",new int[] { 1,0,0,1 }));
        a.add(new Aluno("Ricardo Alexandre Pereira de Almeida",new int[] { 1,0,1,1 }));
        a.add(new Aluno("Sara Cardoso Rodrigues Correia",new int[] { 2,1,1,2 }));
        a.add(new Aluno("Susana Breiro Bento",new int[] { 1,1,0,0 }));
        a.add(new Aluno("Tiago Alexandre Vieira Pedro",new int[] { 0,2,2,0 }));


        teams.put("12A",a);

        List<Aluno> b = new ArrayList<>();

        b.add(new Aluno("Ana Catarina Batista Cardoso",new int[] { 2,1,1,2 }));
        b.add(new Aluno("André Castelo Ferreira",new int[] { 1,2,2,2 }));
        b.add(new Aluno("André Eduardo Matias Vaz Ferreira de Almeida",new int[] { 1,2,2,1 }));
        b.add(new Aluno("Andre Nunes Correia Gouveia",new int[] { 1,2,1,1 }));
        b.add(new Aluno("Carolina Isabel Alves",new int[] { 1,0,2,1 }));
        b.add(new Aluno("Cláudio Alexandre Rodrigues Ferro",new int[] { 1,0,1,0 }));
        b.add(new Aluno("Daniel Jorge Silva",new int[] { 1,1,0,1 }));
        b.add(new Aluno("Fábio André Dias Aguilar Correia",new int[] { 0,0,2,0 }));
        b.add(new Aluno("Filipe Miguel Gorgulho Santos Calapez Xavier",new int[] { 2,0,1,2 }));
        b.add(new Aluno("Gonçalo Miguel Ribeiro de Sá Caetano",new int[] { 2,1,1,2 }));
        b.add(new Aluno("Inês Flora Lopes",new int[] { 0,0,2,1 }));
        b.add(new Aluno("Isabel Maria de Almeida Rodrigues",new int[] { 1,1,1,2 }));
        b.add(new Aluno("Joana Filipa Santos Pinto",new int[] { 0,0,1,1 }));
        b.add(new Aluno("Joana Isabel Lopes Maia",new int[] { 0,1,0,0 }));
        b.add(new Aluno("Joana Teresa Xisto",new int[] { 0,1,2,1 }));
        b.add(new Aluno("João Campos Moreira Rodrigues",new int[] { 1,0,1,2 }));
        b.add(new Aluno("João Manuel de Jesus Silva",new int[] { 0,2,0,0 }));
        b.add(new Aluno("João Manuel Francisco Alves",new int[] { 2,0,0,1 }));
        b.add(new Aluno("João Nuno Vidal Bruno",new int[] { 2,2,1,2 }));
        b.add(new Aluno("João Pedro da Silva Santos",new int[] { 2,0,0,2 }));
        b.add(new Aluno("Jorge Miguel Alexandre Silva",new int[] { 1,2,0,0 }));
        b.add(new Aluno("Leandro Filipe Paulo de Almeida",new int[] { 2,1,2,1 }));
        b.add(new Aluno("Maria Antoci",new int[] { 1,2,1,2 }));
        b.add(new Aluno("Maria Constantino Borges",new int[] { 1,2,2,1 }));
        b.add(new Aluno("Maria João Esgueira Simões",new int[] { 0,1,2,0 }));
        b.add(new Aluno("Olga Tatiana Pereira Barros",new int[] { 1,1,0,0 }));
        b.add(new Aluno("Ricardo Ranito Vicente",new int[] { 2,1,1,1 }));
        b.add(new Aluno("Sofia Almeida Correia de Oliveira Pinto",new int[] { 2,1,0,1 }));
        b.add(new Aluno("Tiago Corrêa Mendes da Silva Ribeiro",new int[] { 1,2,0,0 }));


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
