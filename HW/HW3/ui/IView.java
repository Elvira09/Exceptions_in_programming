package HW.HW3.ui;

import HW.HW3.MyExeptions.MyExeptionDateFalse;
import HW.HW3.MyExeptions.MyExeptionListSize;

public interface IView {
    void input();
    void output() throws MyExeptionListSize, MyExeptionDateFalse ;
}
