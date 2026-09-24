package org.example.clase2;
import java.util.List;

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

    public static void main(String[] args) {
        List<String> nombres = List.of(
                "Ana",
                "Juan",
                "María",
                "Pedro"
        );

        imprimirNombres(nombres);

        boolean resultado = contiene(nombres, "Juan");

        System.out.println(resultado);
    }
}
