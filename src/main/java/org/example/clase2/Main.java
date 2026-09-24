package org.example.clase2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void imprimirNombres(List<String> nombres) {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    public static boolean contiene(List<String> lista, String valor) {
        for (String elemento : lista) {
            if (elemento.equals(valor)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> filtrarPorTexto(List<String> lista, String texto) {

        List<String> resultado = new ArrayList<>();

        for (String elemento : lista) {
            if (elemento.contains(texto)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }

    public static Map<Long, String> generarMapa() {

        Map<Long, String> personas = new HashMap<>();

        personas.put(1L, "Juan Melo");
        personas.put(2L, "Susana Gimenez");
        personas.put(3L, "Ana Perez");

        return personas;
    }

    public static boolean existeClave(Map<Long, String> mapa, Long clave) {
        return mapa.containsKey(clave);
    }

    public static String obtenerValor(Map<Long, String> mapa, Long clave) {
        return mapa.get(clave);
    }

    public static void main(String[] args) {

        List<String> nombres = List.of(
                "Juan Melo",
                "Susana Gimenez",
                "Pedro Melo",
                "Ana Perez"
        );

        System.out.println("LISTADO COMPLETO:");
        imprimirNombres(nombres);

        boolean existe = contiene(nombres, "Juan Melo");

        System.out.println("\n¿Existe Juan Melo?");
        System.out.println(existe);

        List<String> encontrados = filtrarPorTexto(nombres, "Melo");

        System.out.println("\nNombres que contienen 'Melo':");
        imprimirNombres(encontrados);

        Map<Long, String> personas = generarMapa();

        System.out.println("\n¿Existe la clave 2?");
        System.out.println(existeClave(personas, 2L));

        System.out.println("\nValor asociado a la clave 2:");
        System.out.println(obtenerValor(personas, 2L));
    }
}