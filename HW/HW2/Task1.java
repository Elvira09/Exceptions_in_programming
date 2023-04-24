package HW.HW2;

import java.util.Scanner;

/*
Task1
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает 
введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args)  {
        
        System.out.println(getFloatNumber());

    }

    private static Scanner scanner = new Scanner(System.in);

    /** ПОлучить от пользователя дробное число float
     * @return возвращаем полученное число или ошибку ввода
     */
    public static Float getFloatNumber() {
        System.out.println("Введите дробное число");
        String data = null;
        while (true) {
            try {
                data = scanner.nextLine();
                if (tryInteger(data)) {
                    throw new RuntimeException("Вы ввели целочисленное значение");
                } else {
                    return Float.parseFloat(data);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Введите дробное число");
            }
        }
    }

    /** Проверка валидности преобразования String в Float
     * @param data строка для конвертации
     * @return возвращаем результат конвертации true или false 
     */
    private static boolean tryInteger(String data)  {
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
