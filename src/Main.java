public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        // Задача 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int month = 0; month < arr.length; month++) {
            sum += arr[month];
            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        }
        // Задача 2
        int maxSum = Integer.MIN_VALUE;
        for (int month = 0; month < arr.length; month++) {
            if (arr[month] > maxSum) {
                maxSum = arr[month];
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (int month = 0; month < arr.length; month++) {
            if ( arr[month] < minSum) {
                minSum = arr[month];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей.");
        // Задача 3
        int middleSum = sum / 30;
        System.out.println("Сумма трат за месяц составила " + middleSum + " рублей.");
        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }

    }
}