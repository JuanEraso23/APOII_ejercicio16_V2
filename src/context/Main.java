package context;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Cantidad de Calificaciones
        int lim = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Ingrese el número de calificaciones:"
                )
        );

        //Arreglo
        int[] notas = new int[lim];

        double suma = 0;

        //Ingreso de Datos
        for (int i = 0; i < lim; i++) {
            notas[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Ingrese la calificación #" + (i + 1)
                    )
            );

            suma += notas[i];
        }

        //Inicialización
        int max = notas[0];
        int min = notas[0];

        //Búsqueda de Nota Máxima y Mínima
        for (int i = 1; i < lim; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }

            if (notas[i] < min) {
                min = notas[i];
            }
        }

        //Promedio
        double prom = suma / lim;

        //Resultado
        JOptionPane.showMessageDialog(
                null,
                "RESULTADOS\n\n"
                + "Nota Máxima: " + max
                + "\nNota Mínima: " + min
                + "\nPromedio: " + prom
        );
    }
}