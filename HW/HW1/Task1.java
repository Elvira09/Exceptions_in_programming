package HW.HW1;

/*
Task1
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен разности элементов двух 
входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
оповестить пользователя.
 */
public class Task1 {

    /** Обработка исключений разности двух массивов поэлементно
     * @param length // длина массива
     * @param valueMin //минимальное значение элемента
     * @param valueMax //максимальное значение элемента
     */
    public void task1(int length, int valueMin, int valueMax){
        Integer[] array1 = new ArrayService<>().getRandomArray(length, valueMin, valueMax);
        System.out.println("Первый массив: ");
        new ArrayService<>().showArray(array1);
        
        Integer[] array2 = new ArrayService<>().getRandomArray(length, valueMin, valueMax);
        System.out.println("Второй массив: ");
        new ArrayService<>().showArray(array2);
        
        try {
            Integer[] result = getDifferenceArray(array1, array2);
            System.out.println("Результирующий массив: ");
            new ArrayService<>().showArray(result);
        }
        catch (CustomArraySizeException e){
            System.out.println(e.getMessage());
            System.out.printf("\tДлина первого массива: %d\n \tДлина второго массива: %d\n",
                    e.getLength1(), e.getLength2());
        }

    }


    /** Разница поэлементно двух массивов
     * @param array1 // первый массив
     * @param array2 // второй массив
     * @return // результирующий массив
     */
    private Integer[] getDifferenceArray(Integer[] array1, Integer[] array2){ 
        if (array1 == null || array2 == null)
            throw new NullPointerException("Оба массива должны существовать.");
        if (array1.length != array2.length)
            throw new CustomArraySizeException(
                "Кол-во элементов массива должно быть одинаковым:", 
                array1.length, array2.length);
        
        Integer[] result = new Integer[array1.length];
        for (int i = 0; i < array1.length; i++)
            result[i] = array1[i] - array2[i];
        return result;
    }
}
