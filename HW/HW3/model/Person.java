package HW.HW3.model;

public class Person {
    private String name;
    private String surname;
    private String patronymicName;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public Person(String surname, String name, String patronymicName, String dateOfBirth, String phoneNumber,
    String gender) {
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getPatronymicName() {
        return this.patronymicName;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getGender() {
        return this.gender;
    }

   
    @Override
    public String toString() {
        return "<" + surname  + "><" + name + "><" + patronymicName + "><"
                + dateOfBirth + "><" + phoneNumber + "><" + gender + ">";
    }
    


}
