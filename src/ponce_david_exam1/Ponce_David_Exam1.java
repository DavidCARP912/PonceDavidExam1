/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ponce_david_exam1;

import java.util.Scanner;
import java.util.Random;

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
                String abecedarioEnMayuscula = abecedarioEnMinuscula.toUpperCase();
                System.out.println("Escoje una opcion para cifrar o descifrar");
                System.out.println("1 Cifrar");
                System.out.println("2 Descifrar");
                int decision = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Escribe el texto que deseas cifrar ");
                String mensajeCifrado = scanner.nextLine();
                String resultado = "";
                for (int i = 0; i < mensajeCifrado.length(); i++) {
                    char c = mensajeCifrado.charAt(i);
                    int idx = -1;

                    for (int j = 0; j < abecedarioEnMinuscula.length(); j++) {
                        if (abecedarioEnMinuscula.charAt(j) == c) {
                            idx = j;
                            break;
                        }
                    }
                    if (idx != -1) {
                        resultado += abecedarioEnMinuscula.charAt(abecedarioEnMinuscula.length() - 1 - idx);
                    } else {

                        idx = -1;
                        for (int j = 0; j < abecedarioEnMayuscula.length(); j++) {
                            if (abecedarioEnMayuscula.charAt(j) == c) {
                                idx = j;
                                break;
                            }
                        }
                        if (idx != -1) {
                            resultado += abecedarioEnMayuscula.charAt(abecedarioEnMayuscula.length() - 1 - idx);
                        } else {

                            resultado += c;
                        }
                    }
                }
                if (decision == 1) {
                    System.out.println("El mensaje cifrado es " + resultado);
                } else {
                    System.out.println("El mensaje descifrado " + resultado);
                }
                break;

            case 3:
                Random random = new Random();
                System.out.println("en proceso ");
                System.out.println("Bienvenido al juego Piedra, Papel o Tijera");

                scanner.nextLine();
                String jugarOtraVez = "";
                do {
                    System.out.print("Ingresa tu eleccion (piedra, papel o tijera): ");
                    String eleccionUsuario = scanner.nextLine();
                    if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
                        System.out.println("Eleccion no valida");
                        continue;
                    }
                    int numeroComputadora = random.nextInt(3) + 1;
                    String eleccionComputadora;
                    if (numeroComputadora == 1) {
                        eleccionComputadora = "piedra";
                    } else if (numeroComputadora == 2) {
                        eleccionComputadora = "papel";
                    } else {
                        eleccionComputadora = "tijera";
                    }
                    System.out.println("La computadora escogio " + eleccionComputadora);
                    if (eleccionUsuario.equals(eleccionComputadora)) {
                        System.out.println("empate");
                    } else if (eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) {
                        System.out.println("Ganaste");
                    } else if (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) {
                        System.out.println("Ganaste");
                    } else if (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel")) {
                        System.out.println("Ganaste");
                    } else {
                        System.out.println("Perdiste");
                    }
                    System.out.print("Quieres jugar otra vez? si o no: ");
                    jugarOtraVez = scanner.nextLine();
                } while (jugarOtraVez.equals("si"));
                break;
            case 4:
                Random randomDos = new Random();
                System.out.println("Adivine un numero del 1 al 100 tienes 10 intentos para hacerlo");
                int numeroSecreto = randomDos.nextInt(100) + 1;
                int intentosMaximos = 10;
                boolean esElNumero = false;

                for (int contador = 1; contador <= intentosMaximos; contador++) {
                    System.out.println("Intento " + contador);
                    System.out.print("Ingresa un numero entre 1 y 100 ");
                    int numeroDeIntentos = scanner.nextInt();

                    if (numeroDeIntentos == numeroSecreto) {
                        System.out.println("Lograste adivinar el numero aleatorio" + contador + " en intentos.");
                        esElNumero = true;
                        break;
                    } else {

                        if (numeroDeIntentos < numeroSecreto) {
                            System.out.println("El numero  es mayor que " + numeroDeIntentos);
                        } else {
                            System.out.println("El numero  es menor que " + numeroDeIntentos);
                        }
                    }
                }

                if (!esElNumero) {
                    System.out.println("No lograste adivinar el numero" + numeroSecreto);
                }
                break;

            case 5:
                System.out.println("Escoja una opcion del menu porfavor ");
                break;

            default:
                System.out.println("Esta opcion no existe escoja una opcion en el menu ");
        }

    }
}
