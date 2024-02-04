package dolare_euros;

import javax.swing.JOptionPane;

public class Dolare_euros {

    public static void main(String[] args) {
        int Pesos;

        Pesos = Integer.parseInt(JOptionPane.showInputDialog("Digita que conversion queres hacer"));

        switch (Pesos) {
            case 1:
                int dolares = 20,
                 dol;
                int Conversion = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad"));

                dol = Conversion / dolares;
                JOptionPane.showMessageDialog(null, "La cantidad de doloares a pesos  es: " + dol);
                break;
                
            case 2:
                int eu = 22,
                 conver;
                int conv = Integer.parseInt(JOptionPane.showInputDialog("Digita la Dolares"));                
                
                
                conver = eu * conv;
                JOptionPane.showMessageDialog(null, "La cantidad de Dolares a euros es: " + conver);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No has selecionado ninguna conversion");

        }
    }

}