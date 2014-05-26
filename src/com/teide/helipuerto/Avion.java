
package com.teide.helipuerto;

public class Avion implements Volador{

    @Override
    public String despegar() {
       return"El avión ha aterrizado con un coste de";
    }

    @Override
    public String aterrizar(int metros) {
        return "El avion ha despegado";
    }

}
