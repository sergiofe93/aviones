package com.teide.helipuerto;

import java.util.ArrayList;

public class Helipuerto {
    
        private ArrayList<Volador> listado = new ArrayList<>();
        
        public void añadir(Volador v){
            listado.add(v);
        }
        
        public boolean eliminar(int pos){
            if(pos < listado.size() ) {
                listado.remove(pos);
                return true;
            } return false;            
        }
        public String permisoParaDespegar(int pos){
            if(pos < listado.size() ) return listado.get(pos).despegar();     
            return null;             
        }
        public String permisoParaAterrizar(int pos, int metros){
            if(pos < listado.size() ) return listado.get(pos).aterrizar(metros);     
            return null; 
            
        }
        
}