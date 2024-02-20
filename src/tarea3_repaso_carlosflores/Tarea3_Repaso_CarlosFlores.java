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
                    System.out.println();
                    break;
                }//fin case 2
                
                case 3:{
                    
                    System.out.println();
                    break;
                }//fin case 3
                
                case 4:{
                    
                    System.out.println();
                    break;
                }//fin case 4
                
                case 5:{
                    System.out.println("\n---Jugando con arreglos");
                    print(fill());
                    System.out.println("\n");
                    break;
                }//fin case 5
                
                case 6:{
                    System.out.println("\nHa salido del programa, nos vemos.");
                    var = false;
                    break;
                }//fin case 6
                
                default:{
                    System.out.println("\nOpcion no valida, intente de nuevo");
                    System.out.println();
                    break;
                }//fin default
                
            }//fin switch
            
        }while(var);//fin do while
        
    }//fin main
    
    
    public static int [] fill(){
        int array [] =  new int [10];
        int rest = 10;
        for (int i = 0; i < 10;i++) {
            System.out.println("Faltan "+rest+" numeros");
            rest--;
            System.out.print("Ingrese un numero: ");
            int num = leer.nextInt();
            array[i] = num;
        }
        return array;
    }//fin fill
    
    public static void print(int arreglo []){
        System.out.print("\nARREGLO = ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
    }//fin print
    
}//fin class
