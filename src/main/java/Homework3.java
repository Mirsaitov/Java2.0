import java.util.Scanner;


public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        int y = input.nextInt();
        if (y == 1) {                                   // Выбор задания
            System.out.print("Введите первую цифру: ");
            double a = input.nextDouble();               //Вводим первую цифру
            System.out.print("Введите тип операции (+,-,/,*): ");
            String x = input.next();                     //Выбираем тип операции
            System.out.print("Введите вторую цифру: ");
            double b = input.nextDouble();               //Вводим вторую цифру

            double value = 0;
            if (x.equals("/"))                            // С помощью оператора if else определяем какую команду выполнить
                value = a / b;
            else if (x.equals("*")) value = a * b;
            else if (x.equals("+")) value = a + b;
            else if (x.equals("-")) value = a - b;
            else System.out.print("Неверный формат ввода" + "\n");

            System.out.print("Результат: " + String.format("%.4f", value));   // Выводим на экран результат
        }

        else if (y == 2) {
            System.out.print("Шаг 1: " + "\n" + "Введите размер массива: ");
            int size = input.nextInt();                     // Вводим размер массива
            String nums[] = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Введите данные массива" + " №" + (i + 1) + ": ");
                nums[i] = input.next();                   // Заполняем массив элементами, введёнными с клавиатуры
            }
            for (int i = size - 1; i > 0; i--) {       // С помощью сортировки методом пузырька находим самое длинное
                for (int j = 0; j < i; j++) {              // слово и перетаскиваем в первый массив
                    if (nums[j].length() < nums[j + 1].length()) {
                        String tmp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = tmp;
                    }
                }
            }
            System.out.println("Самое длинное слово: " + nums[0]);  //Выводим на экран самое длинное слово
        }
    }
}
