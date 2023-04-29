package HW.HW3.ui;

import java.util.Scanner;

import HW.HW3.MyExeptions.MyExeptionDateFalse;
import HW.HW3.MyExeptions.MyExeptionEmptyString;
import HW.HW3.MyExeptions.MyExeptionListSize;
import HW.HW3.model.Person;
import HW.HW3.service.DataService;
import HW.HW3.util.WriteFile;

public class View implements IView {

    @Override
    public void input() {

        System.out.println("Введите информацию о пользователе через пробел в формате:\n\n" +
                "Фамилия \tИмя \tОтчество \tдата рождения (ДД.ММ.ГГГГ)" +
                "\tномер телефона \tпол (m / f)\n" +
                "НАПРИМЕР: \n\tСмирнова Анна Ивановна 02.07.1995 89111394567 f\n");
    }

    @Override
    public void output() throws MyExeptionListSize, MyExeptionDateFalse {
        String data = null;
        try (Scanner scanner = new Scanner(System.in)) {
            data = scanner.nextLine();
            if (new DataService().parseValidator(data) == true) {
                Person person = new DataService().personData(data);
                new WriteFile().dataWriter(person);
                System.out.println("Запись успешно произведена\n" + person);
            }
        } catch (MyExeptionEmptyString e) {
            System.out.println("Пустая строка!");
        }

    }

}
