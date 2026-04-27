package variables_dataTypes_1;

/*3. Мини-калькулятор
Ввод:
число 1
число 2
операция (+, -, *, /)
Вывод: результат
👉 Подсказка: if / else if*/

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double b = sc.nextDouble();
        System.out.println("Введите операцию над этими числами: ");
        char c = sc.next().charAt(0);
        Double result = operations(a, b, c);
        if (result != null) {
            System.out.println("Результат: " + result);
        }
    }


    /**
     * метод для проведения вычисления
     *
     * @param a - первое значение
     * @param b - второе значение
     * @param c - требуемое дейтствие
     * @return - возвращает null если второе чило равно нулю
     */

    public static Double operations(double a, double b, char c) {
        if (c == '+') {
            return a + b;
        } else if (c == '-') {
            return a - b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '/') {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("На ноль делить нельзя!!!");
                return null;
            }
        }
        return null;
    }
}

