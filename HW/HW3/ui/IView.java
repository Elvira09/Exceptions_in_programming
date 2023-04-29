package HW.HW3.ui;

import HW.HW3.myExeptions.MyExeptionDateFalse;
import HW.HW3.myExeptions.MyExeptionListSize;

public interface IView {
    void input();
    void output() throws MyExeptionListSize, MyExeptionDateFalse ;
}
