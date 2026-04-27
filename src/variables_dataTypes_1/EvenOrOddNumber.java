package variables_dataTypes_1;

import java.util.Scanner;

/*
Чётное / нечётное
Ввести число → вывести:
        “Чётное” или “Нечётное”
*/

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        checkNumber(number);
    }

    /**
     * метод для проверки чвляется ли чсило четным
     * @param number - вводимое число
     */
    public static void checkNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
