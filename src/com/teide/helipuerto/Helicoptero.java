package com.teide.helipuerto;

public class Helicoptero implements Volador{
    
    @Override
    public String despegar() {
       return "El helicoptero ha despegado";
    }

    @Override
    public String aterrizar(int metros) {
        return "El helicoptero ha aterrizado con un coste de "+0.8*metros;
    }

}