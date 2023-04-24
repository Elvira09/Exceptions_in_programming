package HW.HW2;

import java.util.Scanner;

/*
## Task4
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю 
должно показаться сообщение, что пустые строки вводить нельзя.

 */
public class Task4 {

    public static void main(String[] args) {
        getString();
    }

    private static Scanner scanner = new Scanner(System.in);

    /** Проверка вводимой строки от пользователя 
     * 
     */
    public static void getString(){
        System.out.println("Введите сообщение: ");
        String data = scanner.nextLine();
        if (data.isEmpty()) {
            throw new RuntimeException("Пустую строку вводить нельзя!");
        } else if (data.isBlank()) {
            throw new RuntimeException("Строка содержит только пробелы!");
        } else {
            System.out.println(data);
        }
        scanner.close();
    }
}
