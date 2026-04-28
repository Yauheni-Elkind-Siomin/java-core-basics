package variables_dataTypes_1;

import java.util.Scanner;

/*5. Проверка возраста
Ввести возраст:
< 18 → “Доступ запрещён”
        18–60 → “Доступ разрешён”
        60 → “Льготный доступ”*/

public class CheckAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = sc.nextInt();
        checkAge(age);
    }

    /**
     * методо проверки
     * @param age - возраст пользователя
     */

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Доступ запрещён");
        } else if (age < 60) {
            System.out.println("Доступ разрешён");
        } else  {
            System.out.println("Льготный доступ");
        }

    }

}
