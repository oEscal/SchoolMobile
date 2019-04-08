package com.example.SchoolMobile.Data_Classes;

public class Schedule {
    private String subject;
    private String time;
    private String sala;

    public Schedule(String s, String t, String sa) {
        this.subject = s;
        this.time = t;
        this.sala = sa;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getTime() {
        return this.time;
    }
    public String getSala() { return this.sala; }
}
