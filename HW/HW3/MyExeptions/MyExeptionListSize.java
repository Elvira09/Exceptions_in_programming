package HW.HW3.MyExeptions;

public class MyExeptionListSize extends MyExeptions{

    private int length1;
    private int length2;

    /***Исклоючение - длина листа не соответствует необходимой 
     * @param messege длина листа не соответствует необходимой 
     * @param length1 необходимая длина 
     * @param length2 текущая дли на
     */
    public MyExeptionListSize(String messege, int length1, int length2) {
        super(messege);
        this.length1 = length1;
        this.length2 = length2;
    }
    public int getLength1() {
        return length1;
    }
    public int getLength2() {
        return length2;
    }

    
}
