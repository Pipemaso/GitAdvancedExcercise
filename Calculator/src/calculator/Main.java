package calculator;

import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Calculator c = new Calculator();

        boolean salida = false;
        do {
            System.out.println("---------- MENÚ ----------");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Salir");
            System.out.println("--------------------------");
            int menu = leer.nextInt();
            switch (menu) {
                case 1:
                    c.sumar();
                case 2:
                    c.restar();
                case 3:
                    salida = true;
            }
        } while (!salida);

    }

}
