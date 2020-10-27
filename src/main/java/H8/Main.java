package Homework8;

import java.util.Scanner;

/**
 * Калькулятор
 * @version 1.4 (Покрыть Unit тестами)
 * @autor Динар Мирсаитов
 */

public class Main {

    public static void main(String[] args) {
        Operand leftOperand, rightOperand;
        Operation operation;

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Введите первую цифру: ");
        leftOperand = new Operand(scanner.nextDouble());

        System.out.println("Введите тип операции (+,-,/,*): ");
        operation = Operation.getBySymbol(scanner.next().charAt(0));

        System.out.println("Введите вторую цифру: ");
        rightOperand = new Operand(scanner.nextDouble());

        Logic calc = new Logic(leftOperand, rightOperand, operation);

        System.out.println("Результат: " + String.format("%.4f", calc.getResult()));

        scanner.close();
        }catch (RuntimeException e) {
            System.out.println("Во время работы калькулятора произошла ошибка. " + e.getLocalizedMessage());
        }
    }
}