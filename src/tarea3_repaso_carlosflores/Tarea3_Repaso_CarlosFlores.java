package tarea3_repaso_carlosflores;

import java.util.Scanner;

public class Tarea3_Repaso_CarlosFlores {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        boolean var = true;
        do{
            
            System.out.println("---MENU");
            System.out.println("1)Veamos si podemos formar la palabra\n2)Números primero\n3)Ordenar alfabéticamente\n4)Codificar cadenas\n5)Jugando con arreglos\n6)Salir");
            System.out.print("Ingrese una opcion: ");
            int op = leer.nextInt();
            
            switch(op){
                
                case 1:{
                    
                    break;
                }//fin case 1
                
                case 2:{
                    System.out.println("\n---Numeros primero");
                    String nums_p = "";
                    System.out.print("Ingrese una cadena:");
                    String cad = leer.next();
                    for (int i = 0; i < cad.length(); i++) {
                        if((int)cad.charAt(i) > 47 && (int)cad.charAt(i) < 58 ){
                            nums_p  += cad.charAt(i);
                        }
                    }
                    for (int i = 0; i < cad.length(); i++) {
                        if((int)cad.charAt(i) > 64 && (int)cad.charAt(i) < 123 ){
                            nums_p  += cad.charAt(i);
                        }
                    }
                    System.out.println("Cadena modificada: "+nums_p);
                    break;
                }//fin case 2
                
                case 3:{
                    
                    break;
                }//fin case 3
                
                case 4:{
                    
                    break;
                }//fin case 4
                
                case 5:{
                    
                    break;
                }//fin case 5
                
                case 6:{
                    
                    break;
                }//fin case 6
                
                default:{
                    
                    break;
                }//fin default
                
            }//fin switch
            
        }while(var);//fin do while
        
    }//fin main
    
}//fin class
