package Calculadora;

import java.util.Scanner;

class Teclado
{
    public static String leer(String texto) {
        Scanner input = new Scanner(System.in);
        Pantalla pantalla = new Pantalla();
        pantalla.escribir(texto);

        String result = input.nextLine();

        return result;
    }
}