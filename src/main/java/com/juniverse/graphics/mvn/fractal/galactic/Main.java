package com.juniverse.graphics.mvn.fractal.galactic;

import javax.swing.SwingUtilities;

/**
 *
 * @author Java Universe
 */
public class Main {

    /**
     * Punto de entrada: abre la ventana del fractal en el hilo de Swing.
     * @param args no se usan
     */
    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> Galactic.createWin("Galactic", 640, 480));
    }
}
