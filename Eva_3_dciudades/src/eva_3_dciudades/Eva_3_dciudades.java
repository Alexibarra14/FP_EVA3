/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_dciudades;

/**
 *
 * @author brend
 */
public class Eva_3_dciudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] billetes={20,50,100,200,500,100 };
        System.out.println(billetes.length);
        String[][] ciudades={{"Aguascalientes","calvillo","jesus maria" },
                            {"Ensenada","mexicali","tecate","tijuana"},
                            {"La paz","Cabo San Lucas","San jose del cabo"}
                            };
       System.out.println(ciudades[0].length);
       for(int i=0;i<ciudades.length;i++){
                 for(int j=0;j<ciudades[i].length;j++);
                 System.out.println(ciudades[i][j]);
       }
    
}
