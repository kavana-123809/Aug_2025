package javaselenium;

public class Person {

	String FirstName;
	String LastName;
	String PhNo;
	enum gender{M,F};
	
public Person(String firstName, String lastName, char gender, String phonenum) {
		super();
		FirstName = firstName;
		LastName = lastName;
		PhNo = phonenum;

	}
 
public String getFirstName() {
	return FirstName;
}
 
public void setFirstName(String firstName) {
	FirstName = firstName;
}
 
public String getLastName() {
	return LastName;
}
 
public void setLastName(String lastName) {
	LastName = lastName;
}
 
public String getPhNo() {
	return PhNo ;
}
 
public void setPhNo(String phonenum) {
	this.PhNo = phonenum;
	

}
void display() {
	System.out.println("First Name: "+getFirstName());
	System.out.println("Last Name: "+getLastName());
	System.out.println("gender: "+Person.gender.F);
}
void PhNo() {
	System.out.println("Phone number: "+getPhNo());
}
 
public static void main(String[] args) {
	Person p=new Person("Kavana", "SP",'F', "123456789");
	p.display();
	p.PhNo();
}
}


