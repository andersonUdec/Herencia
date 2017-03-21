/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

import java.util.Scanner;
/**
 *
 * @author Anderson Suarez y Andres Chila
 */
public class FigurasGeometricas2 {

    private Scanner teclado;
    
    /**
     * Constructor de la clase
     */
    public FigurasGeometricas2() {
        teclado = new Scanner(System.in);        
        mensajeBienvenida();
        iniciar();
    }
    
    /**
     * Metodo que da la bienvenida al programa
     */
    private void mensajeBienvenida(){
        System.out.println("------BIENVENIDO-----");
        System.out.println("-------USUARIO-------");
    }
    
    /**
     * Metodo que da inicio al menu de opciones
     */
    private void iniciar() {        
        while(true) {
            System.out.println("1. Triangulo 2.Cuadrado 3.Circulo 4.Salir");
            byte opcion =  teclado.nextByte();
            if(opcion == 1){
                iniciarTriangulo();
            } else if(opcion == 2) {
                iniciarCuadrado();
            } else if(opcion == 3) {
                iniciarCirculo();
            } else if(opcion == 4) {
                break;
            } else {
                System.out.println("Numero no valido");
            }
            
        }
    }
    
    /**
     * Metodo que toma las cordenadas del triangulo y llama al objeto para las operaciones
     */
    private void iniciarTriangulo(){
        double x1, y1, x2, y2, x3, y3;
        System.out.println("Digite lado x1");
        x1 = teclado.nextDouble();  
        System.out.println("Digite lado y1");
        y1 = teclado.nextDouble();
        Punto punto = new Punto(x1, y1);
        System.out.println("Digite lado x2");
        x2 = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y2 = teclado.nextDouble();
        System.out.println("Digite lado x3");
        x3 = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y3 = teclado.nextDouble();
        Triangulo triangulo = new Triangulo(x3, y3 , x2, y2);
        triangulo.darResultados();
        triangulo.darTipoTriangulo();
    }
    private void iniciarCuadrado(){
        double x1, y1, x2, y2, x3, y3, x4, y4;
        System.out.println("Digite lado x1");
        x1 = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y1 = teclado.nextDouble();
        Punto punto = new Punto(x1, y1);
        System.out.println("Digite lado x2");
        x2 = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y2 = teclado.nextDouble();
        System.out.println("Digite lado x3");
        x3 = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y3 = teclado.nextDouble();
        System.out.println("Digite lado x4");
        x4 = teclado.nextDouble();
        System.out.println("Digite lado y4");
        y4 = teclado.nextDouble();
        CuadradoRectangulo cuadradoRectangulo = new CuadradoRectangulo(x3, y3, x4, y4, x2, y2);
        cuadradoRectangulo.darResultados();
        cuadradoRectangulo.darTipoCuadradoRectangulo();
    }
    private void iniciarCirculo(){
        double x1, y1, x2, y2;
        System.out.println("Digite lado x1");
        x1 = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y1 = teclado.nextDouble();
        Punto punto = new Punto(x1, y1);
        System.out.println("Digite lado x2");
        x2 = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y2 = teclado.nextDouble();
        Circulo circulo =new Circulo(x2, y2);
        circulo.darResultados();
    }
}
