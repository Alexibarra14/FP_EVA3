/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int piedra= 1;
      int tijera=2;
     int papel= 3;
      int juegos;
      int num=0;
      int empate=0;
      int victoria=0;
      int derrota=0;
   do{
       
     Scanner cap= new Scanner(System.in);
          System.out.println("PIEDRA = 1   TIJERA=2   PAPEL= 3");
             System.out.println("eliga piedra papel o tijera respecto al numero qyue le corresponde");
           int ele = cap.nextInt();
           if(ele==piedra) 
               System.out.println("piedra");
          if (ele== tijera)
            System.out.println("tijera");
          if(ele== papel)
              System.out.println("papel");
                   double compu=Math.random()*100;
             
              if( compu>=0 && compu<=33){
                  System.out.println("Piedra");
                  num=1;
              }
                 
                  
                  if( compu>=34&& compu<=66){
                       System.out.println("tijera");
                       num=2;
                  }
                     
                  
                   if( compu>=67&& compu<=100){
                        System.out.println("papel");
                   num=3;
                   }
                 if(num== ele){
                     System.out.println("Empate");
                     empate ++;
                 }else if(num ==1 && ele ==2){
                     System.out.println("perdite ");
                     derrota++; 
                 }else if(num ==1 && ele == 3){
                    System.out.println("victoria");
                    victoria++;
                    
                 }else if(num==2 && ele==1){
                     System.out.println("ganaste");
                     victoria ++;
                 }else if(num==2&& ele==3){
                     System.out.println("perdiste");
                     derrota++;
                 }else if(num==3&& ele==1){
                     System.out.println("pierdes");
                     derrota++;
                     
                 }else if(num==3 & ele==2){
                     System.out.println("ganaste");
                     victoria++;
                 }
                   System.out.println("continuAR?   1=SI    2=NO");
                   juegos= cap.nextInt();
                  
                   
                   
                   
              }while(juegos!=1);
            System.out.println("resultados finales :");
            System.out.println("Victorias: " + victoria);
            System.out.println("derrotas "+derrota);
            System.out.println("empates " + empate);
          
             
    }                  
                
                      
                  
                  
              
                  

        
    
    

