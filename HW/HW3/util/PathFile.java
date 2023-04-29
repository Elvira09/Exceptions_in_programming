package HW.HW3.util;

import HW.HW3.model.Person;

public class PathFile {
    private String path ;

    public PathFile() {
        this.path  = path;
    }

    public String getPath(Person person) {
        this.path = null;
        try {
            return this.path = "/Users/GB/Exceptions_in_programming/HW/HW3/data/"+ person.getSurname() + ".txt";
        } catch (Exception e) {
            System.out.println("Не удалось получить путь к файлу");
        }
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
