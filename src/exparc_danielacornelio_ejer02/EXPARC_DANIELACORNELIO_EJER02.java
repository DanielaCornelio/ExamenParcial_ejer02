/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exparc_danielacornelio_ejer02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EXPARC_DANIELACORNELIO_EJER02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner n= new Scanner(System.in);
        
        String planes, movil;
        
        System.out.println("-------------BIENVENIDO-------------- ");
        System.out.println("Estos son los moviles que tenemos para usted : ");
        System.out.println(" 1.Samsung s7 ");
        System.out.println(" 2.Iphone 6 ");
        System.out.println(" 3.Huawei p8 ");
        System.out.println("Ingrese el n° del movil que desea : ");
         movil=n.nextLine();
                 
        switch (movil) {
            
            case "1":
                System.out.println("Usted escogio : Samsung s7 "); 
                System.out.println( "CARACTERISTICAS DEL TELEFONO :" );
                System.out.println( " - Pantalla : 4.7 " );
                System.out.println( " - Camara : 8MP " );
                System.out.println( " - Procesador : 1.4 Ghz " );
                break;
                
            case "2":
                System.out.println("Usted escogio :Iphone 6 ");
                System.out.println( "CARACTERISTICAS DEL TELEFONO :" );
                System.out.println( " - Pantalla : 5.1 " );
                System.out.println( " - Camara : 10MP " );
                System.out.println( " - Procesador : 2.4 Ghz " );
                break;
                
            case "3":
                System.out.println("Usted escogio :Huawei p8 ");
                System.out.println( "CARACTERISTICAS DEL TELEFONO :" );
                System.out.println( " - Pantalla : 6.3 " );
                System.out.println( " - Camara : 9MP " );
                System.out.println( " - Procesador : 2.1 Ghz " );
                break;
        }
        System.out.println( "--------------------------------------------------------------" );
        System.out.println( "Tipos de operador : " );
        System.out.println(" 1.Claro ");
        System.out.println(" 2.Movistar ");
        System.out.println(" 3.Entel ");
        System.out.println("Ingrese el n° del operador que desea  : ");
        planes=n.nextLine();
       
        switch (planes){
            
            case "1" :
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio : Claro  " );
                System.out.println( "Planes para claro: " );
                System.out.println("1.Claro max 99 ");
                System.out.println("2.Claro max 149");
                System.out.println("3.Claro max 189 ");
                System.out.println("Ingrese El n° del plan que desea averiguar : ");
                 String planclaro = n.nextLine();
              
                switch(planclaro){
                    case "1" :
                System.out.println( "--------------------------------------------------------------" );
                System.out.println("Usted escogio :Claro max 99 ");
                System.out.println( " LO QUE EL PLAN OFRECE  :" );
                System.out.println( " - Precio : S/99" );
                System.out.println( " - Minutos Ilimitados" );
                System.out.println( " - ROAMING GRATIS" );
                System.out.println( " - Internet 6 GB" );
                System.out.println( " - SMS Ilimitados" );
                break;
                        
                case "2" :
                System.out.println( "--------------------------------------------------------------" );
                System.out.println("Usted escogio :Claro max 149");
                System.out.println( " LO QUE EL PLAN OFRECE  :" );
                System.out.println( "Precio : S/110" );
                System.out.println( " - Minutos Ilimitados" );
                System.out.println( " - RPC ilimitados" );
                System.out.println( " - Internet 10 GB" );
                System.out.println( "SMS Ilimitados" );
                break;
                    
                case "3" :
                System.out.println( "--------------------------------------------------------------" );    
                System.out.println("Usted escogio : Claro max 189 ");
                System.out.println( " LO QUE EL PLAN OFRECE :" );
                System.out.println( "Precio : S/140" );
                System.out.println( " - Minutos Ilimitados" );
                System.out.println( " - RPC ilimitados" );
                System.out.println( " - Internet 14 GB" );
                System.out.println( " - SMS Ilimitados" );
                break;
                }
            break;
                case "2" :
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio :  Movistar  " );
                System.out.println( "Planes para movistar: " );
                System.out.println("1.Movistar plus  80");
                System.out.println("2.Movistar  85");
                System.out.println("3.Movistar 95 ");
                System.out.println("Ingrese El n° del plan que desea averiguar : ");
                 String planmovistar = n.nextLine();
              
                   switch(planmovistar){
                     case "1" : 
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio : Plan movistar plus 80  " );
                System.out.println( " LO QUE EL PLAN OFRECE :" );
                System.out.println( " - Precio : S/60" );
                System.out.println( " - Minutos Limitados" );
                System.out.println( " - RPM Ilimitados" );
                System.out.println( " - Internet 2 GB" );
                System.out.println( " - 400 SMS " );
                break;
                        
                case "2" : 
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio : PLAN   movistar 85  " );
                System.out.println( " LO QUE EL PLAN OFRECE :" );
                System.out.println( " - Precio : S/65" );
                System.out.println( " - Minutos Limitados" );
                System.out.println( " - RPM ilimitados" );
                System.out.println( " - Internet 11 GB" );
                System.out.println( " - SMS Ilimitados" );
                break;
                    
                case "3" :   
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio : PLAN movistar 95 " );
                System.out.println( " LO QUE EL PLAN OFRECE :" );
                System.out.println( " - Precio : S/80" );
                System.out.println( " - Minutos Ilimitados" );
                System.out.println( " - RPM ilimitados" );
                System.out.println( " - Internet 12 GB" );
                System.out.println( " - SMS Ilimitados" );
                 break;
                }
            break;
                              
               case "3" :
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio : Entel  " );
                System.out.println( "Planes para Entel: " );
                System.out.println("1.Entel  20 ");
                System.out.println("2.Entel  30");
                System.out.println("3.Entel  40 ");
                System.out.println("Ingrese El n° del plan que desea : ");
                String planentel = n.nextLine();
                
                   switch(planentel){
                     case "1" :     
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio : PLAN   entel  20 " );
                System.out.println( " LO QUE EL PLAN OFRECE :" );
                System.out.println( " - Precio : S/25" );
                System.out.println( " - Minutos Ilimitados" );
                System.out.println( " - 200 m a llamadas a otro operador" );
                System.out.println( " - Internet 6 GB" );
                System.out.println( " - 200 SMS " );
                break;
                        
                case "2" :      
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio : PLAN  entel  30  " );
                System.out.println( " LO QUE EL PLAN OFRECE :" );
                System.out.println( " - Precio : S/35" );
                System.out.println( " - Minutos Ilimitados" );
                System.out.println( " - 400 m a llamadas a otro operador" );
                System.out.println( " - Internet 10 GB" );
                System.out.println( " - 400 SMS " );
                break;
                    
                case "3" :       
                System.out.println( "--------------------------------------------------------------" );
                System.out.println( "Usted escogio : PLAN entel  40  " );
                System.out.println( " LO QUE EL PLAN OFRECE :" );
                System.out.println( " - Precio : S/45" );
                System.out.println( " - Minutos Ilimitados" );
                System.out.println( " - RPC ilimitados" );
                System.out.println( " - Internet 14 GB" );
                System.out.println( " - SMS Ilimitados" );
                 break;
                }
            break;
        }
        System.out.println( "--------------------------------------------------------------" );    
        System.out.println( "-------------------GRACIAS POR SU COMPRA----------------------"  );
         
         
   
      
                      
       
             
             
        
        }
    }


    

