import java.util.Date;

public class Person {   //Super Class
    private String name;
    private String surname;
    private Date dateOfBirth;
    private int mobilNo;

    public Person(String name, String surname, Date dateOfBirth, int mobilNo){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mobilNo = mobilNo;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMobilNo() {
        return mobilNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMobilNo(int mobilNo) {
        this.mobilNo = mobilNo;
    }
}
