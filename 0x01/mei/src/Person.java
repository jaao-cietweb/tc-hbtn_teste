import java.util.Date;

public class Person {
    String name;
    String surname;
    Date birthDate;
    boolean anotherCompanyOwner;
    boolean pensioner;
    boolean publicServer;
    float salary;


    public String fullName(){
        return name + " " + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary(){
        return getSalary() * 12;
    }

    public boolean isMEI(){
        return calculateYearlySalary() < 130000 && (birthDate.before(new Date(2005)))&&
                !anotherCompanyOwner && !pensioner && !publicServer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
