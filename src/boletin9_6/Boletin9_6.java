package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin9_6 {

    
    public static void main(String[] args) {
    int sueldo;
    double ricos=0;
    double pobres=0;
    sueldo= Integer.parseInt(JOptionPane.showInputDialog("Sueldo:"));
    do {
    if (sueldo<=1750&sueldo>=1000){
        ricos= ricos+1;
    }
    else{
        pobres= pobres+1;
    }
    sueldo= Integer.parseInt(JOptionPane.showInputDialog("Teclea Sueldo:"));
    }while (sueldo !=0);
    JOptionPane.showMessageDialog(null,"Trabajadores que ganan más de 1000€: "
    +ricos+"\nporcentaje trabajadores que cobran menos de 100€: "+pobres/(pobres+ricos)*100+"%");
    }
    
}
