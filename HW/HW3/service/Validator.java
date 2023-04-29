package HW.HW3.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.List;

import HW.HW3.myExeptions.MyExeptionDateFalse;
import HW.HW3.myExeptions.MyExeptionListSize;

public class Validator {
    /*
     * Не сделаны проверки валидности:
     * 1. Имя Фамилия Отчество - не делала проверки на кириллицу и присутствие
     * знаков и цифр
     * имена бывают разные.
     * 2. Телефонны йномер - на длину номера проверку не делала, т.к. может быть
     * короткий городской
     * номер или более длинный другой страны. В данной задаче это , наверное, не
     * принципиально
     */

    public Validator() {
    }

    
    /** проверка валидности количества распарсенных элементов
     * @param personList распарвенный лист для проверки количества элементов
     * @return true или false соответствия количество элементов поданного листа шести
     * @throws MyExeptionListSize Исклоючение - длина листа не соответствует необходимой 
     */
    public boolean scannereValidator(List<String> personList) throws MyExeptionListSize {
        if (personList.size() != 6)
            throw new MyExeptionListSize("", 6, personList.size());
        else
            return true;
        // return (personList.size() == 6);
    }

    
    /** проверка валидности введенных строковых данных дате формата ДД.ММ.ГГГГ
     * @param data введенные данные от пользователя
     * @return true или false соответствия дате в нужном формате
     * @throws MyExeptionDateFalse Исключение - дата больше текущей даты
     */
    public boolean dateValidator(String data) throws MyExeptionDateFalse {
        try {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.uuuu")
                    .withResolverStyle(ResolverStyle.STRICT);
            if (LocalDate.from(dateFormatter.parse(data)).compareTo(LocalDate.now()) > 0) {
                throw new MyExeptionDateFalse("Неверно введенная дата! Человек еще не родился!");
            }
        } catch (DateTimeParseException e) {
            System.out.printf("Введенные данные %s не соответствуют формату даты ДД.ММ.ГГГГ", data);
            return false;
        }
        return true;
    }

    /**проверка вадидности ввода номеру телефона(целому беззнаковому числу (в данном случае типу Float))
     * @param data введенные данные от польтзователя
     * @return true или false соответствия введенных данных типу Float
     */
    public boolean phoneValidator(String data) {
        try {
            Long.parseLong(data);
            return true;
        } catch (RuntimeException e) {
            System.out.printf(
                    "Некорректный ввод данных %s . \nДанные должны содержать целое беззнаковое число без форматирования ", data);
            return false;
        }

    }

    // проверка валидности пола
    /**проверка валидности пола
     * @param data введенные данные от пользователя
     * @return true или false соответствия введенных данных полу
     */
    public boolean genderValidator(String data) {
        if (!((data.equalsIgnoreCase("f") || data.equalsIgnoreCase("m") ||
                data.equalsIgnoreCase("а") || data.equalsIgnoreCase("ь")) &&
                data.length() == 1))
            throw new RuntimeException("Введенные данные не соответствуют заданным");
        else
            return true;
    }

}
