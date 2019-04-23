package com.ciceonline;

import com.ciceonline.genericas.ClaseGenerica;
import com.ciceonline.genericas.ClaseStandard;

public class Main {

    public static void main(String[] args) {

        ClaseStandard claseA = new ClaseStandard();

        //Creamos el Objeto para ClaseGenerica, donde tenemos q indicar el tipo
        //<T><String> <S><Boolean>

        ClaseGenerica<String, String> claseB = new ClaseGenerica<>();
        ClaseGenerica<Boolean, String> claseC = new ClaseGenerica<>();



    }
}
