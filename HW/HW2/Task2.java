package HW.HW2;
/*
## Task2
Если необходимо, исправьте данный код (задание 2 
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
*/

public class Task2 {
    /*
     * Здесь вообще не понятно что нужно исправлять, в третьей же строке делят на
     * ноль (при чем делимым
     * выступает неизестный элемент массива, которого может не быть в принципе,
     * неизвестно что за массив
     * такой... судя по названию там целочисленные значения)
     * Если зменить значение переменной d на неравное нулю и привести к типу double,
     * чтоб код имел какой либо смысл
     * - добавила исключение на длину массива
     */

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        try {
            int d = 7;
            double catchedRes1 = intArray[8] / (double) d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } 
    }

}
