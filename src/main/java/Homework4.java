
public class Homework4 {
    public static void main(String[] args) {
        int random[];
        random = new int[20];
// c помощью цикла добавляем в масси рандомные цифры
        for (int i = 0; i < random.length; i++) {
            int a = (int) (Math.random() * 22 - 11);
            random[i] = a;
            System.out.println("Step " + (i + 1) + ": " + random[i]);
        }
// находим максимальное число
        int minPosition = 0;
        int maxPosition = 0;
        int maxValue = random[0];
        for (int i = 1; i < random.length; i++) {
            if (random[i] > maxValue) {
                maxValue = random[i];
                maxPosition = i;
            }
        }
// находим минимальное число
        int minValue = random[0];
        for (int i = 1; i < random.length; i++) {
            if (random[i] < minValue) {
                minValue = random[i];
                minPosition = i;
            }
        }
        System.out.println("Minimum Value is: " + minValue);
        System.out.println("Maximum Value is: " + maxValue);
        // меняем их местами
        random[minPosition] = maxValue;
        random[maxPosition] = minValue;
//показываем результат
        for (int i = 0; i < random.length; i++) {
            System.out.println("Step " + (i + 1) + ": " + random[i]);
        }
    }
}

