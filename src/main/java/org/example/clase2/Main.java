package org.example.clase2;

        import java.util.List;

        public class Main {

            public static void imprimirNombres(List<String> nombres) {
                for (String nombre : nombres) {
                    System.out.println(nombre);
                }
            }

            public static void main(String[] args) {
                List<String> nombres = List.of("Ana", "Juan", "María", "Pedro");

                imprimirNombres(nombres);
            }
        }


