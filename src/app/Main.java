import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[20];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;

        }


        System.out.print("Елементи масиву: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");

            }

        }
        System.out.println("]");


        int negativeSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        int firstNegativeIndex = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {
                negativeSum += numbers[i];
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;

                }

            }


            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;

            }

            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;

            }

        }


        System.out.println("Сума від'ємних чисел: " + negativeSum);
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");


        if (firstNegativeIndex != -1 && firstNegativeIndex < numbers.length - 1) {
            int sumAfterFirstNegative = 0;
            int countAfterFirstNegative = 0;

            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                sumAfterFirstNegative += numbers[i];
                countAfterFirstNegative++;
            }

            double averageAfterFirstNegative = (double) sumAfterFirstNegative / countAfterFirstNegative;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n",
                    averageAfterFirstNegative);

        } else {
            System.out.println("В масиві немає від'ємних чисел.");

        }

    }

}