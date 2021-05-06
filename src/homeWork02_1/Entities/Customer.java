package homeWork02_1.Entities;

public class Customer {

    private int id;
    private String nationalId;
    private int date;
    private String firstName;
    private String lastName;

    public Customer(){

    }


    public Customer(int id, String firstName, String lastName, String nationalId, int date){
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.nationalId=nationalId;
        this.date=date;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date1, int i, int date) {
        this.date = date;
    }



}
