/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *
 * @author Anderson Suarez y Andres Chila
 */
public class Circulo extends Hija {

    
    private double perimetro;

    public Circulo(double x2, double y2) {
        super(x2, y2);
    }
    
    
        /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        System.out.println("Radio: " + darRadio());
        System.out.println("Perimetro: " + darPerimetro());
        System.out.println("Diametro: " + darDiametro());           
    }
     /**
     * Retorma longitud del radio
     * @return 
     */
    private double darRadio(){
        double auxiliarX = Math.pow(x2 - x1, 2);
        double auxiliarY = Math.pow(y2 - y1, 2);
        
        double radio = Math.sqrt(auxiliarX +  auxiliarY);
        return radio;
    }
    private double darPerimetro(){
        this.perimetro = 2*Math.PI*(darRadio());
        return this.perimetro;
    }
    private double darDiametro(){
        double diametro = darRadio()*2;
        return diametro;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
   
}
