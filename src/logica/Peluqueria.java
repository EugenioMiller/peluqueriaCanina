package logica;

import igu.Pantalla;

public class Peluqueria {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        
        Pantalla pantalla = new Pantalla(control);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);       
        
    }
    
}
