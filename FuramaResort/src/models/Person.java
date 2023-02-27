package models;

public abstract class Person {
    private String personName;
    private int personAge;
    private int dayOfBirth;
    private String sex;
    private String personTelephone;

    public Person() {

    }

    public Person(String personName, int personAge, int dayOfBirth, String sex, String personTelephone) {
        this.personName = personName;
        this.personAge = personAge;
        this.dayOfBirth = dayOfBirth;
        this.sex = sex;
        this.personTelephone = personTelephone;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPersonTelephone() {
        return personTelephone;
    }

    public void setPersonTelephone(String personTelephone) {
        this.personTelephone = personTelephone;
    }

    @Override
    public String toString() {
        return "Name :" + personName
                + "Age :" + personAge
                + "Day of birth : " + dayOfBirth
                + "Sex : " + sex
                + "Telephone : " + personTelephone;
    }
}
