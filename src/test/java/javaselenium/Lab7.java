package javaselenium;

public class Lab7 {
	    String firstName;
	    String lastName;
	    char gender;

	    Lab7(String firstName, String lastName, char gender) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.gender = gender;
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
	    public char getGender() {
	        return gender;
	    }
	    public void setGender(char gender) {
	        this.gender = gender;
	    }

	    public void display() {
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("Gender: " + gender);
	    }

	    public void phNumber(long phNumber) {
	        System.out.println("Phone Number: " + phNumber);
	    }

	    // Main method inside the same class
	    public static void main(String[] args) {
	       Lab7 p = new Lab7("Kavana", "S P", 'F'); 
	        p.display();
	        p.phNumber(123456789); 
	    }
	}








