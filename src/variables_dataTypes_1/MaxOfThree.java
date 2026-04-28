package variables_dataTypes_1;

/*4. Максимум из трёх чисел
Ввести 3 числа → найти максимальное*/

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double b = sc.nextDouble();
        System.out.println("Введите третье число: ");
        double c = sc.nextDouble();
        double result = findMax(a, b, c);
        System.out.println("Максимальное введенное число: " + result);

    }

    /**
     * Метод нахолждения максимального числа
     * @param a - первое вводимое пользователем число
     * @param b - второе вводимое пользователем число
     * @param c - третье вводимое пользователем число
     * @return - возврщает макс число
     */

    public static double findMax(double a, double b, double c) {
        double maxNumber = a;
        if (b > maxNumber) {
            maxNumber = b;
        } if (c > maxNumber) {
            maxNumber = c;
        }
        return maxNumber;
    }

}
