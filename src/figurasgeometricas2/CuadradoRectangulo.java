/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *Clase que representa un Cuadrado/Rectangulo con sus operaciones
 * @author Anderson Suarez y Andres Chila
 */
public class CuadradoRectangulo extends Hija {
       /**
     * Atributo que contiene la cordenada x1 y1
     */
    private double x3;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private double y3;

    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private double x4;
    /**
    * Atributo que contiene la cordenada x4 y4
    */
    private double y4;
    
    private double perimetro;
    /**
    * Metodo que da los resultados del triangulo
    */
    
    public CuadradoRectangulo(double x3, double y3, double x4, double y4, double x2, double y2) {
        super(x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public void darResultados() {
        if(isCuadrado()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Lado4: " + darLado4());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isCuadrado() {
        return !(x1 == x2 && y1 == y2);
    }
     /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(x2 - x1, 2);
        double auxiliarY = Math.pow(y2 - y1, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(x3 - x2, 2);
        double auxiliarY = Math.pow(y3 - y2, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CD
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(x4 - x3, 2);
        double auxiliarY = Math.pow(y4 - y3, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     /**
     * Retorma longitud de lado DA
     * @return 
     */
    private double darLado4(){
        double auxiliarX = Math.pow(x1 - x4, 2);
        double auxiliarY = Math.pow(y1 - y4, 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3() + darLado4();
        return this.perimetro;
    } 
    private double darArea() {     
        double area = darLado1()*darLado2();
        return area;
    }
    public void darTipoCuadradoRectangulo(){
        if(darLado1() == darLado2()){
            System.out.println("Es un cuadrado");
        }else if(darLado1() != darLado2()){
            System.out.println("Es un rectangulo");
        }
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
     
   
}
