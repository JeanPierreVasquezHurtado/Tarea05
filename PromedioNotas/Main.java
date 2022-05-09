package PromedioNotas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        PromedioDeNotas promedioDeNotas = new PromedioDeNotas();

        int valorA;
        int valorB;
        int valorC;

        valorA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del promedio de tareas academicas:"));
        valorB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del examen de medio curso:"));
        valorC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del examen final de curso:"));

        promedioDeNotas.setPTA(valorA);

        promedioDeNotas.setEMC(valorB);

        promedioDeNotas.setEFC(valorC);


        System.out.println("El promedio final del alumno es: "+promedioDeNotas.getPromedioFinal());

    }
}
