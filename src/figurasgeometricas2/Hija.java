/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *
 * @author ander
 */
public class Hija extends Punto{
    /**
     * Atributo que aloja la cordenada x2
     */
    public double x2;
    /**
     * Atributo que aloja la cordenada y2
     */
    public double y2;
    /**
     * Constructor de la clase que inicializa las variables
     * @param x1
     * @param y1 
     */
    public Hija(double x1, double y1) {
        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }
    /**
     * Retorna el valor de x2 de la cordenada
     * @return x2
     */
    public double getX2() {
        return x2;
    }
    /**
     * Modifica cordenada x2
     * @param x2 
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    /**
     * Retorna el valor de y2 de la cordenada
     * @return y2
     */
    public double getY2() {
        return y2;
    }
    /**
     * Modifica cordenada y2
     * @param y2 
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    
}
