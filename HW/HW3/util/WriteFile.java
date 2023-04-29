package HW.HW3.util;

import java.io.FileWriter;
import java.io.IOException;

import HW.HW3.model.Person;

public class WriteFile {

    /**запись данных в файл
     * название файла формируется из фамилии Персоныю
     * если такой фамилии нет - создается новый файл
     * если файл с названием такой фамилии существует - данные дозаписываются 
     * @param person данные Персона
     */
    public void dataWriter(Person person) {
        try (FileWriter writer = new FileWriter(new PathFile().getPath(person), true)) {
            writer.write(person.toString());
            writer.append("\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
