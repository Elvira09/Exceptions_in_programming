package HW.HW1;

import java.util.Random;

public class ArrayService <T>{
    static Random random = new Random();

    /** генерирование массива рандомно в заданном диапазоне значений и длине 
     * @param length // длина массива
     * @param valueMin //минимальное значение элемента
     * @param valueMax //максимальное значение элемента
     * @return // возвращаем массив
     */
    public Integer[] getRandomArray(int length, int valueMin, int valueMax){
        Integer[] array = new Integer[random.nextInt(length, length + 2)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(valueMin, valueMax +1);
        }
        return array;
    }


    /** вывод на консоль массива
     * @param array // массив
     */
    public void showArray(T[] array){
        for (T item : array) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }


}
