package calculator;

import static calculator.Main.leer;

public class Calculator {

    public void sumar() {
        System.out.println("Ingrese los números que desea sumar");
        System.out.print("> ");
        int num1 = leer.nextInt();
        System.out.print("> ");
        int num2 = leer.nextInt();
        System.out.println("El resultado de la suma es " + (num1 + num2));
    }

    public void restar() {
        System.out.println("Ingrese los números que desea restar");
        System.out.print("> ");
        int num1 = leer.nextInt();
        System.out.print("> ");
        int num2 = leer.nextInt();
        System.out.println("El resultado de la resta es " + (num1 + num2));
    }

}
