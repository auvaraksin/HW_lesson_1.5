package pro.sky;

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
        System.out.println("Массивы часть 1. Домашнее задание");
        //task 1
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        float[] arrayFloat = {1.57f, 7.654f, 9.986f};
        int[] arrayIntRandom = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        //task 2
        System.out.println("Задание 2");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i != arrayInt.length - 1) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.println(arrayInt[i]);
            }
        }
        for (int i = 0; i < arrayFloat.length; i++) {
            if (i != arrayFloat.length - 1) {
                System.out.print(arrayFloat[i] + ", ");
            } else {
                System.out.println(arrayFloat[i]);
            }
        }
        for (int i = 0; i < arrayIntRandom.length; i++) {
            if (i != arrayIntRandom.length - 1) {
                System.out.print(arrayIntRandom[i] + ", ");
            } else {
                System.out.println(arrayIntRandom[i]);
            }
        }
        //task 3
        System.out.println("Задание 3");
        int index = arrayInt.length - 1;
        boolean isTrue = true;
        while (isTrue) {
            if (index != 0) {
                System.out.print(arrayInt[index] + ", ");
                index--;
            } else {
                System.out.println(arrayInt[index]);
                isTrue = false;
            }
        }
        index = arrayFloat.length - 1;
        isTrue = true;
        while (isTrue) {
            if (index != 0) {
                System.out.print(arrayFloat[index] + ", ");
                index--;
            } else {
                System.out.println(arrayFloat[index]);
                isTrue = false;
            }
        }
        index = arrayIntRandom.length - 1;
        isTrue = true;
        while (isTrue) {
            if (index != 0) {
                System.out.print(arrayIntRandom[index] + ", ");
                index--;
            } else {
                System.out.println(arrayIntRandom[index]);
                isTrue = false;
            }
        }
        //task 4
        System.out.println("Задание 4");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();
        System.out.println("Массивы часть 2. Домашнее задание");
        //task 1
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");
        //task 2
        System.out.println("Задание 2");
        int minDayExpenditure = arr[0];
        int maxDayExpenditure = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minDayExpenditure) {
                minDayExpenditure = arr[i];
            }
            if (arr[i] > maxDayExpenditure) {
                maxDayExpenditure = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDayExpenditure + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxDayExpenditure + " рублей");
        //task 3
        System.out.println("Задание 3");
        float averageDayExpenditure = totalSum;
        averageDayExpenditure = averageDayExpenditure / arr.length;
        System.out.println("Средняя сумма трат в день за месяц составила " + averageDayExpenditure + " рублей");
        //task 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        index = reverseFullName.length - 1;
        while (true) {
            if (index != 0) {
                System.out.print(reverseFullName[index]);
                index--;
            } else {
                System.out.println(reverseFullName[index]);
                break;
            }
        }
    }
}