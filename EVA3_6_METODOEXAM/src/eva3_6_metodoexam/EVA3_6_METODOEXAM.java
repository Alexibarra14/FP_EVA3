/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_metodoexam;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA3_6_METODOEXAM {
    public static int empate= 0;
    public static int ganas=1;
    public static int pierdes=2;
public static final int piedra = 1;
public static final int papel= 2;
public static final int tijera=3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jugada;
        int jugadac;
        int reglas;
                
        do{
            jugada= capturaDeDatos("INTRODUCE TU ELECCION 1= PIEDRA 2= PAPEL 3=tijera 0= salir");
            jugadac= generarCompu();
            reglas = evaluacion(jugada, jugadac);
        }while(jugada!=0);
    }
    public static int capturaDeDatos(String mensaje){
        Scanner cap= new Scanner(System.in);
        int resu= cap.nextInt();
        return resu;
    }public static int generarCompu(){
        int resu;
        double valor=Math.random();
        if(valor>=0 && valor<=0.3)
            resu=1;
        else  if(valor>=0.3 && valor<=0.6)
            resu = 2;
        else
            resu=3;
        return resu;
    } public static int evaluacion(int jugadau, int jugadac){
      int resu;
        if(jugadau==piedra && jugadac ==piedra)
            resu= empate;
        else if (jugadau==piedra && jugadac ==papel)
            resu=pierdes;
        else if   (jugadau==piedra && jugadac ==tijera)
            resu=ganas;
        else if (jugadau==papel && jugadac ==piedra)
            resu = ganas;
        else if(jugadau==papel && jugadac ==papel)
            resu=empate;
        else if(jugadau==papel && jugadac ==tijera)
            resu= pierdes;
        else if(jugadau==tijera && jugadac ==piedra)
            resu= pierdes;
        else if(jugadau==tijera && jugadac ==papel)
            resu = ganas;
        else
            resu=empate;
        return resu;
    }
}
