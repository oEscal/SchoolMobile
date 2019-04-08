package com.example.SchoolMobile.Data_Classes;


import java.util.ArrayList;
import java.util.HashMap;
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

        tuesday.add(new Schedule("E Física", "08:30-10:00", "Gin"));
        tuesday.add(new Schedule("Português A", "10:20-11:50", "37"));
        schedules.put("Terca", tuesday);

        wednesday.add(new Schedule("Biologia", "08:30-10:00", "5"));
        wednesday.add(new Schedule("Geologia", "10:20-11:50", "19"));
        wednesday.add(new Schedule("Matemática A", "12:00-13:30", "37"));
        schedules.put("Quarta", wednesday);

        thursday.add(new Schedule("Português A", "08:30-10:00", "39"));
        thursday.add(new Schedule("Matemática A", "10:20-11:50", "25"));
        schedules.put("Quinta", thursday);

        friday.add(new Schedule("Geologia", "08:30-10:00", "22"));
        friday.add(new Schedule("E Física", "10:20-11:50", "Gin"));
        friday.add(new Schedule("Português A", "12:00-12:45", "20"));
        schedules.put("Sexta", friday);

        return schedules;
    }
}
