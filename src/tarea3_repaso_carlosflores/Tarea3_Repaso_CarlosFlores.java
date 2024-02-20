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
                    System.out.println("\n---Veamos si podemos formar la palabra");
                    String Longer = "";
                    String Shorter = "";
                    System.out.print("Cadena 1: ");
                    leer.nextLine();
                    String cad1 = leer.nextLine();
                    System.out.print("Cadena 2: ");
                    String cad2 = leer.nextLine();
                    if(cad1.contentEquals(cad2)){
                        System.out.println("Las cadenas son iguales, intente de nuevo.\n");
                        continue;
                    }else if(cad1.length() == cad2.length()){
                        System.out.println("Las cadenas miden lo mismo, intente de nuevo.\n");
                        continue;
                    }else if(cad1.length() > cad2.length()){
                        Longer = cad1;
                        Shorter = cad2;
                    }else{
                        Longer = cad2;
                        Shorter = cad1;
                    }
                    String comparison = "";
                    for (int i = 0; i < Shorter.length(); i++) {
                        for (int j = 0; j < Longer.length(); j++) {
                            if(Shorter.charAt(i) == Longer.charAt(j)){
                                comparison += Longer.charAt(j);
                                break;
                            }
                        }
                    }
                    if(comparison.contentEquals(Shorter)){
                        System.out.println("SI se puede armar "+Shorter+"\n");
                    }else{
                        System.out.println("NO se puede armar "+Shorter+"\n");
                    }
                    break;
                }//fin case 1
                
                case 2:{
                    System.out.println("\n---Numeros primero");
                    String nums_p = "";
                    System.out.print("Ingrese una cadena:");
                    String cad = leer.nextLine();
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
                    System.out.println("\n---Codificar cadenas");
                    System.out.print("Ingrese una cadena: ");
                    leer.nextLine();
                    String nums_letr = leer.nextLine();
                    reemplazar(nums_letr);
                    System.out.println("\n");
                    break;
                }//fin case 4
                
                case 5:{
                    System.out.println("\n---Jugando con arreglos");
                    int array [] =  new int [10];
                    print(fill(array));
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
    
    public static void reemplazar(String nums_letr){
        int op = 0;
        nums_letr = nums_letr.toLowerCase();
        System.out.print("Codificado: ");
        for (int i = 0; i < nums_letr.length(); i++) {
            if((int)nums_letr.charAt(i) < 123 && (int)nums_letr.charAt(i) > 96){
                op = 1;
            }else if((int)nums_letr.charAt(i) < 58 && (int)nums_letr.charAt(i) > 47){
                op = 2;
            }else if((int)nums_letr.charAt(i) == 32){
                op = 3;
            }
            switch(op){
                case 1:{
                    int print = (int)nums_letr.charAt(i) - 96;
                    System.out.print(print);
                    if(i < nums_letr.length()-1 && nums_letr.charAt(i+1) != 32){
                        System.out.print("-");
                    }
                    break;
                }
                case 2:{
                    int prove = (int)nums_letr.charAt(i) + 16;
                    char print = (char) prove;
                    System.out.print(print);
                    if(i < nums_letr.length()-1 && nums_letr.charAt(i+1) != 32){
                        System.out.print("-");
                    }
                    break;
                }
                case 3:{
                    System.out.print(" ");
                    break;
                }
            }
        }
    }//fin remplazar
    
    public static int [] fill(int array []){
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
