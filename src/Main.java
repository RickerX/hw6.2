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
        for (int month = 1; month < arr.length; month++) {
            sum += arr[month];
            if (month % 29 == 0) {
                System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
            }
        }
        // Задача 2
        int maxSum = -1;
        for (int month = 0; month < arr.length; month++) {
            maxSum += arr[month];
            if (arr[month] > maxSum) {
                maxSum = arr[month];
            }
        }
        int minSum = arr.length;
        for (int month = 0; month < arr.length; month++) {
            minSum += arr[month];
            if ( arr[month] < minSum) {
                minSum = arr[month];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей.");
        // Задача 3
        double sum1 = 0;
        for (int month = 1; month < arr.length; month++) {
            sum1 += arr[month];
            if (month % 29 == 0) {
                 sum1 = (sum / 30.0);
                System.out.println("Сумма трат за месяц составила " + sum1 + " рублей.");
            }

        }
        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }

    }
}