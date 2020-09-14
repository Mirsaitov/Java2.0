package Homework5_Calculator;
import java.util.Scanner;

/**
 * Калькулятор
 * @version 1.2 (в стиле ООП)
 * @autor Динар Мирсаитов
 */

public class Main {

    public static void main(String[] args) {
        Operand leftOperand, rightOperand;
        Operation operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую цифру: ");
        leftOperand = new Operand(scanner.nextDouble());

        System.out.println("Введите тип операции (+,-,/,*): ");
        operation = Operation.getBySymbol(scanner.next().charAt(0));

        System.out.println("Введите вторую цифру: ");
        rightOperand = new Operand(scanner.nextDouble());

        Logic calc = new Logic(leftOperand, rightOperand, operation);

        System.out.println("Результат: " + String.format("%.4f", calc.getResult()));

        scanner.close();
    }
}