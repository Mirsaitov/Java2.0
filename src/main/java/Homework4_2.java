
import java.util.Scanner;

public class Homework4_2 {
    static String name;
    int weight;
    int price;
    int calories;

    public Homework4_2(String name, int weight, int price, int calories) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.calories = calories;
    }

    public static void main(String[] args) {

        Homework4_2[] sweets = new Homework4_2[3];

        boolean formed = false;
        int totalPrice = 0;
        int totalWeight = 0;
        String totalName = "Подарок состоит из:\n";
        //Добавляем сладости в корзину с помощью оператора switch
        Scanner input = new Scanner(System.in);
        System.out.println("Нажмите соответствующую цифру, чтобы добавить сладость в подарок:");
        System.out.println("'1' - пирожное \"ChokoPie\"");
        System.out.println("'2' - батончик \"Bounty\"");
        System.out.println("'3' - шоколад \"Milka\"");
        System.out.println("'4' - закончить выбор");
        while (!formed) {

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    sweets[0] = new Homework4_2("пирожное \"ChokoPie\"", 100, 150, 350);
                    totalName = totalName + sweets[0].name + "\n";
                    totalPrice = totalPrice + sweets[0].price;
                    totalWeight = totalWeight + sweets[0].weight;
                    System.out.println("Пирожное \"ChokoPie\" добавлен в подарок");
                    break;
                case 2:
                    sweets[1] = new Homework4_2("батончик \"Bounty\"", 50, 37, 150);
                    totalName = totalName + sweets[1].name + "\n";
                    totalPrice = totalPrice + sweets[1].price;
                    totalWeight = totalWeight + sweets[1].weight;
                    System.out.println("Батончик \"Bounty\" добавлен в подарок");
                    break;
                case 3:
                    sweets[2] = new Homework4_2("шоколад \"Milka\"", 90, 107, 250);
                    totalName = totalName + sweets[2].name + "\n";
                    totalPrice = totalPrice + sweets[2].price;
                    totalWeight = totalWeight + sweets[2].weight;
                    System.out.println("Шоколад \"Milka\" добавлен в подарок");
                    break;
                case 4:
                    formed = true;
                    break;
            }
        }
        //Выводим на экран общую информацию
        System.out.println(totalName);
        System.out.println("Общий вес подарка: " + totalWeight + " гр.");
        System.out.println("Общая цена подарка: " + totalPrice + " руб.");
    }
}
