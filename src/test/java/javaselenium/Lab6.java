package javaselenium;

public class Lab6 {

    String fisrtName;
    String lastName;
    String gender;

    public Lab6(String fisrtName, String lastName, String gender) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public String getFisrtName() {
        return fisrtName;
    }
    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String acceptPhoneNumber(String num) {
        return num;
    }

    public static void main(String[] args) {
        Lab6 p = new Lab6("Kavana", "S P", "F");

        System.out.println("Person Details");
        System.out.println("-----------------");
        System.out.println("FirstName: " + p.getFisrtName());
        System.out.println("LastName: " + p.getLastName());
        System.out.println("Gender: " + p.getGender());
    }
}


