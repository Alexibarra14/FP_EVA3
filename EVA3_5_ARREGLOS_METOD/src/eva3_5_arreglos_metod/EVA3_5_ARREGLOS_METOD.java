/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_arreglos_metod;

/**
 *
 * @author brend
 */
public class EVA3_5_ARREGLOS_METOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       String diasemana[]={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"  };
       imprimirArreglo(diasemana);
        String meses[]={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"
            
        };
        imprimirArreglo(meses);
        
        int billetes[]={20,50,100,200,500,1000};
     imprimirArregloEntero(billetes);
    }
    public static void imprimirArregloEntero(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
      public static void imprimirArreglo(String[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
}
