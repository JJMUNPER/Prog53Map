package org.losremedios.ut5.actividades.ActividadeMap53;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numeros= {4,6,3,5,9};

        mapNumero(numeros);
    }

    public static void mapNumero (int[] numeros){
        Map<Integer,Integer> cuentaNumeros = new HashMap<>();
        if(!cuentaNumeros.containsValue(6)){
            System.out.println("El valor 6 esta en el map");
        } else {
            System.out.println("El valor 6 no esta en el map");
        }
    }
}
