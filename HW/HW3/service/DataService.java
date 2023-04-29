package HW.HW3.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import HW.HW3.MyExeptions.MyExeptionDateFalse;
import HW.HW3.MyExeptions.MyExeptionEmptyString;
import HW.HW3.MyExeptions.MyExeptionListSize;
import HW.HW3.model.Person;

public class DataService {
    
    public DataService() {
    }


    /** метод парсит строку в линкидлист
     * @param data строка на вход от пользователя
     * @return возвращаем распарсенный линкедлист
     * @throws MyExeptionEmptyString Исключение - пустая строка
     */
    public List<String> parseStringIntoSheet(String data) throws MyExeptionEmptyString{
        List<String> personList = new LinkedList<>();
        
        if (data.isEmpty()) {
            throw new MyExeptionEmptyString("Пустая строка!");
        } else{
            personList = Arrays.asList(
                data.replaceAll("\\s+", " ").split(" "));

        }
         return personList;
    }


    /** Проверка валидности спасрсенных введенных  данных на 
     *  количество данных, валидность даты, телефона, пола
     * @param data введенные данные от пользователя
     * @return true или false результат проверки 
     * @throws MyExeptionEmptyString Исключение - пустая строка
     * @throws MyExeptionListSize Исклоючение - длина листа не соответствует необходимой
     * @throws MyExeptionDateFalse Исключение - дата больше текущей даты
     */
    public boolean parseValidator(String data) throws MyExeptionEmptyString, MyExeptionListSize, MyExeptionDateFalse{
        List<String> personList = parseStringIntoSheet(data);
        return (new Validator().scannereValidator(personList) && 
            new Validator().dateValidator(personList.get(3)) &&
            new Validator().phoneValidator(personList.get(4)) &&
            new Validator().genderValidator(personList.get(5)));
            
    }


    /**Заполнение данных Персоны на основе введенных пользователем данныхъ
     * @param data введенные данные от пользователя
     * @return Персону
     * @throws MyExeptionEmptyString Исключение - пустая строка
     */
    public Person personData (String data) throws MyExeptionEmptyString{
        List<String> personList = parseStringIntoSheet(data);
        if (personList.get(5).equalsIgnoreCase("ь")){ //если случайно ввели на кирилице
            personList.add(5, "m");
        }
        if (personList.get(5).equalsIgnoreCase("а")){
            personList.add(5, "f");
        }

        Person person = new Person(personList.get(0), 
                                personList.get(1), 
                                personList.get(2), 
                                personList.get(3), 
                                personList.get(4), 
                                personList.get(5));
        return person;

    }
    
}
