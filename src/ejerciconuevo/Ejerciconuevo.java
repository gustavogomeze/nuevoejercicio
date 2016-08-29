/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciconuevo;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Ejerciconuevo {
      /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector= new Scanner(System.in);
        double [][] calificaciones= new double[3][5];
        int sw=0;
        double suma=0;
        int fila;
        for (fila=0; fila<3; fila++){
            
            for (int columna=0; columna<4; columna++){
                int c=columna+1;
                int f=fila+1;
                System.out.println("Ingrese la nota "+c+" del alumno "+f);
                double nota=lector.nextDouble();
                switch (c) {
                    case 1:
                        calificaciones [fila][columna]=nota*0.25;
                        //System.out.println("nota def: "+calificaciones[fila][columna]);
                        break;
                    case 2:
                        calificaciones [fila][columna]=nota*0.2;
                        //System.out.println("nota def: "+calificaciones[fila][columna]);
                        break;
                    case 3:
                        calificaciones [fila][columna]=nota*0.25;
                        //System.out.println("nota def: "+calificaciones[fila][columna]);
                        break;
                    case 4:
                        calificaciones [fila][columna]=nota*0.3;
                        //System.out.println("nota def: "+calificaciones[fila][columna]);
                        break;
                    //default:
                       // break;
                }
                             
            //suma= suma+calificaciones[fila][columna];
            //calificaciones[fila][4]=suma;
            //if (columna==4)calificaciones [fila][columna]=suma;
            }
            
            
        }
        int opcion=0;
        //while (opcion!=4)
        
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Consultar nota definitiva de un estudiante");
            System.out.println("2. Consultar promedio del curso");
            System.out.println("3. Consultar porcentaje de perdedores del curso");
            System.out.println("4. Salir");
            opcion=lector.nextInt();
        
        switch (opcion) {
            case 1:
               System.out.println("Ingrese el numero del estudiante:");
               int est=lector.nextInt();
               int f=est-1;
               suma=0;
               for(int c=0;c<4;c++){
                  suma=suma+calificaciones[f][c]; 
               }
               calificaciones[f][4]=suma;
               
               System.out.println("El promedio del estudiante "+est+" es: "+calificaciones[f][4]);
               break;
               
            case 2:
                suma=0;
                for (fila=0; fila<3; fila++){
                    suma= suma+calificaciones[fila][4];                    
                }
                double prom=suma/3;
                System.out.println("El promedio del curso es: "+prom);
                break;
                
            case 3:
                int contador=0;
                for (fila=0; fila<3; fila++){
                    if (calificaciones[fila][4]<3) contador++;                    
                }
                double pPerdedor=contador*10;
                System.out.println("El porcentaje de perdedores del curso es: "+pPerdedor+" %");
                break;  
            
            case 4:
                sw=2;
                
            default:
                    System.out.println("Ingrese una opcion valida");
                        break;
        }
        
        }
        while (sw!=2);
    }
}
    /**
     * @param args the command line arguments
     */
    