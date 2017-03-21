/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 * Clase que representa un punto de cordenada en X y Y
 * @author Johans Gonzalez
 */
public class Punto {
    
    /**
     * Atributo que aloja la cordenada x
     */
    public double x1;

    /**
     * Atributo que aloja la cordenada y
     */    
    public double y1;

    /**
     * Constructor de la clase que inicializa las variables
     * @param x1
     * @param y1 
     */
    public Punto(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    /**
     * Retorna el valor de x de la cordenada
     * @return x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * Modifica cordenada x
     * @param x1 
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * Retorna el valor de y de la cordenada
     * @return y1
     */    
    public double getY1() {
        return y1;
    }

    /**
     * Modifica cordenada y
     * @param y1
     */    
    public void setY1(double y1) {
        this.y1 = y1;
    }
                
}
