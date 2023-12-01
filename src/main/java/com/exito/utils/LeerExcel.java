package com.exito.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class LeerExcel {

    private static ArrayList<Map<String,String>> LeerExcelInicioSesion = new ArrayList<>();

    public String email;
    public String password;

    public LeerExcel() {

        try {
            LeerExcelInicioSesion = DatosExcel.leerExcel("src/main/resources/Data/DatosLogin.xlsx", "InicioSesion");
            email = LeerExcelInicioSesion.get(0).get("Usuario");
            password = LeerExcelInicioSesion.get(0).get("Password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
