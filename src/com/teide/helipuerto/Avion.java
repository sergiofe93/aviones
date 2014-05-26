
package com.teide.helipuerto;

public class Avion implements Volador{

    @Override
    public String despegar() {
       return "El avion ha despegado";
    }

    @Override
    public String aterrizar(int metros) {
        return "El avión ha aterrizado con un coste de "+0.8*metros;
    }

}
