package InteresCom;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        InteresCompuesto interesCompuesto = new InteresCompuesto();

        float valorA;
        float valorB;
        float valorC;

        valorA = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la capital: "));
        valorB = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tasa de interes: "));
        valorC = Float.parseFloat(JOptionPane.showInputDialog("Ingrese le numero de peridos(tiempo): "));

        interesCompuesto.setCapital(valorA);
        interesCompuesto.setTasaInteres(valorB);
        interesCompuesto.setNumPerio(valorC);

        System.out.println("El importe acumulado es:  "+interesCompuesto.getImporteAcumulado());



    }
}
