package variables_dataTypes_1;

import java.util.Scanner;

/*1. Проверка числа
Ввести число и:

если > 0 → “Положительное”
если < 0 → “Отрицательное”
если = 0 → “Ноль”*/


public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        checkNumberSign(number);

    }

    /**
     * метод для проверки числа
     * @param number - вводимое пользователем число
     */

    public static void checkNumberSign(int number) {
        if (number < 0) {
            System.out.println("Введено отрицательное число");
        } else if (number > 0) {
            System.out.println("Введено положительное число");
        } else {
            System.out.println("Введен ноль");
        }
    }
}
