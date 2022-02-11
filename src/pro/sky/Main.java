package pro.sky;

import java.util.Arrays;

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
        System.out.println("Массивы. Задачи повышенной сложности");
        //task 5
        System.out.println("Задание 5");
        int[][] matrix = new int[3][3];
        int diagonalNumber = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j % 2 != 0) {
                        matrix[i][j] = diagonalNumber;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j % 2 == 0) {
                        matrix[i][j] = diagonalNumber;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        //task 6
        System.out.println("Задание 6");
        int[] array1 = {5, 4, 3, 2, 1};
        int[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.println("Исходный массив");
        for (int i = 0; i < array1.length; i++) {
            array2[array1.length - 1 - i] = array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Преобразованный массив");
        array1 = Arrays.copyOf(array2, array2.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        //task 7
        System.out.println("Задание 7");
        int[] array = {5, 4, 3, 2, 1};
        int exchange;
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Преобразованный массив");
        for (int i = 0; i < array.length / 2; i++) {
            exchange = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = exchange;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //task 8
        System.out.println("Задание 8");
        System.out.print("Массив: ");
        int[] arrayMix = {-6, 2, 5, -8, 8, 6, 4, -7, 12, 1};
        for (int i = 0; i < arrayMix.length; i++) {
            System.out.print(arrayMix[i] + " ");
        }
        System.out.println();
        System.out.println("Пара чисел массива, разница между которыми равна -2");
        for (int i = 0; i < arrayMix.length - 1; i++) {
            for (int j = i + 1; j < arrayMix.length; j++) {
                if (arrayMix[i] + arrayMix[j] == -2) {
                    System.out.println(arrayMix[i] + " " + arrayMix[j]);
                    i = arrayMix.length - 1;
                    j = arrayMix.length;
                }
            }
        }
        System.out.println("Задание 9");
        System.out.print("Массив: ");
        for (int i = 0; i < arrayMix.length; i++) {
            System.out.print(arrayMix[i] + " ");
        }
        System.out.println();
        System.out.println("Пары чисел массива, разница между которыми равна -2");
        for (int i = 0; i < arrayMix.length - 1; i++) {
            for (int j = i + 1; j < arrayMix.length; j++) {
                if (arrayMix[i] + arrayMix[j] == -2) {
                    System.out.println(arrayMix[i] + " " + arrayMix[j]);
                }
            }
        }
    }
}