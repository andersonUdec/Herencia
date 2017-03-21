/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 * Clase que representa un triangulo con sus operaciones
 * @author Anderson Suarez y Andres Chila
 */
public class Triangulo extends Hija{

    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private double x3;
    /**
     * Atributo que aloja la cordenada y3
     */
    private double y3;
    /**
     * Guarda el perimetro del triangulo
     */
    private double perimetro;

    public Triangulo(double x3, double y3, double x2, double y2) {
        super(x2, y2);
        this.x3 = x3;
        this.y3 = y3;
    }

    
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
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
    private boolean isTriangulo() {
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
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(x1 - x3, 2);
        double auxiliarY = Math.pow(y1 - y3, 2);
      
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    
    /**
     * Metodo que retorna el tipo de triangulo
     * 
     */
    public void darTipoTriangulo(){
        if(darLado1() == darLado2() & darLado1() == darLado3() & darLado2() == darLado3()){
            System.out.println("El triangulo es Equilatero");
        }else if(darLado1() != darLado2() & darLado1()!= darLado3() & darLado2()!= darLado3()){
            System.out.println("El triangulo es Escaleno");
        }else System.out.println("El triangulo es Isosceles");
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

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }  
}
