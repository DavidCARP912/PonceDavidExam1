/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ponce_david_exam1;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ponce_David_Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("    Bienvenido escoja una opcion del menu");
        System.out.println(" 1 PIRAMIDE");
        System.out.println(" 2 CLAVE");
        System.out.println(" 3 JUEGO PIEDRA,PAPEL,Y TIJERA");
        System.out.println(" 4 ADIVINAR");
        System.out.println(" 5 SALIR");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:

                System.out.print("Cuantas filas deseas en las piramides ");
                //esta variable es para ver cuantas filas le pido al usuario
                int filas = scanner.nextInt();
                int numeroImpar = 1;
                //
                for (int i = 1; i <= filas; i++) {
                    int sumaDeFila = 0;
                    for (int x = 1; x <= i; x++) {
                        System.out.print(numeroImpar);
                        sumaDeFila += numeroImpar;
                        numeroImpar += 2;
                        if (x < i) {
                            System.out.print(" = ");
                        }
                    }
                    System.out.println(" = " + sumaDeFila);
                }
                scanner.nextLine();
                break;

            case 2:

                String abecedarioEnMinuscula = "abcdefghijklmnñopqrstuvwxyz";
                String abecedarioEnMayuscula= abecedarioEnMinuscula.toUpperCase();
                System.out.print("Escriba el mensaje que desea cifrar ");
                String mensajeACifrar = scanner.nextLine();
                

                break;

            case 3:
                System.out.println("");

                

                break;

            case 4:

                System.out.println("En proceso ");

                break;

            case 5:
                System.out.println("Escoja una opcion del menu porfavor ");
                break;

            default:
                System.out.println("Esta opcion no existe escoja una opcion en el menu ");
        }

    }
}
