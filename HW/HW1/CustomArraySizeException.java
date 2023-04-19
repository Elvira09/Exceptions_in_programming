package HW.HW1;

public class CustomArraySizeException extends RuntimeException{
    private int length1;
    private int length2;

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    /** Исключение размера массива
     * @param message // текст ошибки
     * @param length1 // длина первого массива
     * @param length2 // длина второго массива
     */
    public CustomArraySizeException(String message, int length1, int length2) {
        super(message);
        this.length1 = length1;
        this.length2 = length2;
    }
}
