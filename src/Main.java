
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ewans Ewoldt
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Cuenta cuenta = new Cuenta();
        Canal canal = new Canal();
        int opcion = 0;
        do {
        System.out.println("1.- Crear un canal a una cuenta"); 
        System.out.println("2.- Mostrar la informacion de la cuenta."); 
        System.out.println("3.- Aumentar la cantidad de suscriptores."); 
        System.out.println("4.- Validar la contraseña de la cuenta.");
        System.out.println("5.- Salir."); 
        System.out.println("Seleccione una opcion: "); 
        opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    Canal canal1 = new Canal();
                    break;
                case 2:
                    canal.mostrarInfo();
                    break;
                case 3:
                    
                    canal.aumentarSubs();
                    break;
                case 4:
                    System.out.println("Funcion de opcion 4");
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    break;    
                default:
                    System.out.println("*****************");
                    System.out.println("*Opcion invalida*");
                    System.out.println("*****************");
                    
            }
            
        } while (opcion !=5);
        
    }

    public Main() {
    }
    
}
