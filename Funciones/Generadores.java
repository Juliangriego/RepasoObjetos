package Funciones;

import java.lang.Math;

public class Generadores {
    public static String CodCliente(){
        //Genera un código de cliente a partir de un número aleatorio entre 100 y 200
        return Integer.toString((int)(100+(Math.random()*100)));
    }
}
