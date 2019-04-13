package Graphs;

public class Customer {


    private String firstName;
    private String surname;
    private int age;

    public Customer(){

    }

    public Customer(String fName, String sName, int age){

        firstName = fName;
        surname = sName;
        this.age = age;

    }

    public void setName(String fName){

        firstName = fName;

    }

    public void setSurname(String sName){

        surname = sName;

    }

    public void setPhoneNum(int sAge){

        age = sAge;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNum(){
        return age;
    }

    @Override
    public String toString(){
        return "getPhoneNum()";
    }
}


