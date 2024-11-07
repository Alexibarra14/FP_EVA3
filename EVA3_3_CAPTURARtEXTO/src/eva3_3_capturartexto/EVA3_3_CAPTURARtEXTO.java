/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_capturartexto;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA3_3_CAPTURARtEXTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = capturarTexto("Introduce tu nombre:");
        String apellido= capturarTexto("Introduce tu apellido:");        
        int captura = capturaEdad("ingresa tu edad:");        
        float deci = capturaDecimal("ingresa un numero decimal");
        
        
        System.out.println("Nombre es:"+ nombre);
        System.out.println("Apellido es:"+ apellido);        
        System.out.println("tu edad es:"+captura);
        System.out.println("EL decimal es:"+deci);
       
    }
    public static String capturarTexto(String mensaje){
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        String texto= cap.nextLine();
        return texto;
    }
    public static int capturaEdad( String capedad){
                Scanner cap = new Scanner(System.in);
        System.out.println(capedad);
        int ed=cap.nextInt();
        cap.nextLine();
        return ed;
    }
    public static float capturaDecimal(String mensaje){
        Scanner cap= new Scanner(System.in);      
        System.out.println(mensaje);
        float deci = cap.nextFloat();
        return deci;
        
    }
}
