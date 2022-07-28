import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        int[] arr = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(Arrays.toString(arr));

        //вариант с for
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма трат в месяц составила " + total + " рублей");

        //вариант с foreach
        int total2 = 0;
        for (int element : arr) {
            total2 += element;
        }
        System.out.println("Сумма трат в месяц составила " + total2 + " рублей");

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + "рублей");

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + "рублей");

        float sum = 0;
        float average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        return arr;
    }

}


