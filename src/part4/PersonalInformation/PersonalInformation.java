package part4.PersonalInformation;

public class PersonalInformation {
    private String firstName;
    private String surName;
    private String identificationNumber;

    public PersonalInformation(String firstName, String surName, String identificationNumber) {
        this.firstName = firstName;
        this.surName = surName;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String toString() {
        return this.surName + ", " + this.firstName + " (" + this.identificationNumber + ")";
    }
}
