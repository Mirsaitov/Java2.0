import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        /**
         * Калькулятор
         * @autor Динар Мирсаитов
         * @version 1.1 (с исправлениями)
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        double a = input.nextDouble();               //Вводим первую цифру
        System.out.print("Введите тип операции (+,-,/,*): ");
        String x = input.next();                     //Выбираем тип операции
        System.out.print("Введите вторую цифру: ");
        double b = input.nextDouble();               //Вводим вторую цифру

        double value = 0;

        switch (x) {
            case "/":
                value = a / b;           // С помощью оператора if else определяем какую команду выполнить
                System.out.print("Результат: " + String.format("%.4f", value));
                break;
            case "*":
                value = a * b;
                System.out.print("Результат: " + String.format("%.4f", value));
                break;
            case "+":
                value = a + b;
                System.out.print("Результат: " + String.format("%.4f", value));
                break;
            case "-":
                value = a - b;
                System.out.print("Результат: " + String.format("%.4f", value));
                break;
            default:
                System.out.print("Неверный формат ввода");
                break;
        }
    }
}
