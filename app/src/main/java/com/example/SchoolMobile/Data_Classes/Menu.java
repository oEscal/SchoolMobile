package com.example.SchoolMobile.Data_Classes;

import java.util.Map;

public class Menu {
    private String sopa;
    private String prato;
    private String sobremesa;

    public Menu(String sopa,String prato, String sobremesa) {
        this.sopa=sopa;
        this.prato=prato;
        this.sobremesa=sobremesa;
    }

    public String getPrato() {
        return prato;
    }

    public String getSobremesa() {
        return sobremesa;
    }


    public String getSopa() {
        return sopa;
    }
}
