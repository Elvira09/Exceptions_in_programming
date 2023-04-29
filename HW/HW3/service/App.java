package HW.HW3.service;

import HW.HW3.myExeptions.MyExeptionDateFalse;
import HW.HW3.myExeptions.MyExeptionListSize;
import HW.HW3.ui.View;

public class App {

    /** Кнопка пуска
     * @throws MyExeptionListSize исключение - длина листа не соответствует необходимой
     * @throws MyExeptionDateFalse Исключение - дата больше текущей даты
     */
    public static void startButton() throws MyExeptionListSize, MyExeptionDateFalse{
        
        new View().input();
        new View().output();
        
    }
}
