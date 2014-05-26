
package com.teide.helipuerto;

public class PajaroMetalizado implements Volador{
    @Override
    public String despegar() {
       return "El parajo metalizado ha despegado";
    }

    @Override
    public String aterrizar(int metros) {
        return "El parajo metalizado ha aterrizado con un coste de "+0.8*metros;
    }
}
