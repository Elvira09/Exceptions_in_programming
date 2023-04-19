package HW.HW1;

/* Task2
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
возвращающий новый массив, каждый элемент которого равен частному элементов двух в
ходящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
оповестить пользователя. Важно: При выполнении метода единственное исключение, 
которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class Task2 { 

    /** Обработка исключений деления двух массивов поэлементно
     * @param length // длина массива
     * @param valueMin //минимальное значение элемента
     * @param valueMax //максимальное значение элемента
     */
    public void task2(int length, int valueMin, int valueMax){
        Integer[] array1 = new ArrayService<>().getRandomArray(length, valueMin, valueMax);
        System.out.println("Первый массив: ");
        new ArrayService<>().showArray(array1);
        
        Integer[] array2 = new ArrayService<>().getRandomArray(length, valueMin, valueMax);
        System.out.println("Второй массив: ");
        new ArrayService<>().showArray(array2);
        
        try {
            Float[] result = getDivisionArray(array1, array2);
            System.out.println("Результирующий массив: ");
            new ArrayService<>().showArray(result);
        }
        catch (CustomArraySizeException e){
            System.out.println(e.getMessage());
            System.out.printf("\tДлина первого массива: %d\n \tДлина второго массива: %d\n",
                    e.getLength1(), e.getLength2());
        }

    }


    /** Деление поэлементно двух массивов
     * @param array1 // первый массив
     * @param array2 // второй массив
     * @return // результирующий массив
     */
    private Float[] getDivisionArray(Integer[] array1, Integer[] array2){ 
        if (array1 == null || array2 == null)
            throw new NullPointerException("Оба массива должны существовать.");
        if (array1.length != array2.length)
            throw new CustomArraySizeException(
                "Кол-во элементов массива должно быть одинаковым:", 
                array1.length, array2.length);
        
        Float[] result = new Float[array1.length];
        for (int i = 0; i < array1.length; i++)
            result[i] = ((float)array1[i]) / ((float)array2[i]);
        return result;
    }
}
